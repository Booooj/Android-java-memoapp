package com.example.memo.database;


import android.provider.BaseColumns;

    public class MemoContract {


        public class Memos implements BaseColumns {
            public static final String TABLE = "notes";
            public static final String COL_CONTENT = "content";
        }


    }
