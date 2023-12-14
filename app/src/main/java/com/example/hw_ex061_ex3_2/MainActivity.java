package com.example.hw_ex061_ex3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void six_clickes(View view) {
        counter ++;
        if(counter <= 6)
        {
            btn.setText("This is a click number: " + counter);
        }
        else
        {
            counter = 0;
            btn.setText("Enough to click. Go to new start!");
        }
    }
}