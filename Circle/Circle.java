package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Circle extends AppCompatActivity {

    private Button submit;
    private EditText input;
    private TextView op;
    private DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        submit = findViewById(R.id.submit_cir);
        input = findViewById(R.id.inp_cir);
        op = findViewById(R.id.op_cir);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double r = Double.parseDouble(input.getText().toString().trim());
                Double area = Math.PI * r * r;
                Double circum = 2 * Math.PI * r;
                String str = "Area: " + df.format(area) + "\n" + "Circumference: " +
                        df.format(circum);
                op.setText(str);
            }
        });
    }
}
