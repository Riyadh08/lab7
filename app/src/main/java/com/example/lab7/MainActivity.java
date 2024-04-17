package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,button1;

    TextView textView,textView1;

    int a=0;
    int b=1;
    int x;
    int evn=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        button1 = findViewById(R.id.button2);
        textView1=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x=a+b;
                a=b;
                b=x;
                textView.setText(Integer.toString(x));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evn+=2;
                textView1.setText(Integer.toString(evn));

            }
        });
    }
}