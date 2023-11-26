package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bienvenido extends AppCompatActivity {

    EditText txt_nombre,txt_anio,txt_mes,txt_dia;
    Button btn_calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        txt_nombre = findViewById(R.id.et_nombre);
        txt_anio = findViewById(R.id.et_anio);
        txt_mes = findViewById(R.id.et_mes);
        txt_dia = findViewById(R.id.et_dia);

        btn_calcular  = findViewById(R.id.bt_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1 = new Intent(Bienvenido.this, Datos.class);
                //Bundle

                obj1.putExtra("nombre", txt_nombre.getText().toString());
                obj1.putExtra("Año", txt_anio.getText().toString());
                obj1.putExtra("mes", txt_mes.getText().toString());
                obj1.putExtra("dia", txt_dia.getText().toString());

                startActivity(obj1);

            }
        });
    }
}