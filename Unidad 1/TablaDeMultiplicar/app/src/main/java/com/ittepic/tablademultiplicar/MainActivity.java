package com.ittepic.tablademultiplicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
    Button btn;
    int n,i=1,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.editText);
        tx1=findViewById(R.id.textView2);
        tx2=findViewById(R.id.textView3);
        tx3=findViewById(R.id.textView4);
        tx4=findViewById(R.id.textView5);
        tx5=findViewById(R.id.textView6);
        tx6=findViewById(R.id.textView7);
        tx7=findViewById(R.id.textView8);
        tx8=findViewById(R.id.textView9);
        tx9=findViewById(R.id.textView10);
        tx10=findViewById(R.id.textView11);
        btn=findViewById(R.id.calcular);

    }
    public void calcular(){
        n=Integer.parseInt(et.getText().toString());
        if (i<=10){
            r=i*n;
            tx1.setText(i+" X "+n+"="+r);
            i++;
        }
    }
}
