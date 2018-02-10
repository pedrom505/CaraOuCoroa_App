package com.decisionmind.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView jogar_ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar_ImageView = findViewById(R.id.jogar_ImageViewID);

        jogar_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rand = new Random();
                int randomNumber;
                randomNumber = rand.nextInt(2);

                Intent intencao = new Intent(MainActivity.this, DetalheActivity.class);
                intencao.putExtra("valor", randomNumber);

                startActivity(intencao);
            }
        });


    }
}
