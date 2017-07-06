package com.example.ajinkyaladkhedkar.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1, button2, button3, button4;
    private TextView view1;
    private EditText edit1, edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        view1 = (TextView) findViewById(R.id.text1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();

        switch (v.getId()){
            case R.id.button1:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                view1.setText(String.valueOf(addition));
                break;
            case R.id.button2:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                view1.setText(String.valueOf(subtraction));
                break;
            case R.id.button3:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                view1.setText(String.valueOf(multiply));
                break;
            case R.id.button4:
                int divide = Integer.parseInt(num1) / Integer.parseInt(num2);
                view1.setText(String.valueOf(divide));
                break;
        }
    }
}
