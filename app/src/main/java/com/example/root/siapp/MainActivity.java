package com.example.root.siapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1,t2,t3;
Button b1;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t=findViewById(R.id.t);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=t1.getText().toString().trim();
                String s2=t2.getText().toString().trim();
                String s3=t3.getText().toString().trim();

                long P=Long.parseLong(t1.getText().toString().trim());
                double R=Double.parseDouble(t2.getText().toString().trim());
                double T=Double.parseDouble(t3.getText().toString().trim());

                if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
                {
                   t.setText("");
                    Toast.makeText(MainActivity.this, "Enter all the fields", Toast.LENGTH_SHORT).show();
                }
                else if(P>=9000000L || R>=100.0 || T>=90.0)
                {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    t.setText("");
                    double si;
                    long p=Long.parseLong(t1.getText().toString().trim());
                    double r=Double.parseDouble(t2.getText().toString().trim());
                    double tr=Double.parseDouble(t3.getText().toString().trim());
                    si=((p*r*tr)/100);
                    t.setText(si+"");

                }

            }
        });
    }
}
