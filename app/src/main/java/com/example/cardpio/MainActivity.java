package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public static final String TITULO = "com.example.cardpio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirHamburguer(View v){
        Intent intent = new Intent(this, ProdutosActivity.class );
        intent.putExtra(TITULO, "Hamburguer");

        startActivity(intent);
    }
    public void abrirRisoto(View v){
        Intent intent = new Intent(this, ProdutosActivity.class );
        intent.putExtra(TITULO, "Risoto");

        startActivity(intent);

    }
    public void abrirCuscuz(View v){
        Intent intent = new Intent(this, ProdutosActivity.class );
        intent.putExtra(TITULO, "Cuscuz");

        startActivity(intent);

    }
    public void abrirTubaina(View v){
        Intent intent = new Intent(this, ProdutosActivity.class );
        intent.putExtra(TITULO, "Tubaina");

        startActivity(intent);

    }



}

