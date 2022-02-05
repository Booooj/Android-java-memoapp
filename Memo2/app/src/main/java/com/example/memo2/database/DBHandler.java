package com.example.memo.database;



public class DBHandler extends SQLiteOpenHelper {

    public static final String DB_NAME ="Memo.db";
    public static final int DB_VERSION =1;
    private SQLiteDatabase db;

    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
      String MEMO_TABLE = "CREATE TABLE "+ Memo.MemoDetails.TABLE_NAME+" ("+
              Memo.MemoDetails.COL_ID+" INTEGER PRIMARY KEY, " +
              Memo.MemoDetails.COL_NAME + " TEXT)";

        db.execSQL(MEMO_TABLE);
    }
   public boolean addMemo(int id,String content){
        SQLiteDatabase db = getWritableDatabase();
      
    }
