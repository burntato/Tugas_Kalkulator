package com.example.tugas_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText editText_Input1, editText_Input2;
    TextView textView_Operator, textView_hasil;
    Button button_plus, button_minus, button_kali, button_bagi;
    Button button_Kalkulasi;
    int a, b;
    int tumbal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Input1 = findViewById(R.id.editText_Input1);
        editText_Input2 = findViewById(R.id.editText_Input2);
        textView_Operator = findViewById(R.id.textView_Operator);
        textView_hasil = findViewById(R.id.textView_hasil);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_kali = findViewById(R.id.button_kali);
        button_bagi = findViewById(R.id.button_bagi);
        button_Kalkulasi = findViewById(R.id.button_Kalkulasi);

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Operator.setText("+");
                tumbal = 1;
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Operator.setText("-");
                tumbal = 2;
            }
        });

        button_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Operator.setText("x");
                tumbal = 3;
            }
        });

        button_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Operator.setText(":");
                tumbal = 4;
            }
        });

        button_Kalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(editText_Input1.getText().toString());
                b = Integer.parseInt(editText_Input2.getText().toString());

                if(tumbal == 1) {
                    textView_hasil.setText(a + b + "");
                } else if (tumbal == 2) {
                    textView_hasil.setText(a - b + "");
                } else if (tumbal == 3) {
                    textView_hasil.setText(a * b + "");
                } else if (tumbal == 4) {
                    textView_hasil.setText(a / b + "");
                } else {
                    textView_hasil.setText("0");
                }
            }
        });
    }
}