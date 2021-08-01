package com.example.caio.appbase;

import android.content.Intent;
import android.icu.math.BigDecimal;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irparatela2(View view){
        //navegação entre telas, na qual o usuário clica no botão iniciar
        //e já redirecionado para segunda tela.

        Intent intent1 = new Intent(getApplicationContext(),tela2.class);
        startActivity(intent1);

    }

}
