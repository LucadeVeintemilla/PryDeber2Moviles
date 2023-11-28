package com.example.prylog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalla4 extends AppCompatActivity {
    TextView lblResultado3, lblResultado4, lblResultado5, lblResultado6;
    EditText txtPalindromo, txtCopicua, txtAngulo;
    Button btn_palind, btn_copicua, btn_angulo, btn_limpiar3, btn_limpiar4, btn_limpiar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        /*Codigo Ejercicio 3*/
        txtPalindromo= findViewById(R.id.et_palabra);
        btn_palind  = findViewById(R.id.bt_palindromo);
        lblResultado3 = findViewById(R.id.tv_palindromo);
        btn_limpiar3 = findViewById(R.id.bt_limpiar3);

        /*Codigo Ejercicio 4*/
        txtCopicua= findViewById(R.id.et_copicua);
        btn_copicua  = findViewById(R.id.bt_copicua);
        lblResultado4 = findViewById(R.id.tv_copicua);
        btn_limpiar4 = findViewById(R.id.bt_limpiar4);

        /*Codigo Ejercicio 5*/
        txtAngulo= findViewById(R.id.et_angulo);
        btn_angulo  = findViewById(R.id.bt_angulo);
        lblResultado5 = findViewById(R.id.tv_anguloSexagesimal);
        lblResultado6 = findViewById(R.id.tv_anguloCentesimal);
        btn_limpiar5 = findViewById(R.id.bt_limpiar5);

        /*Paso de Parametros*/
        Bundle miBundle = this.getIntent().getExtras();
        String nombre= miBundle.getString("nombre");

        /*Boton Ejercicio 3*/
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

        btn_limpiar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPalindromo.getText().clear();
                lblResultado3.setText("");
            }
        });

        /*Boton Ejercicio 4*/
        btn_copicua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = txtCopicua.getText().toString();
                int longitud = numero.length();

                for (int i = 0; i < longitud / 2; i++) {
                    if (numero.charAt(i) != numero.charAt(longitud - 1 - i)) {
                        lblResultado4.setText(numero + " no es un copicua.");
                    }else{
                        lblResultado4.setText(numero + " es un copicua.");
                    }
                }
            }
        });

        btn_limpiar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCopicua.getText().clear();
                lblResultado4.setText("");
            }
        });

        /*Boton Ejercicio 5*/
        btn_angulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = txtAngulo.getText().toString();
                Float angulo = Float.parseFloat(numero);

                String sexagesimalesDos = String.format("%.2f", angulo * 180/Math.PI);
                String centesimalesDos = String.format("%.2f", angulo * 200/Math.PI);

                lblResultado5.setText(sexagesimalesDos + " sexagesimales");
                lblResultado6.setText(centesimalesDos + " centesimales");
            }
        });
        btn_limpiar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAngulo.getText().clear();
                lblResultado5.setText("");
                lblResultado6.setText("");
            }
        });

        Button btnRegresar2 = findViewById(R.id.btn_regresar2);
        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}