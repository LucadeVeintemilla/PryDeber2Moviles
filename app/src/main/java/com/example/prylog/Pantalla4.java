package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalla4 extends AppCompatActivity {

    TextView lblResultado3;
    EditText txtPalindromo;
    Button btn_palind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        txtPalindromo= findViewById(R.id.et_palabra);
        btn_palind  = findViewById(R.id.bt_palindromo);
        Bundle miBundle = this.getIntent().getExtras();
        String nombre= miBundle.getString("nombre");

        btn_palind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palindromo = txtPalindromo.getText().toString();

                if (!palindromo.isEmpty()) {
                    // Elimina los espacios y convierte a minúsculas para la comparación
                    palindromo = palindromo.replaceAll("\\s", "").toLowerCase();

                    int longitud = palindromo.length();

                    // Compara los caracteres desde el principio hasta la mitad y desde el final hasta la mitad
                    boolean esPalindromo = true;
                    for (int i = 0; i < longitud / 2; i++) {
                        if (palindromo.charAt(i) != palindromo.charAt(longitud - 1 - i)) {
                            esPalindromo = false;
                            break; // Si hay una diferencia, no es un palíndromo
                        }
                    }

                    // Muestra el resultado en un TextView (reemplaza R.id.lblResultadoPalindromo con tu propio identificador)

                    if (esPalindromo) {
                        lblResultado3.setText( palindromo + " es un palíndromo.");
                    } else {
                        lblResultado3.setText( palindromo + " no es un palíndromo.");
                    }
                } else {
                    // Muestra un mensaje si el campo está vacío
                    Toast.makeText(getApplicationContext(), "Por favor, ingresa una palabra antes de verificar.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}