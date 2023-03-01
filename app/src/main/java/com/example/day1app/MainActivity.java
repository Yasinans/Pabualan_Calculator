package com.example.day1app;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn7);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //aa
            }
        });
    }

}
