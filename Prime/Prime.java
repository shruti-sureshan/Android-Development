package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prime extends AppCompatActivity {

    private Button submit;
    private EditText inp;
    private TextView op;

    public static boolean checkPrime(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i == 0)
                count += 1;
        }

        if(count == 2)
            return true;
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        submit = findViewById(R.id.submit_prime);
        inp = findViewById(R.id.inp_prime);
        op = findViewById(R.id.op_prime);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.valueOf(inp.getText().toString().trim());
                if(checkPrime(num))
                    op.setText("Prime: True");
                else
                    op.setText("Prime: False");
            }
        });
    }
}
