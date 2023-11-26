package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {

    TextView lblResultado1, lblResultado2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        lblResultado1 = findViewById(R.id.tv_resultado1);
        lblResultado2 = findViewById(R.id.tv_resultado2);

        Bundle miBundle = this.getIntent().getExtras();
        String numero= miBundle.getString("nombre");


        //String anio = miBundle.getString("anio");
        //String mes = miBundle.getString("mes");

        //String dia = miBundle.getString("dia");

        //lblResultado1.setText("Bienvenido " + nombre + "Año " + anio + "Mes " + mes + "dia " + dia);



    }
}