package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText etNumberOne;
    EditText etNumberTwo;
    Button btnSubtract;
    Button btnAdd;
    String result;
    TextView tvResult;
    Button btnLogs;
    Button btnMulti;
    Button btnDivide;

    private List<String> log = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnAdd = findViewById(R.id.btnAdd);
        tvResult = findViewById(R.id.tvResult);
        btnLogs = findViewById(R.id.btnLogs);
        btnMulti = findViewById(R.id.multiNumber);
        btnDivide = findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add add = new Add(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                result = add.calcAdd(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Addition: " + result);

            }
        });

        btnLogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LogsActivity.class);
                intent.putStringArrayListExtra("LogsResult",
                        (ArrayList<String>) log);
                startActivity(intent);
            }
        });


        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtract subtract = new Subtract(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                result = subtract.calcSubtract(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Subtraction: " + result);


            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply multiply = new Multiply(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                result = multiply.calcMultiply(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Multiplication: " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide divide = new Divide(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                result = divide.calcDivide(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Division: " + result);
            }
        });

    }




    }














