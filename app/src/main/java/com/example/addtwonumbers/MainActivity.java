package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        mul = (Button) findViewById(R.id.btnMul);
        div = (Button) findViewById(R.id.btnDiv);

        Answer = (TextView) findViewById(R.id.txtResult);
        //add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int sum = myNumber1 + myNumber2;
                Answer.setText("Answer: " + sum);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int sum = myNumber1 - myNumber2;
                Answer.setText("Answer: " + sum);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int sum = myNumber1 * myNumber2;
                Answer.setText("Answer: " + sum);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                NumberFormat nf = new DecimalFormat("##.###");
                double sum = (double) myNumber1 / myNumber2;
                Answer.setText("Answer: " + nf.format(sum));

            }
        });
    }
}