package com.example.memo2;

import androidx.appcompat.app.AppCompatActivity;

public class Post extends AppCompatActivity {
  
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_activity);
      
       Button btn_Back = findViewById(R.id.btn_back);
        btn_Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), MainActivity.class);
            startActivity(intent);
          
           SQLiteDatabase db = mHelper.getWritableDatabase();
                            ContentValues values = new ContentValues();
                            values.put(MemoContract.Memo.COL_CONTENT, content);
          
             db.close();
}
