package com.example.alunos.exerciciolistactivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.alunos.exerciciolistactivity.adapter.PessoaAdapter;
import com.example.alunos.exerciciolistactivity.model.Pessoa;

import java.util.ArrayList;

public class mostrarListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mostrar_lista_dinamica);
        //ListView listview = (ListView) findViewById(R.id.listview);
        Intent it = getIntent();

        ArrayList<Pessoa> lista = it.getParcelableArrayListExtra("ag");
        setListAdapter(new PessoaAdapter(this, lista));
    }
}
