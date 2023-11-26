package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {

    TextView lblResultado1, lblResultado2;
    EditText txtNumero;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        txtNumero= findViewById(R.id.et_numero);
        btn_calcular  = findViewById(R.id.bt_calcular);

        lblResultado1 = findViewById(R.id.tv_resultado1);
        lblResultado2 = findViewById(R.id.tv_resultado2);

        Bundle miBundle = this.getIntent().getExtras();
        String nombre= miBundle.getString("nombre");
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num= txtNumero.getText().toString();
                int numero = Integer.parseInt(num);
                int factorial=1;
                for (int i = 1; i<=numero;++i){

                    factorial*=i;

                }
                lblResultado1.setText("Bienvenido, " + nombre +   " tu numero factorial es: "+factorial);
            }
        });



        //String anio = miBundle.getString("anio");
        //String mes = miBundle.getString("mes");

        //String dia = miBundle.getString("dia");

        //lblResultado1.setText("Bienvenido " + nombre);



    }
}