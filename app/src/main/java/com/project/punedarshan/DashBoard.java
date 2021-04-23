package com.project.punedarshan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class DashBoard extends AppCompatActivity {

    NeumorphCardView cardForts,cardtem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

            cardForts = findViewById(R.id.cardForts);
            cardForts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DashBoard.this,Forts.class);
                    startActivity(intent);
                }
            });
            cardtem = findViewById(R.id.cardTemple);
            cardtem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(DashBoard.this,Temples.class);
                    startActivity(intent);
                }
            });


    }
}