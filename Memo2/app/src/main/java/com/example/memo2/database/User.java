package com.example.usermanegement.database;

import android.provider.BaseColumns;

public class User {
    private User(){

    }
    public static final class UserDetails implements BaseColumns{
        public static final String TABLE_NAME ="user";
        public static final String COL_ID ="id";
        public static final String COL_NAME ="name";

    }
}
