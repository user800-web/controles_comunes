package com.example.controles_comunes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText txtNumID;
    private EditText txtNombres;
    private EditText txtFechaNac;
    private EditText txtCiud;
    private RadioGroup grupo;
    private EditText txtCorreo;
    private EditText txtTelefono;
    String genero = "Masculino" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grupo = (RadioGroup) findViewById(R.id.radioGSexo);
    }
    public void btnEnviar(View view){
        //Obtener datos de la actividad
        txtNumID = (EditText) findViewById(R.id.txtNumID);
        txtNombres = (EditText) findViewById(R.id.txtNombres);
        txtFechaNac = (EditText) findViewById(R.id.txtFechaNac);
        txtCiud = (EditText) findViewById(R.id.txtCiud);
        //obtener radioGroup seleccionado

        if (grupo.getCheckedRadioButtonId() == R.id.radioM) {
            genero = "Masculino";
        } else {
            genero = "Femenino";
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