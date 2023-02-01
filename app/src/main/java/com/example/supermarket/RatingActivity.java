package com.example.supermarket;

import static android.icu.text.DisplayContext.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;


public class RatingActivity extends AppCompatActivity  {




    //Objects in class later to be init
//Holds the id after save to check dup
String checker;
    Button backButton,saveButton;
    RatingBar produceRate,cheeseSelectRate,meatDepRate,liquorRate, checkoutRate;
    TextView averageRating,updateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        //Unwraps bundle from intent
        Bundle extras = getIntent().getExtras();
        //Need key set string
        String supermarketName = extras.getString("marketName");
        String supermarketAddress = extras.getString("marketAddress");

        //Creating Objects
        updateText = findViewById(R.id.uploadedText);
        updateText.setVisibility(View.INVISIBLE);
        backButton = findViewById(R.id.backButton);
        saveButton = findViewById(R.id.saveButton);
        produceRate = findViewById(R.id.produceRatingBar);
        cheeseSelectRate = findViewById(R.id.cheeseRatingBar);
        meatDepRate = findViewById(R.id.meatRatingBar);
        liquorRate = findViewById(R.id.liquorRatingBar);
        checkoutRate = findViewById(R.id.checkoutRatingBar);
        averageRating = findViewById(R.id.averageNum);
//Set default ratings
        produceRate.setRating(3f);
        cheeseSelectRate.setRating(3f);
        meatDepRate.setRating(3f);
        liquorRate.setRating(3f);
        checkoutRate.setRating(3f);


        //Setting listeners for interactive objects




        //Back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            launchMain(view);
            }
        });
        //Save button
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Supermarket supermarket = new Supermarket();
                supermarket.setSupermarketName(supermarketName);
                supermarket.setAddress(supermarketAddress);
//Get float from rating bar references
                float produceRating = produceRate.getRating();
                float cheeseSelRating = cheeseSelectRate.getRating();
                float meatDepRating = meatDepRate.getRating();
                float liquorRating = liquorRate.getRating();
                float checkoutRating = checkoutRate.getRating();
//Set to class
                supermarket.setProduceDeptRate(produceRating);
                supermarket.setCheeseSelRate(cheeseSelRating);
                supermarket.setMeatDeptRate(meatDepRating);
                supermarket.setLiquorDeptRate(liquorRating);
                supermarket.setCheckoutRate(checkoutRating);
//Get average
                Float average = (produceRating+cheeseSelRating+meatDepRating+liquorRating+checkoutRating)/5;

                averageRating.setText(""+average);
//Update to Database
DatabaseHandler db = new DatabaseHandler(RatingActivity.this);
    if(db.addData(supermarket)){
        updateText.setVisibility(View.VISIBLE);
        updateText.setText(getResources().getString(R.string.addDatatrue));
        updateText.setTextColor(getResources().getColor(R.color.Green));
    }else {
        updateText.setVisibility(View.VISIBLE);
        updateText.setText(getResources().getString(R.string.addDatafalse));
        updateText.setTextColor(getResources().getColor(R.color.Red));
    }
            }
        });
        //Produce rating

    }


private void launchMain(View v){
    Intent i = new Intent(RatingActivity.this, MainActivity.class);
    i.setFlags(i.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(i);
    }


}


