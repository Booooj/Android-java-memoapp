package com.example.usermanegement.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    public static final String DB_NAME ="User.db";
    public static final int DB_VERSION =1;
    private SQLiteDatabase db;

    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
      String USER_TABLE = "CREATE TABLE "+ User.UserDetails.TABLE_NAME+" ("+
              User.UserDetails.COL_ID+" INTEGER PRIMARY KEY, " +
              User.UserDetails.COL_NAME + " TEXT)";

        db.execSQL(USER_TABLE);
    }
   public boolean addUser(int id,String name){
        SQLiteDatabase db = getWritableDatabase();
       ContentValues values = new ContentValues();
       values.put(User.UserDetails.COL_ID,id);
       values.put(User.UserDetails.COL_NAME,name);
       long sid = db.insert(User.UserDetails.TABLE_NAME,null,values);
       if(sid>0)
           return true;
       else
           return false;
   }

   public boolean updateUser(int id,String name){
        SQLiteDatabase db = getWritableDatabase();
       ContentValues values = new ContentValues();
       values.put(User.UserDetails.COL_NAME,name);
        long sid = db.update(User.UserDetails.TABLE_NAME,values,User.UserDetails.COL_ID+"=?",new String[]{String.valueOf(id)});
       if(sid>0)
           return true;
       else
           return false;
    }

    public boolean deleteUser(int id){
        SQLiteDatabase db = getWritableDatabase();

        long sid = db.delete(User.UserDetails.TABLE_NAME,User.UserDetails.COL_ID+"=?",new String[]{String.valueOf(id)});
        if(sid>0)
            return true;
        else
            return false;
    }

    @SuppressLint("Range")
    public ArrayList<String> getUsers() {
        ArrayList<String> list = new ArrayList<>();
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.query(User.UserDetails.TABLE_NAME,
                new String[]{User.UserDetails.COL_NAME},
                null,
                null,
                null,
                null,
                null);
        while (cursor.moveToNext()) {
            list.add(cursor.getString(cursor.getColumnIndex(User.UserDetails.TABLE_NAME)));
        }
            return list;
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        }
    }
