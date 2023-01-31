package com.example.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Objects in the class later to be initizilized
EditText enterSupermarketName,enterSupermarketAddress;
Button rateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Reference buttons and other controls
        enterSupermarketName = findViewById(R.id.enterName);
        enterSupermarketAddress = findViewById(R.id.enterAddress);
        rateButton = findViewById(R.id.rateButton);


        //Listener Setup

        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRate(view);

            }
        });


    }

//Launch Activity buttons
private void launchRate(View v){
        Intent i = new Intent(MainActivity.this, RatingActivity.class);
        i.setFlags(i.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("marketName", enterSupermarketName.getText().toString());
        i.putExtra("marketAddress", enterSupermarketAddress.getText().toString());
        startActivity(i);
}

}