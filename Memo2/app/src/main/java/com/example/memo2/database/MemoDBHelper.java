package com.example.memo2.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MemoDBHelper extends SQLiteOpenHelper {
        public static final String DB_NAME = "memos.db";
        public static final int DB_VERSION = 1;
    private SQLiteDatabase db;

    public MemoDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
        @Override
        public void onCreate(SQLiteDatabase db) {
            String createTable = "CREATE TABLE " + MemoContract.notes.TABLE + " ( " +
                    MemoContract.Memos._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    MemoContract.Memos.COL_CONTENT + " TEXT NOT NULL);";

            db.execSQL(createTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + MemoContract.notes.TABLE);
            onCreate(db);
        }
    }

