package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EditText[] misCampos = {editApellido,};
        public boolean validarCampoVacio(EditText[] campos){

            for(int i=0; i<campos.length; i++){
            String cadena = campos[i].getText().toString();
            if(cadena.trim().isEmpty()){
                return true;
            }

        }
            return false;
        }
    }
}
