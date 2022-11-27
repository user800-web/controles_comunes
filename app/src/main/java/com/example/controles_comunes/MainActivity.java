package com.example.controles_comunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNumID;
    private EditText txtNombres;
    private EditText txtFechaNac;
    private EditText txtCiud;
    private CheckBox seleccion;
    private EditText txtCorreo;
    private EditText txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviar(View view){
        //Obtener datos de la actividad
        txtNumID = (EditText) findViewById(R.id.txtNumID);
        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtFechaNac = (EditText) findViewById(R.id.txtFechaNac);
        txtCiud = (EditText) findViewById(R.id.txtCiud);
        //obtener checkbox seleccionado
        String genero = "Masculino";
        seleccion = (CheckBox) findViewById(R.id.chechFem);
        if(seleccion.isSelected()){
            genero= "Femenino";
        }

        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);

        //Ingresar datos en Array
        String [] datos = new String[]{txtNumID.getText().toString(), txtNombres.getText().toString(), txtFechaNac.getText().toString(),
        txtCiud.getText().toString(), genero, txtCorreo.getText().toString(), txtTelefono.getText().toString()};

        Bundle envia= new Bundle();
        envia.putStringArray("listaDatos", datos);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        intent.putExtras(envia);
        startActivity(intent);
    }
}