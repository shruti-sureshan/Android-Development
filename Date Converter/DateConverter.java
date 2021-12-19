package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DateConverter extends AppCompatActivity {

    private Button submit;
    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_converter);

        submit = findViewById(R.id.submit_date);
        input = findViewById(R.id.inp_date);
        output = findViewById(R.id.op_date);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int days = Integer.parseInt(input.getText().toString().trim());
                int years = days / 365;
                int months = (days % 365) / 30;
                int pending_days = (days % 365) % 30;

                String res = "Years: " + years + " Months: " + months + " Days: " + pending_days;
                output.setText(res);
            }
        });
    }
}
