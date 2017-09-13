package com.example.alunos.exerciciolistactivity;



        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;

class MainActivity​ extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showList(View v) {
        Intent it = new Intent(this, mostrarListaDinamica.class);
        startActivity(it);
    }
}
