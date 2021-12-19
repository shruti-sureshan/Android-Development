package com.example.allprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Palindrome extends AppCompatActivity {

    private Button submit;
    private EditText inp;
    private TextView op;

    public static boolean checkPalindrome(String s){
        List<Character> characters = new ArrayList<>();
        for(int i=s.length()-1; i>=0; i--){
            characters.add(s.charAt(i));
        }

        String rev = "";
        for(Character c: characters)
            rev += c;

        if(rev.equals(s))
            return true;
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        submit = findViewById(R.id.submit_palin);
        inp = findViewById(R.id.inp_palin);
        op = findViewById(R.id.op_palin);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = inp.getText().toString().trim();
                if(checkPalindrome(s))
                    op.setText("Palindrome: True");
                else
                    op.setText("Palindrome: False");
            }
        });
    }
}
