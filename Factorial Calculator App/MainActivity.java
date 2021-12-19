package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText n;
    EditText r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        n= findViewById(R.id.editText);
        r=findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1=Integer.parseInt(n.getText().toString());
                double e1;
                double c;
                double fact=1;
                for (c = 1; c <= n1; c++)
                    fact = fact * c;

                r.setText(String.valueOf(fact));


            }
        });

    }
}

