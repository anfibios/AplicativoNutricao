package com.example.caio.appbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StatusDoImc extends AppCompatActivity {

    TextView textResultado2;
    TextView textObservacao2;
    TextView textPesoEstim2;
    String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_do_imc);


        textResultado2 = (TextView) findViewById(R.id.textResultado2);
        String resp = getIntent().getStringExtra("Chave1");
        textResultado2.setText(resp);

        textPesoEstim2 = (TextView) findViewById(R.id.textPesoEstim2);
        String pesoestim = getIntent().getStringExtra("Chave2");
        textPesoEstim2.setText(pesoestim);

        textObservacao2 = (TextView) findViewById(R.id.textObservacao2);
        String tag = getIntent().getStringExtra("Chave3");
        textObservacao2.setText(tag);


    }

    public void sair(View v) {
        Toast.makeText(getBaseContext(), "Até a próxima", Toast.LENGTH_LONG).show();
        finish();
    }

    public void IrParaProfissionais(View v) {
        Intent intent3 = new Intent(getApplicationContext(), TelaDeProfissionais.class);
        startActivity(intent3);
        finish();
    }

    public void voltar(View view) {
        Intent intent4 = new Intent(getApplicationContext(), tela2.class);
        startActivity(intent4);
        finish();
    }
}

