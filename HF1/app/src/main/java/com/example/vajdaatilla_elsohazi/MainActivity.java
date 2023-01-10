package com.example.vajdaatilla_elsohazi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1 = findViewById(R.id.ElsoSzam);
        EditText number2 = findViewById(R.id.MasodikSzam);
        TextView eredmeny = findViewById(R.id.textView);
        Button osszead = findViewById(R.id.button);
        Button szoroz = findViewById(R.id.button2);
        Button kivon = findViewById(R.id.button3);
        Button oszt = findViewById(R.id.button4);

        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a;
                a = Double.parseDouble(number1.getText().toString()) + Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });

        szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a;
                a = Double.parseDouble(number1.getText().toString()) * Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a;
                a = Double.parseDouble(number1.getText().toString()) - Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });

        oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a;
                a = Double.parseDouble(number1.getText().toString()) / Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });
    }
}