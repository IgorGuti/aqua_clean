package com.example.aquaclean;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pagina2 extends AppCompatActivity {
    private TextView recuperar;
    private TextView link_create;

    private Button logar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina2); // Define o layout da segunda atividade

        recuperar = findViewById(R.id.textButton);
        link_create = findViewById(R.id.link_create);
        logar = findViewById(R.id.logando);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina2.this, pagina4.class);
                startActivity(intent);
            }
        });
        link_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina2.this, pagina3.class);
                startActivity(intent);
            }
        });
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina2.this, pagina_principal.class);
                startActivity(intent);
            }
        });

    }
}
