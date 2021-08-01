package com.example.caio.appbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.view.View;


public class TelaDeProfissionais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_profissionais);
    }
    public void dados_adventista(View view) {
        //navegação entre telas, na qual o usuário clica no botão iniciar
        //e já redirecionado para segunda tela.

        Intent intent6 = new Intent(getApplicationContext(), DadosDoCliente.class);
        startActivity(intent6);

    }

   public void Voltar_Tela_Status(View v){
        Intent intent5 = new Intent(TelaDeProfissionais.this, StatusDoImc.class);

        startActivity(intent5);
    }
    public void Santo_alberto (View view){
        Intent intent7 = new Intent(getApplicationContext(),HospSantoAlberto.class);
        startActivity(intent7);
    }
    public void santaJulia (View view){
        Intent intent8 = new Intent(getApplicationContext(),HopSantaJulia.class);
        startActivity(intent8);
    }
}
