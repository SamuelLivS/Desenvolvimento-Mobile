//               PÃO!!!!!!!
//pacote da aplicação
package com.example.aula_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

// a linha 9 é a declaração da classe principal do programa
public class MainActivity extends AppCompatActivity {
    // aqui as variaveis são de escopo GLOBAL
    //CTRL + ALT + L indenta o código
    //Sempre antes do @Override nós devemos declarar os componentes


    //Não são variáveis, mas sim objetos.
    EditText nome, sobrenome;
    Button concatenar;
    TextView saida;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //método inicial
        // aqui as variaveis são de escopo LOCAL
        super.onCreate(savedInstanceState);
        // A linha abaixo mostra a TELA que criamos (layout)
        setContentView(R.layout.activity_main);

        // aqui vamos associar os componentes do layout com as
        //variáveis que vão receber os objs declarados acima
        nome = findViewById(R.id.editTextNome);//findViewById vai buscar lá no layout e atribuir a essa variável
        sobrenome = findViewById(R.id.editTextSobrenome);
        concatenar = findViewById(R.id.buttonConcatenar);
        saida = findViewById(R.id.textViewSaida);

        // vamos usar o botão para capturar o evento do click
        concatenar.setOnClickListener(new View.OnClickListener() { //clicar no botão
            @Override

            public void onClick(View v) {

                // pega o valor digitado no campo (componente) nome
                String vNome = nome.getText().toString();
                String vSobrenome = sobrenome.getText().toString();
                //Atribui um valor texto para o objeto saída, usando
                saida.setText(vNome + " " + vSobrenome);

                // atribui os valores de forma direta (sem o toString()), porque
                // já existe uma concatenação de Strings, ou seja o espaço
                //saida.setText(nome.getText() + " " + sobrenome.getText());

                // COLINHA
                // conversão String para numérico
                int n = Integer.parseInt(nome.getText().toString());
                double d = Double.parseDouble("10");

                // de numérico para String
                String x = String.valueOf(d);
            }


        });
    }
}