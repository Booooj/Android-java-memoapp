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
    
}
