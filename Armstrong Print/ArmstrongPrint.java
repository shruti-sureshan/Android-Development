package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmstrongPrint extends AppCompatActivity {

    private Button submit;
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
        setContentView(R.layout.activity_armstrong_print);

        submit = findViewById(R.id.submit_arm_p);
        op = findViewById(R.id.op_arm_p);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                for(int i=1; i<=1000; i++){
                    if(checkArmstrong((long)i))
                        result += i + " ";
                }
                op.setText(result);
            }
        });
    }
}
