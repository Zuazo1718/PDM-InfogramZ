package com.zuazo.infogramz;

//cambie estas 3 lineas de codigo para solucionar tu error
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// Seras pendejo que no tenia q ir el .app
//import androidx.appcompat.app.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;


/**import androidx.appcompat.app.AppCompatActivity;

 import android.os.Bundle;
 import android.widget.Toolbar;*/

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        showToolBar(getString(R.string.title_crear_cuenta), true);


    }


    public void showToolBar(String titulo, boolean botonSubir){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }
}




























