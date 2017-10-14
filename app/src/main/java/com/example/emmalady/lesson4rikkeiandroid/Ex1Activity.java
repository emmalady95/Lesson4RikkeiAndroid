package com.example.emmalady.lesson4rikkeiandroid;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

public class Ex1Activity extends AppCompatActivity {

    public static final String JAPAN_LANGUAGE_SYMBOL = "ja";
    public static final String VIETNAM_LANGUAGE_SYMBOL = "vi";
    public static final String LAOS_LANGUAGE_SYMBOL = "lo";
    public static final String THAILAND_LANGUAGE_SYMBOL = "th";
    public static final String ENGLISH_LANGUAGE_SYMBOL = "en";

    ImageView imgLaosFlag;
    ImageView imgThailandFlag;
    ImageView imgVietnamFlag;
    ImageView imgUKFlag;
    ImageView imgJapanFlag;

    Button btNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        imgFindViewById();
        btFindViewById();

        //Change Laguage
        imgJapanFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(JAPAN_LANGUAGE_SYMBOL);
            }
        });
        imgVietnamFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(VIETNAM_LANGUAGE_SYMBOL);
            }
        });
        imgUKFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(ENGLISH_LANGUAGE_SYMBOL);
            }
        });
        imgLaosFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(LAOS_LANGUAGE_SYMBOL);
            }
        });
        imgThailandFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLanguage(THAILAND_LANGUAGE_SYMBOL);
            }
        });

        //Next Activity
        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ex1Activity.this, Ex2Activity.class);
                startActivity(i);
            }
        });
    }

    public void imgFindViewById(){
        imgLaosFlag = (ImageView) findViewById(R.id.imgLaos);
        imgThailandFlag = (ImageView) findViewById(R.id.imgThailand);
        imgVietnamFlag = (ImageView) findViewById(R.id.imgVietnam);
        imgUKFlag = (ImageView) findViewById(R.id.imgUK);
        imgJapanFlag = (ImageView) findViewById(R.id.imgJapan);
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
        Intent iChangeLang = new Intent(Ex1Activity.this, Ex1Activity.class);
        startActivity(iChangeLang);
    }
}
