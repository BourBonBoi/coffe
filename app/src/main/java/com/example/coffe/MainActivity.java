package com.example.coffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonEnter);
    }
    public void next(View view) {
        Intent intent = new Intent(MainActivity.this, tabActivity.class);
        startActivity(intent);
    }
}
