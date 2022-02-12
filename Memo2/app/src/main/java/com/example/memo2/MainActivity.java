package com.example.memo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
      private MemoDBHelper mHelper;
    private ListView memoListView;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
       Button goButton = findViewById(R.id.go_button);

        goButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(), Post.class);
            startActivity(intent);
        });
}
      private void show() {
     
      SQLiteDatabase db = dbHelper.getWritableDatabase();
      Cursor cursor = db.query(MemoContract.Memo.TABLE,
                new String[]{MemoContract.Memo._ID, MemoContract.Memo.COL_CONTENT},
                null, null, null, null, null);
      }
      cursor.close();
       db.close();
    }

  public void delete(View view) {
         
        db.close();
        show();
    }
}
