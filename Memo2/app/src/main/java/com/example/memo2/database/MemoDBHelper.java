package com.example.memo.database;

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
            String createTable = "CREATE TABLE " + MemoContract.Memos.TABLE + " ( " +
                    MemoContract.Memos._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    MemoContract.Memos.COL_content + " TEXT NOT NULL);";

            db.execSQL(createTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + MemoContract.Memos.TABLE);
            onCreate(db);
        }
    }
