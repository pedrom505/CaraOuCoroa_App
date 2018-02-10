package com.decisionmind.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView moeda;
    private ImageView voltar_ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        moeda = findViewById(R.id.moeda_ImageViewID);
        voltar_ImageView = findViewById(R.id.voltar_ImageViewID);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            int valorGerado = extra.getInt("valor");

            if (valorGerado == 0){
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else {
                moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }

        }

        voltar_ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intencao = new Intent(DetalheActivity.this, MainActivity.class);
                startActivity(intencao);
            }
        });

    }
}
