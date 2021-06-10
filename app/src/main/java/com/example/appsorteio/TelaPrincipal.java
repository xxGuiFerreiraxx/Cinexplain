package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaPrincipal extends AppCompatActivity {

   ImageView menu;
   Button filme1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        menu = findViewById(R.id.img_menu);
        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, MenuTela.class);
                startActivity(intent);


            }
        });

        filme1 = findViewById(R.id.btn_filme1);
        filme1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TelaPrincipal.this, filme1.class);
            startActivity(intent);

        }
    });

        }



    }