package com.example.aquaclean;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class atividade extends AppCompatActivity {

    private Button botao;
    private Button link_criar_conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina1); // Define o layout inicial

        botao = findViewById(R.id.login_inicial);

        link_criar_conta = findViewById(R.id.criar_conta);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(atividade.this, pagina2Activity.class);
                startActivity(intent);
            }
        });

        link_criar_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(atividade.this, pagina3.class);
                startActivity(intent);
            }
        });
    }
}






