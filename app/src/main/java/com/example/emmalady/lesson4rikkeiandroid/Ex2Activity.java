package com.example.emmalady.lesson4rikkeiandroid;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

public class Ex2Activity extends AppCompatActivity {

    public static final String ARAB_LANGUAGE_SYMBOL = "ar";
    public static final String MONGOLIAN_LANGUAGE_SYMBOL = "mn";
    public static final String RUSSIAN_LANGUAGE_SYMBOL = "ru";

    ImageView imgArabFlag;
    ImageView imgMongoliaFlag;
    ImageView imgRussiaFlag;

    Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
        imgFindViewById();
        btFindViewById();

        //Change Language
        imgArabFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(ARAB_LANGUAGE_SYMBOL);
            }
        });
        imgMongoliaFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(MONGOLIAN_LANGUAGE_SYMBOL);
            }
        });
        imgRussiaFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(RUSSIAN_LANGUAGE_SYMBOL);
            }
        });

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ex2Activity.this, Ex3Activity.class);
                startActivity(i);
            }
        });
    }

    public void imgFindViewById() {
        imgArabFlag = (ImageView) findViewById(R.id.imgArab);
        imgMongoliaFlag = (ImageView) findViewById(R.id.imgMongolia);
        imgRussiaFlag = (ImageView) findViewById(R.id.imgRussia);
    }
    public void btFindViewById(){
        btNext = (Button) findViewById(R.id.btNext);
    }

    public void changeLanguage(String languageSymbol){
        Locale locale = new Locale(languageSymbol);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        Intent iChangeLang = new Intent(Ex2Activity.this, Ex2Activity.class);
        startActivity(iChangeLang);
    }
}
