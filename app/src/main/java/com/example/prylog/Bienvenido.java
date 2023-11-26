package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Bienvenido extends AppCompatActivity {

    EditText txt_nombre;
    Button btn_ir;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        txt_nombre = findViewById(R.id.et_nombre);


        btn_ir  = findViewById(R.id.bt_ir);



        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonId = radioGroup.getCheckedRadioButtonId();

                if (radioButtonId == R.id.radioButton1) {
                    // Ir a la Pantalla 1
                    Intent intent = new Intent(Bienvenido.this, Pantalla3.class);
                    intent.putExtra("nombre", txt_nombre.getText().toString());
                    startActivity(intent);
                } else if (radioButtonId == R.id.radioButton2) {
                    // Ir a la Pantalla 2
                    Intent intent = new Intent(Bienvenido.this, Pantalla4.class);
                    intent.putExtra("nombre", txt_nombre.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
}