package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class Largest extends AppCompatActivity {

    private Button submit;
    private EditText n1, n2, n3;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_largest);

        submit = findViewById(R.id.submit_largest);
        n1 = findViewById(R.id.inp_large_n1);
        n2 = findViewById(R.id.inp_large_n2);
        n3 = findViewById(R.id.inp_large_n3);
        output = findViewById(R.id.op_largest);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(n1.getText().toString().trim());
                float num2 = Float.parseFloat(n2.getText().toString().trim());
                float num3 = Float.parseFloat(n3.getText().toString().trim());

                float big = num3 > ((num1 > num2) ? num1 : num2) ? num3 : (num1 > num2) ? num1 : num2;
                output.setText(String.valueOf(big));
            }
        });
    }
}
