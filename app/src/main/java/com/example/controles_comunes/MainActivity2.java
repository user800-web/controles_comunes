package com.example.controles_comunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView lblNumIdDos;
    private TextView lblnombresDos;
    private TextView lblFechaDos;
    private TextView lblCiudadDos;
    private TextView lblGeneroDos;
    private TextView lblCorreoDos;
    private TextView lblTelefDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lblNumIdDos = findViewById(R.id.lblNumIdDos);
        lblnombresDos = findViewById(R.id.lblnombresDos);
        lblFechaDos = findViewById(R.id.lblFechaDos);
        lblCiudadDos = findViewById(R.id.lblCiudadDos);
        lblGeneroDos = findViewById(R.id.lblGeneroDos);
        lblCorreoDos = findViewById(R.id.lblCorreoDos);
        lblTelefDos = findViewById(R.id.lblTelefDos);

        Bundle recibe= getIntent().getExtras();
        String[] guardaDatos= recibe.getStringArray("listaDatos");

        lblNumIdDos.setText(guardaDatos[0]);
        lblnombresDos.setText(guardaDatos[1]);
        lblFechaDos.setText(guardaDatos[2]);
        lblCiudadDos.setText(guardaDatos[3]);
        lblGeneroDos.setText(guardaDatos[4]);
        lblCorreoDos.setText(guardaDatos[5]);
        lblTelefDos.setText(guardaDatos[6]);
    }
    public void btnRegresar(View view) {
        Intent intentd = new Intent(this, MainActivity.class);
        startActivity(intentd);
    }

}