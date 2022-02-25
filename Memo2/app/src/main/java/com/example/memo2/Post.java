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
           });
       final EditText memo = new EditText(this);
                    btn_save = (Button) findViewById(R.id.btn_save);
            btn_save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String content = memo.getText().toString();
                   
                }}
