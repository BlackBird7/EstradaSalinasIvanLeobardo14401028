package com.ittepic.tdm_proyectou4juego_ivanleobardoestradasalinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ParaLienzo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo(this));
    }
}
