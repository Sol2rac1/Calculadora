package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView suma = findViewById(R.id.suma);
        ImageView resta = findViewById(R.id.resta);
        ImageView multi = findViewById(R.id.multiplicacion);
        ImageView divisio = findViewById(R.id.division);


        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        divisio.setOnClickListener(this);
        multi.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView resul = findViewById(R.id.resultat);

        int n01 = Integer.parseInt(num1.getText().toString());
        int n02 = Integer.parseInt(num2.getText().toString());
        int resultat;

        ImageView operacio = (ImageView) view;

        if(operacio.getId()== R.id.suma)
        {
            resultat=n01+n02;
            resul.setText(n01+" + "+n02+" = "+resultat);
        }
        else if(operacio.getId()== R.id.resta)
        {
            resultat=n01-n02;
            resul.setText(n01+" - "+n02+" = "+resultat);
        }
        else if(operacio.getId()== R.id.multiplicacion)
        {
            resultat=n01*n02;
            resul.setText(n01+" * "+n02+" = "+resultat);
        }
        else if(operacio.getId()== R.id.division)
        {
            resultat=n01/n02;
            resul.setText(n01+" / "+n02+" = "+resultat);
        }
        num1.setText("");
        num2.setText("");
    }
}