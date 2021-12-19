package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SimpleAndCompoundInterest extends AppCompatActivity {

    private Button submit_si, submit_ci;
    private EditText rate_si, rate_ci, principal_si, principal_ci, time_si, time_ci, n_ci;
    private TextView output_si, output_ci;

    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_compound_interest);

        submit_si = findViewById(R.id.submit_si);
        output_si = findViewById(R.id.op_si);
        rate_si = findViewById(R.id.inp_si_rate);
        principal_si = findViewById(R.id.inp_si_principal);
        time_si = findViewById(R.id.inp_si_time);

        submit_ci = findViewById(R.id.submit_ci);
        output_ci = findViewById(R.id.op_ci);
        rate_ci = findViewById(R.id.inp_ci_rate);
        principal_ci = findViewById(R.id.inp_ci_principal);
        time_ci = findViewById(R.id.inp_ci_time);
        n_ci = findViewById(R.id.inp_ci_n);

        submit_si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double principal = Double.parseDouble(principal_si.getText().toString().trim());
                double rate = Double.parseDouble(rate_si.getText().toString().trim());
                int time = Integer.parseInt(time_si.getText().toString().trim());

                double si = (principal*rate*time) / 100;
                output_si.setText(String.valueOf(df.format(si)));
            }
        });

        submit_ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double principal = Double.parseDouble(principal_ci.getText().toString().trim());
                double rate = Double.parseDouble(rate_ci.getText().toString().trim());
                int time = Integer.parseInt(time_ci.getText().toString().trim());
                int n = Integer.parseInt(n_ci.getText().toString().trim());

                double ci = principal*(Math.pow(1+(rate/n), n*time)) - principal;
                System.out.println(ci);
                output_ci.setText(String.valueOf(df.format(ci)));
            }
        });
    }
}
