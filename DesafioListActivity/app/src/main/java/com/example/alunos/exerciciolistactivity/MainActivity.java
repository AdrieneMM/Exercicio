package com.example.alunos.exerciciolistactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import com.example.alunos.exerciciolistactivity.model.Pessoa;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showList(View v) {
        Intent it = new Intent(this, mostrarListaDinamica.class);
        it.putParcelableArrayListExtra("ag",lista);
        startActivity(it);
    }
    public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void salvar(View v){

        EditText nomeBox = (EditText)findViewById(R.id.nomeBox);
        String nome = nomeBox.getText().toString();
        EditText telefoneBox = (EditText)findViewById(R.id.telefoneBox);
        String telefone = telefoneBox.getText().toString();
        EditText idadeBox = (EditText)findViewById(R.id.idadeBox);
        int idade = Integer.parseInt(idadeBox.getText().toString());


        lista.add(new Pessoa(nome, telefone, idade));

    }

}
