package com.example.shoikat.birsrestho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.shoikat.birsrestho.Birsrestho.HamidurActivity;
import com.example.shoikat.birsrestho.Birsrestho.MatiurRahmanActivity;
import com.example.shoikat.birsrestho.Birsrestho.MohiuddinActivity;
import com.example.shoikat.birsrestho.Birsrestho.MostofaKamalActivity;
import com.example.shoikat.birsrestho.Birsrestho.MunsiAbdurRaufActivity;
import com.example.shoikat.birsrestho.Birsrestho.NurMohammadActivity;
import com.example.shoikat.birsrestho.Birsrestho.RuhulAminActivity;

public class BirsresthoActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonMohiuddin, buttonHamidur, buttonMostofaKamal, buttonRuhulAmin, buttonMotiur, buttonMunsiAbdur, buttonNurMohammad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birsrestho);

        buttonMohiuddin=(Button)findViewById(R.id.buttonMohiuddin);
        buttonMohiuddin.setOnClickListener(this);

        buttonHamidur=(Button)findViewById(R.id.buttonHamidur);
        buttonHamidur.setOnClickListener(this);

        buttonMostofaKamal=(Button)findViewById(R.id.buttonMostofaKamal);
        buttonMostofaKamal.setOnClickListener(this);

        buttonRuhulAmin=(Button)findViewById(R.id.buttonRuhulAmin);
        buttonRuhulAmin.setOnClickListener(this);

        buttonMotiur=(Button)findViewById(R.id.buttonMotiur);
        buttonMotiur.setOnClickListener(this);


        buttonMunsiAbdur=(Button)findViewById(R.id.buttonMunsiAbdur);
        buttonMunsiAbdur.setOnClickListener(this);


        buttonNurMohammad=(Button)findViewById(R.id.buttonNurMohammad);
        buttonNurMohammad.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==buttonMohiuddin){
            Intent i= new Intent(BirsresthoActivity.this, MohiuddinActivity.class);
            startActivity(i);
        }

        if(v==buttonHamidur){
            Intent i= new Intent(BirsresthoActivity.this, HamidurActivity.class);
            startActivity(i);
        }

        if(v==buttonMostofaKamal){
            Intent i= new Intent(BirsresthoActivity.this, MostofaKamalActivity.class);
            startActivity(i);
        }

        if(v==buttonRuhulAmin){
            Intent i= new Intent(BirsresthoActivity.this, RuhulAminActivity.class);
            startActivity(i);
        }

        if(v==buttonMotiur){
            Intent i= new Intent(BirsresthoActivity.this, MatiurRahmanActivity.class);
            startActivity(i);
        }

        if(v==buttonMunsiAbdur){
            Intent i= new Intent(BirsresthoActivity.this, MunsiAbdurRaufActivity.class);
            startActivity(i);
        }

        if(v==buttonNurMohammad){
            Intent i= new Intent(BirsresthoActivity.this, NurMohammadActivity.class);
            startActivity(i);
        }

    }
}
