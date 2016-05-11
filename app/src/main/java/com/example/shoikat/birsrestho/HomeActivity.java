package com.example.shoikat.birsrestho;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class HomeActivity extends ActionBarActivity implements View.OnClickListener {

    LinearLayout linearLayoutHome;

    Button buttonBirsrestho,buttonBiruttom, buttonBikrom, buttonBirprotik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        linearLayoutHome=(LinearLayout)findViewById(R.id.linearLayoutHome);






        buttonBirsrestho=(Button)findViewById(R.id.buttonBirsrestho);
        buttonBirsrestho.setOnClickListener(this);

        buttonBiruttom=(Button)findViewById(R.id.buttonBiruttom);
        buttonBiruttom.setOnClickListener(this);

        buttonBikrom=(Button)findViewById(R.id.buttonBirbikrom);
        buttonBikrom.setOnClickListener(this);

        buttonBirprotik=(Button)findViewById(R.id.buttonBirprotik);
        buttonBirprotik.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(v==buttonBirsrestho){

            Intent i=new Intent(HomeActivity.this,BirsresthoActivity.class);
            startActivity(i);

        }

        if(v==buttonBiruttom){

            Intent i=new Intent(HomeActivity.this,BiruttomActivity.class);
            startActivity(i);

        }

        if(v==buttonBikrom){

            Intent i=new Intent(HomeActivity.this,BirbikromActivity.class);
            startActivity(i);

        }

        if(v==buttonBirprotik){

            Intent i=new Intent(HomeActivity.this,BirprotikActivity.class);
            startActivity(i);

        }

    }
}
