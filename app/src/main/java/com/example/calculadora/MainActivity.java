package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        txtNmr2 = findViewById(R.id.txtNmr2);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void somar(View view) {
        int valor1 = Integer.parseInt(txtNmr1.getText().toString());
        int valor2 = Integer.parseInt(txtNmr2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(txtNmr1.getText().toString());
        int valor2 = Integer.parseInt(txtNmr2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void Multiplicar(View view) {
        int valor1 = Integer.parseInt(txtNmr1.getText().toString());
        int valor2 = Integer.parseInt(txtNmr2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 / valor2));
    }

    public void Dividir(View view) {
        int valor1 = Integer.parseInt(txtNmr1.getText().toString());
        int valor2 = Integer.parseInt(txtNmr2.getText().toString());
        tvResultado.setText(String.valueOf(valor1 * valor2));
    }
}