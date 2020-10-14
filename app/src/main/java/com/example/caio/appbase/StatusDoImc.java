package com.example.caio.appbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatusDoImc extends AppCompatActivity {

    private TextView textResultado;
    private TextView textObservacao;
    private TextView textPesoEstim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_do_imc);

        textResultado = (TextView) findViewById(R.id.textResultado);
        String resp = getIntent().getStringExtra("Chave");
        textResultado.setText(resp);
    }
}
