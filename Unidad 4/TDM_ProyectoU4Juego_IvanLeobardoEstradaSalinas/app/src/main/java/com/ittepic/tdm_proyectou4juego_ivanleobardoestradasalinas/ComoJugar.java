package com.ittepic.tdm_proyectou4juego_ivanleobardoestradasalinas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ComoJugar extends AppCompatActivity {
    TextView tvCerrar,tvAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_jugar);

        tvAceptar =  findViewById(R.id.tv4);
        tvCerrar =  findViewById(R.id.tv5);


        tvCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaJugar = new Intent(ComoJugar.this, ParaLienzo.class);
                startActivity(pantallaJugar);
            }
        });
    }
}
