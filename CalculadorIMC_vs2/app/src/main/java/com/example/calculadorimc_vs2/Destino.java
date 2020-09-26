package com.example.calculadorimc_vs2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Destino extends Activity {
    TextView peso, altura;
    Button btFechar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        peso = findViewById(R.id.textViewPeso);
        altura = findViewById(R.id.textViewAltura);
        btFechar = findViewById(R.id.buttonFechar);

        // criar o correio que vai receber o pacote
        Intent correio = getIntent();

        // retiramos o pacote de dentro do correio
        Bundle pacote = correio.getExtras();

        //atribuir o valor das variáveis aos obetos do layout
        peso.setText(pacote.getString("varPeso"));
        altura.setText(pacote.getString("varAltura"));

        btFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
