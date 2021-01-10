package com.example.caio.appbase;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;
    private TextView textObservacao;
    private TextView textPesoEstim;
    private TextView textErroAltura;
    String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editPeso = (EditText) findViewById(R.id.editPeso);
        editAltura = (EditText) findViewById(R.id.editAltura);
        textResultado = (TextView) findViewById(R.id.textResultado);
        textObservacao = (TextView) findViewById(R.id.textObservacao);
        textPesoEstim = (TextView) findViewById(R.id.textPesoEstim);
        textErroAltura = (TextView) findViewById(R.id.textErroAltura);
    }

    public void tela2 (View view) {



        String peso1 =" ";
        String altura1 =" ";

        peso1=editPeso.getText().toString();
        altura1=editAltura.getText().toString();
        double peso=Double.parseDouble(peso1.replace( "," ,  "."));
        double altura=Double.parseDouble(altura1.replace(",", "."));


        double resp = peso/(altura*altura);
        double pesoestim = (22.83*(altura*altura));

        if (altura<1.40 && altura>2.30){
            textErroAltura.setText("Digite uma altura entre 1.40 a 2.30 tente novamente!");
        }
        else  if(resp >= 1.0 && resp <=18.49){
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Voçê está abaixo do peso, os risco causados são unhas e cabelos secos e quebradiços, pele seca, incapacidade de se concentrar, esquecimento, exaustão, irritabilidade, perda de apetite, dor nas articulações, vertigem, sensação de desmaio, dores de cabeça");
        }
        else if(resp >= 18.5 && resp <=24.99 ){
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Voçê está com peso normal, continue assim que legal!");
        }
        else if(resp >=25.0 && resp <=29.99){
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Você está com sobrepeso, os risco causados são diabetes tipo 2, dislipidemia (com colesterol HDL baixo e triglicérides altos), ácido úrico aumentado, hipertensão, entre outras.");
        }
        else if(resp >=30.0 && resp <=34.99){
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Você está com obesidade classe 1, os risco causados são diabetes, hipertensão arterial, o infarto do miocárdio e diversos tipos de câncer.");
        }
        else if(resp >=35.0 && resp <=39.99){
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Você está com obesidade classe 2, 2º A endocrinologista Lia Lima alerta que os riscos associados à obesidade de grau II, são os mesmos, porém mais acentuados.\"Entre eles cito a esteatose hepática, doenças articulares, hipertensão, diabetes mellitus, síndrome metabólica, cânceres, infarto agudo do miocárdio e acidente vascular cerebral.");
        }
        else{
            textResultado.setText(String.valueOf(resp).format("Seu IMC é = %.2f",resp));
            textPesoEstim.setText(String.valueOf(pesoestim).format("O seu Peso Estimado poderia ser = %.2f Kg",pesoestim));
            textObservacao.setText("Você está com obesidade classe 3, de acordo com o estudo elaborado pela psicóloga Jena Hanay os risco causados são entre as patologias associadas a este estado nutricional estão os distúrbios hormonais, cardiopatias, morte súbita, dermatites, osteoporose, hipertensão, hepatopatias e insuficiência venosa. Porém, segundo a Organização Mundial de Saúde (OMS), a obesidade de grau III é a principal causa de morte evitável do mundo.");
        }
        Intent intent2 = new Intent(tela2.this, StatusDoImc.class);
        // Bundle status = new Bundle();

        intent2.putExtra("Chave1",textResultado.getText().toString());
        intent2.putExtra("Chave2",textPesoEstim.getText().toString());
        intent2.putExtra("Chave3",textObservacao.getText().toString());

        startActivity(intent2);
        finish();

    }
    }

