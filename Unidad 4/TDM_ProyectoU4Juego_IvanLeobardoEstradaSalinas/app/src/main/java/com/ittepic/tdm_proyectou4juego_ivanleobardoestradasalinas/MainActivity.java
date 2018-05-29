package com.ittepic.tdm_proyectou4juego_ivanleobardoestradasalinas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView jugar,acerca_de,salir,comoJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jugar= findViewById(R.id.jugar);
        acerca_de= findViewById(R.id.acerca_de);
        salir= findViewById(R.id.salir);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaJugar= new Intent(MainActivity.this, ComoJugar.class);
                startActivity(pantallaJugar);
            }
        });

        acerca_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaAcercaDe = new Intent(MainActivity.this, AcercaDe.class);
                startActivity(pantallaAcercaDe);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
