package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cardpio.modelos.Produto;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {


    private TextView textView;
    private ArrayList<Produto>  produtos = new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageViewCategoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        textView = findViewById(R.id.produtotext);
        textView.setText(titulo);

        linearLayout = findViewById(R.id.layout);
        imageViewCategoria = findViewById(R.id.image_view_categoria);

        criarProduto(titulo);
        listarProdutos();

    }

    public void criarProduto(String titulo){

        if(titulo.equals("Hamburguer")){
            imageViewCategoria.setImageResource(R.drawable.hamburguer);

            produtos.add(new Produto(
                    "Hamburguer Vegano",

                    20.90,
                    "Hamburgueres",
                    "Alface,tomate,beringela,pão"));


            produtos.add(new Produto(
                    "Hamburguer de picanha",
                    25.90,
                    "Hamburgueres",
                    "Pão,Picanha,alface,tomate"));

        }
        else if(titulo.equals("Tubaina")){
            imageViewCategoria.setImageResource(R.drawable.tubaina);

            produtos.add(new Produto("Tubaima",
                    5.90,
                    "Bebida",
                    "Gostosa"));
            produtos.add(new Produto("Coca-cola",
                    10.00,
                    "Bebida",
                    "Rato"));

        }
        else if(titulo.equals("Cuscuz")){
            imageViewCategoria.setImageResource(R.drawable.cuscuz);

            produtos.add(new Produto("Cuscuz",
                    10.90,
                    "Doce",
                    "Gostoso"));
            produtos.add(new Produto("Pudim",
                    0.90,
                    "Doce",
                    "Rei da abobrinha"));

        }
        else if(titulo.equals("Risoto")){
            imageViewCategoria.setImageResource(R.drawable.risoto);

            produtos.add(new Produto("Risoto",

                    11.90,
                    "Risoto",
                    "Risoto de limão"));

        }
    }
    public void listarProdutos(){

        for(int i=0; i<produtos.size(); i++) {


            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDescricao = new TextView(this);

            textViewNome.setText(produtos.get(i).getNome());
            textView.setTextSize(18);




            textViewPreco.setText(produtos.get(i).getPreco().toString().replace(".",","));


            textViewDescricao.setText(produtos.get(i).getDescricao());

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);

        }


    }
}
