package com.hi.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView myblueball;
    private ImageView myyelloball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myblueball= (ImageView) findViewById(R.id.blueball);
        myyelloball= (ImageView) findViewById(R.id.yellowball);
        myblueball.setOnClickListener(this);
        myyelloball.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.blueball :
                //Toast.makeText(MainActivity.this,"blue",Toast.LENGTH_SHORT).show();
                Intent myintention = new Intent(MainActivity.this, BioActivity.class);
                myintention.putExtra("name","cat");
                myintention.putExtra("description","I am a good cat");
                startActivity(myintention);
                break;

             case R.id.yellowball :
                 Intent myintentiondog = new Intent(MainActivity.this, BioActivity.class);
                 myintentiondog.putExtra("name","dog");
                 myintentiondog.putExtra("description","I am a good dog");
                 startActivity(myintentiondog);


            //Toast.makeText(MainActivity.this,"yellow",Toast.LENGTH_SHORT).show();
            break;

        }
    }
}
