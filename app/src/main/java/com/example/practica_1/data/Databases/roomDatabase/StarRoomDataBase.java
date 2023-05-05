package com.example.practica_1.data.Databases.roomDatabase;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.practica_1.data.Databases.Dao.StarDao;
import com.example.practica_1.data.Databases.entity.StarEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {StarEntity.class}, version = 1, exportSchema = false)
public abstract class StarRoomDataBase extends RoomDatabase {
    public abstract StarDao starDao();
    private static volatile StarRoomDataBase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    public static StarRoomDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (StarRoomDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    StarRoomDataBase.class, "star_database")
                            .addCallback(sRoomDatabaseCallback).build();
                }
            }
        }
        return INSTANCE;
    }
    public static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            databaseWriteExecutor.execute(() -> {
                StarDao dao = INSTANCE.starDao();
                dao.deleteAll();
                StarEntity star = new StarEntity("Rigel","B");
                dao.insert(star);
                star = new StarEntity("Vega","A");
                dao.insert(star);
            });
        }
    };
}
