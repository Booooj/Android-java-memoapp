package com.example.memo2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Savebutton;
   
    @Override
    protected void onCreate() {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Savebutton = findViewById(R.id.savebutton);
    }

    public void onSaveButtonClick(View view) {
        EditText etContent = findViewById(R.id.etContent);
        String content = etContent.getText().toString();

        DBHelper helper = new DBHelper(MainActivity.this);
        SQLiteDatabase db = helper.getWritableDatabase();
        //
            String sqlInsert = "INSERT INTO memo (note) VALUES (?)";
        
           
        } finally {
            db.close();
        }

        etContent.setText("");
    }

}
