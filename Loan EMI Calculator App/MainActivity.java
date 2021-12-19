package com.example.emi;

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
    EditText p;
    EditText n;
    EditText r;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        p= findViewById(R.id.editText);
        n=findViewById(R.id.editText2);
        r=findViewById(R.id.editText3);
        e=findViewById(R.id.editText4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double p1=Integer.parseInt(p.getText().toString());
                double n1=Integer.parseInt(n.getText().toString());
                double r1=Integer.parseInt(r.getText().toString());
                double e1;
                e1=(p1*r1)*Math.pow(1+r1,n1)/(Math.pow(1+r1,n1)-1);
                e.setText(String.valueOf(e1));


            }
        });

    }
}
