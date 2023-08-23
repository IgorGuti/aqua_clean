package com.example.aquaclean;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pagina3 extends AppCompatActivity {
    private TextView link_login;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina3); // Define o layout da terceira atividade

        link_login = findViewById(R.id.link_login_volta);

        link_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pagina3.this, pagina2.class);
                startActivity(intent);
            }
        });



    }
}
