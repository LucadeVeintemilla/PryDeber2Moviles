package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bienvenido extends AppCompatActivity {

    EditText txt_nombre;
    Button btn_ir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        txt_nombre = findViewById(R.id.et_nombre);


        btn_ir  = findViewById(R.id.bt_ir);

        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1 = new Intent(Bienvenido.this, Datos.class);
                //Bundle

                obj1.putExtra("nombre", txt_nombre.getText().toString());


                startActivity(obj1);

            }
        });
    }
}