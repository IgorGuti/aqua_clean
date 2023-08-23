package com.example.aquaclean;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pagina2Activity extends AppCompatActivity {
    private TextView recuperar;
    private TextView link_create;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina2); // Define o layout da segunda atividade

        recuperar = findViewById(R.id.textButton);
        link_create = findViewById(R.id.link_create);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina2Activity.this, pagina4.class);
                startActivity(intent);
            }
        });
        link_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina2Activity.this, pagina3.class);
                startActivity(intent);
            }
        });

    }
}
