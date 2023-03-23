package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtNmr1;
    private EditText txtNmr2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNmr1 = findViewById(R.id.txtNmr1);
        txtNmr2 = findViewById(R.id.txtNmr1);
        txtNmr2 = findViewById(R.id.txtNmr1);
    }
}