package com.example.mert.pokemongoelkitabi;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bilgi extends AppCompatActivity {

    TextView tx;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgi);



        sharedPreferences = getPreferences(MODE_PRIVATE);
        editor = sharedPreferences.edit();
        tx=(TextView)findViewById(R.id.textbilgi);

        String tmp = getSharedPreferences("bilgi", MODE_PRIVATE).getString("bilgi", " ");
        tx.setText(tmp);
    }
}
