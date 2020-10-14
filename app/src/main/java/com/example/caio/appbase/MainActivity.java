package com.example.caio.appbase;

import android.content.Intent;
import android.icu.math.BigDecimal;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irparatela2(View view){
        Intent intent1 = new Intent(getApplicationContext(),tela2.class);
        startActivity(intent1);
    }
}

