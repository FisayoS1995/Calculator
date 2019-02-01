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
                result = add(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
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
                result = sub(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Subtraction: " + result);


            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = multiply(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Multiplication: " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = divide(etNumberOne.getText().toString(), etNumberTwo.getText().toString());
                tvResult.setText(result);
                log.add("Result of Division: " + result);
            }
        });

    }


    private String add(String numberOne, String numberTwo) {
        if (numberOne.equals("") || numberTwo.isEmpty()) {
            Toast.makeText(this, "please enter a valid number",  //really useful if you want to show a error message or to inform user to complete a user
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int a = Integer.parseInt(numberOne);
        int b = Integer.parseInt(numberTwo);
        int result = a + b;
        return Integer.toString(result);

    }


    private String sub(String numberOne, String numberTwo) {
        if (numberOne.equals("") || numberTwo.isEmpty()) {
            Toast.makeText(this, "please enter a valid number",  //really useful if you want to show a error message or to inform user to complete a user
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int a = Integer.parseInt(numberOne);
        int b = Integer.parseInt(numberTwo);
        int result = a - b;
        return Integer.toString(result);

    }

    private String multiply(String numberOne, String numberTwo) {
        if (numberOne.equals("") || numberTwo.isEmpty()) {
            Toast.makeText(this, "please enter a valid number",  //really useful if you want to show a error message or to inform user to complete a user
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int a = Integer.parseInt(numberOne);
        int b = Integer.parseInt(numberTwo);
        int result = a * b;
        return Integer.toString(result);

    }

    private String divide(String numberOne, String numberTwo) {
        if (numberOne.equals("") || numberTwo.isEmpty()) {
            Toast.makeText(this, "please enter a valid number",  //really useful if you want to show a error message or to inform user to complete a user
                    Toast.LENGTH_SHORT).show();
            return null;
        }
        int a = Integer.parseInt(numberOne);
        int b = Integer.parseInt(numberTwo);
        int result = a / b;
        return Integer.toString(result);

    }
}




