package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reverse extends AppCompatActivity {

    private Button submit;
    private EditText input;
    private TextView op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        submit = findViewById(R.id.submit_rev);
        input = findViewById(R.id.inp_rev);
        op = findViewById(R.id.op_rev);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = input.getText().toString().trim();
                String rev = "";
                for(int i=in.length()-1; i>=0; i--)
                    rev += in.charAt(i);
                op.setText(rev);
            }
        });
    }
}
