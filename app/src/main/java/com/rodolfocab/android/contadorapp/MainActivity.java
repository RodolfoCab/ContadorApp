package com.rodolfocab.android.contadorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button mBotonContar, mBotonReiniciar;
    private EditText mTextoContar;
    int mcontar = 0;

    @Override
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        mBotonContar = (Button)findViewById(R.id.BotonContar);
        mBotonReiniciar = (Button)findViewById(R.id.BotonReiniciar);
        mTextoContar = (EditText) findViewById(R.id.BotonIncrementar);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcontar++;
                mTextoContar.setText(mcontar+"");

            }
        });




    }