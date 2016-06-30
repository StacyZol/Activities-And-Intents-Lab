package com.example.stacyzolnikov.activitiesandintentslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinishedMadLib extends AppCompatActivity {
    TextView mInsertedAdjectiveOne;
    TextView mInsertedAdjectiveTwo;
    TextView mInsertedNounOne;
    TextView mInsertedNounTwo;
    TextView mInsertedAnimal;
    TextView mInsertedGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_mad_lib);

        Intent intent = getIntent();
        String firstAdjective = intent.getStringExtra("FirstAdjective");

        mInsertedAdjectiveOne = (TextView) findViewById(R.id.inserted_adjective_one);
        mInsertedAdjectiveOne.setText("A vacation is when you take a trip to some " + firstAdjective);

        String secondAdjective = intent.getStringExtra("SecondAdjective");

        mInsertedAdjectiveTwo = (TextView) findViewById(R.id.inserted_adjective_two);
        mInsertedAdjectiveTwo.setText(" place with your " + secondAdjective + " family. ");

        String firstNoun = intent.getStringExtra("FirstNoun");

        mInsertedNounOne = (TextView) findViewById(R.id.inserted_noun_one);
        mInsertedNounOne.setText("Usually, you go to some place that is near a " + firstNoun);

        String secondNoun = intent.getStringExtra("SecondNoun");

        mInsertedNounTwo = (TextView) findViewById(R.id.inserted_noun_two);
        mInsertedNounTwo.setText(" or up on a " + secondNoun +". ");

        String animal = intent.getStringExtra("Animal");

        mInsertedAnimal = (TextView) findViewById(R.id.animal);
        mInsertedAnimal.setText("A good vacation place is one where you can ride " + animal);

        String game = intent.getStringExtra("Game");

        mInsertedGame = (TextView)  findViewById(R.id.game);
        mInsertedGame.setText(" or play" + game + " .");


    }
}
