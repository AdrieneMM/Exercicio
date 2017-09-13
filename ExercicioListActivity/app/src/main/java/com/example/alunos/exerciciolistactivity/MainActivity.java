package com.example.alunos.exerciciolistactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Scanner;

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
        startActivity(it);
    }
    private static Scanner s;
    public void salvar(View v){
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();

        s = new Scanner(System.in);
        EditText nomeBox = (EditText)findViewById(R.id.nomeBox);
        String nomeB = nomeBox.getText().toString();
        EditText telefoneBox = (EditText)findViewById(R.id.telefoneBox);
        String telefoneB = telefoneBox.getText().toString();
        EditText idadeBox = (EditText)findViewById(R.id.idadeBox);
        String idadeB = idadeBox.getText().toString();

    }

}
