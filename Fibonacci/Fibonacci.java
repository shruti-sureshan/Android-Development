package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci extends AppCompatActivity {

    private Button submit;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        submit = findViewById(R.id.submit_fibo);
        input = findViewById(R.id.inp_fibo);
        output = findViewById(R.id.op_fibo);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Integer> series = new ArrayList<>();
                series.add(0);
                series.add(1);

                int n = Integer.parseInt(input.getText().toString().trim());
                for(int i=2; i<n; i++){
                    series.add(series.get(i-1) + series.get(i-2));
                }
                String res = "";
                for(int i: series){
                    res += i + ", ";
                }
                output.setText(res);
            }
        });
    }
}
