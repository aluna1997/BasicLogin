package com.example.latitude.basiclogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creamos objeto boton
        final Button boton = (Button) findViewById(R.id.ingresar);
        //Le damos una acción
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText) findViewById(R.id.txtpassword)).getText().toString();
                if(usuario.equals("fluna99") && password.equals("fealpelu2015")) {
                    Intent nuevaAccion = new Intent(MainActivity.this,Secundario.class);
                    startActivity(nuevaAccion);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
