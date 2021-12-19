package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button add, sub, mul, div;
    private EditText num1, num2;
    private TextView op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        op = findViewById(R.id.op_cal);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString().trim());
                int n2 = Integer.parseInt(num2.getText().toString().trim());

                op.setText(String.valueOf(n1+n2));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString().trim());
                int n2 = Integer.parseInt(num2.getText().toString().trim());

                op.setText(String.valueOf(n1-n2));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString().trim());
                int n2 = Integer.parseInt(num2.getText().toString().trim());

                op.setText(String.valueOf(n1*n2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString().trim());
                int n2 = Integer.parseInt(num2.getText().toString().trim());

                op.setText(String.valueOf(n1/(float)n2));
            }
        });
    }
}
