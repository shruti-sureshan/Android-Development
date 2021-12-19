package com.example.myapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button button;
    EditText email;
    EditText pass;
    String email1 = "",passwd="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        email= findViewById(R.id.editText);
        pass=findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email1 = email.getText().toString();
                passwd = pass.getText().toString();
                if(email1.equals("abc@gmail.com") && passwd.equals("1234")){
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                }
                else{
                    //alertDialog.show();
                    Toast.makeText(MainActivity.this, "Unsuccessful", Toast.LENGTH_SHORT).show();
                }

              //  Intent intent=new Intent(getApplicationContext(),welcome.class);
               // startActivity(intent);
            }
        });

    }
}
