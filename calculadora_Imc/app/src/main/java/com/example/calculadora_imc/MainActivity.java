package com.example.calculadora_imc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    EditText peso, altura;
    Button calcular;
    TextView imc, classificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.editTextPeso);
        altura = findViewById(R.id.editTextAltura);
        calcular = findViewById(R.id.buttonCalcular);
        imc = findViewById(R.id.textViewImc);
        classificacao = findViewById(R.id.textViewClassificaçãoImc);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {
                double vPeso = Double.parseDouble(peso.getText().toString());
                double vAltura = Double.parseDouble(altura.getText().toString());
                double resultado = vPeso / (vAltura * vAltura);
                String[] classImc = {"Abaixo do peso", "Peso ideal (parabéns)", "Levemente acima do peso",
                "Obesidade grau I", "Obesidade grau II (severa)", "Obesidade III (mórbida)"};

                String valueDouble = Double.toString(resultado);

                if (resultado <= 18.5) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[0]);
                }else if(resultado >= 18.6 && resultado <= 24.9 ) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[1]);
                }else if(resultado >= 25 && resultado <= 29.9) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[2]);
                }else if(resultado >= 30 && resultado <= 34.9) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[3]);
                }else if(resultado >= 35 && resultado <= 39.9) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[4]);
                }else if(resultado > 40) {
                    imc.setText(valueDouble);
                    classificacao.setText(classImc[5]);
                }
            }
        });
    }
}