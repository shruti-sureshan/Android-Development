package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class ArmstrongCheck extends AppCompatActivity {

    private Button submit;
    private EditText inp;
    private TextView op;

    public static boolean checkArmstrong(Long num){
        String [] numArr = String.valueOf(num).split("");
        long count = 0;
        for(int i=1; i<numArr.length; i++)
            count += Math.pow(Integer.parseInt(numArr[i]), 3);
        if(count == num)
            return true;
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong_check);

        submit = findViewById(R.id.submit_arm_ch);
        inp = findViewById(R.id.inp_arm_ch);
        op = findViewById(R.id.op_arm_ch);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long in = Long.parseLong(inp.getText().toString().trim());
                if(checkArmstrong(in))
                    op.setText("Armstrong: True");
                else
                    op.setText("Armstrong: False");
            }
        });
    }
}
