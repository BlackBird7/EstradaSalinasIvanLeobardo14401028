package com.ittepic.tdmm_proyecto15_ivanleobardoestradasalinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new DataProvider("This is Gospel", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Miss Jackson", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Vegas Light", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Girl That", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Nicotine", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Collar Full", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("Casual Afrair", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );
        productList.add(
                new DataProvider("The End ", "Panic At The Disco", "COMPRAR",R.drawable.imagen1)
        );

        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);
    }
}
