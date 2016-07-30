package com.example.mert.pokemongoelkitabi;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Bilgi extends AppCompatActivity {

    TextView tx,tx1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgi);

        imageView=(ImageView)findViewById(R.id.imageView7);

        sharedPreferences = getPreferences(MODE_PRIVATE);
        editor = sharedPreferences.edit();

        Typeface face1= Typeface.createFromAsset(getAssets(),"terim.ttf");
        tx=(TextView)findViewById(R.id.textbilgi);
        tx1=(TextView)findViewById(R.id.pokeIsım);
        tx1.setTypeface(face1);
        String tmp = getSharedPreferences("bilgi", MODE_PRIVATE).getString("bilgi", " ");
        String pokeIsım = getSharedPreferences("isim", MODE_PRIVATE).getString("isim", " ");
        int i = getSharedPreferences("position",MODE_PRIVATE).getInt("position",0);
        tx.setText(tmp);
        tx1.setText(pokeIsım);

        //
        switch (i){

            case 0:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 1:
                imageView.setImageResource(R.drawable.iki);
                break;
            case 2:
                imageView.setImageResource(R.drawable.uc);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dort);
                break;
            case 4:
                imageView.setImageResource(R.drawable.bes);
                break;
            case 5:
                imageView.setImageResource(R.drawable.alti);
                break;
            case 6:
                imageView.setImageResource(R.drawable.yedi);
                break;
            case 7:
                imageView.setImageResource(R.drawable.sekiz);
                break;
            case 8:
                imageView.setImageResource(R.drawable.dokuz);
                break;
            case 9:
                imageView.setImageResource(R.drawable.on);
                break;
            case 10:
                imageView.setImageResource(R.drawable.onbir);
                break;
            case 11:
                imageView.setImageResource(R.drawable.oniki);
                break;
            case 12:
                imageView.setImageResource(R.drawable.onuc);
                break;
            case 13:
                imageView.setImageResource(R.drawable.ondort);
                break;
            case 14:
                imageView.setImageResource(R.drawable.onbes);
                break;
            case 15:
                imageView.setImageResource(R.drawable.onalti);
                break;
            case 16:
                imageView.setImageResource(R.drawable.onyedi);
                break;
            case 17:
                imageView.setImageResource(R.drawable.onsekiz);
                break;
            case 18:
                imageView.setImageResource(R.drawable.ondokuz);
                break;
            case 19:
                imageView.setImageResource(R.drawable.yirmi);
                break;
            case 20:
                imageView.setImageResource(R.drawable.yirmibir);
                break;
            case 21:
                imageView.setImageResource(R.drawable.yirmiki);
                break;
            case 22:
                imageView.setImageResource(R.drawable.yirmiuc);
                break;
            case 23:
                imageView.setImageResource(R.drawable.yirmidort);
                break;
            case 24:
                imageView.setImageResource(R.drawable.yirmibes);
                break;
            case 25:
                imageView.setImageResource(R.drawable.yirmialti);
                break;
            case 26:
                imageView.setImageResource(R.drawable.yirmiyedi);
                break;
            case 27:
                imageView.setImageResource(R.drawable.yirmisekiz);
                break;
            case 28:
                imageView.setImageResource(R.drawable.yirmidokuz);
                break;
            case 29:
                imageView.setImageResource(R.drawable.otuz);
                break;
            case 30:
                imageView.setImageResource(R.drawable.otuzbir);
                break;
            case 31:
                imageView.setImageResource(R.drawable.otuziki);
                break;
            case 32:
                imageView.setImageResource(R.drawable.otuzuc);
                break;
            case 33:
                imageView.setImageResource(R.drawable.otuzdort);
                break;
            case 34:
                imageView.setImageResource(R.drawable.otuzbes);
                break;

            case 35:
                imageView.setImageResource(R.drawable.otuzalti);
                break;
            case 36:
                imageView.setImageResource(R.drawable.otuzyedi);
                break;
            case 37:
                imageView.setImageResource(R.drawable.otuzsekiz);
                break;
            case 38:
                imageView.setImageResource(R.drawable.otuzdokuz);
                break;
            case 39:
                imageView.setImageResource(R.drawable.kirk);
                break;
            case 40:
                imageView.setImageResource(R.drawable.kirkbir);
                break;
            case 41:
                imageView.setImageResource(R.drawable.kirkiki);
                break;
            case 42:
                imageView.setImageResource(R.drawable.kirkuc);
                break;
            case 43:
                imageView.setImageResource(R.drawable.kirkdort);
                break;
            case 44:
                imageView.setImageResource(R.drawable.kirkbes);
                break;
            case 45:
                imageView.setImageResource(R.drawable.kirkalti);
                break;
            case 46:
                imageView.setImageResource(R.drawable.kirkyedi);
                break;
            case 47:
                imageView.setImageResource(R.drawable.kirksekiz);
                break;
            case 48:
                imageView.setImageResource(R.drawable.kirkdokuz);
                break;
            case 49:
                imageView.setImageResource(R.drawable.elli);
                break;
            case 50:
                imageView.setImageResource(R.drawable.ellibir);
                break;
            case 51:
                imageView.setImageResource(R.drawable.elliki);
                break;
            case 52:
                imageView.setImageResource(R.drawable.elliuc);
                break;
            case 53:
                imageView.setImageResource(R.drawable.ellidort);
                break;
            case 54:
                imageView.setImageResource(R.drawable.ellibes);
                break;
            case 55:
                imageView.setImageResource(R.drawable.ellialti);
                break;
            case 56:
                imageView.setImageResource(R.drawable.elliyedi);
                break;
            case 57:
                imageView.setImageResource(R.drawable.ellisekiz);
                break;
            case 58:
                imageView.setImageResource(R.drawable.ellidokuz);
                break;
            case 59:
                imageView.setImageResource(R.drawable.altmis);
                break;
            case 60:
                imageView.setImageResource(R.drawable.altmisbir);
                break;
            case 61:
                imageView.setImageResource(R.drawable.altmisiki);
                break;

            case 62:
                imageView.setImageResource(R.drawable.altmisuc);
                break;
            case 63:
                imageView.setImageResource(R.drawable.altmisdort);
                break;
            case 64:
                imageView.setImageResource(R.drawable.altmisbes);
                break;
            case 65:
                imageView.setImageResource(R.drawable.altmisalti);
                break;
            case 66:
                imageView.setImageResource(R.drawable.altmisyedi);
                break;
            case 67:
                imageView.setImageResource(R.drawable.altmisekiz);
                break;
            case 68:
                imageView.setImageResource(R.drawable.altmisdokuz);
                break;
            case 69:
                imageView.setImageResource(R.drawable.yetmis);
                break;
            case 70:
                imageView.setImageResource(R.drawable.yetmisbir);
                break;
            case 71:
                imageView.setImageResource(R.drawable.yetmisiki);
                break;
            case 72:
                imageView.setImageResource(R.drawable.yetmisuc);
                break;
            case 73:
                imageView.setImageResource(R.drawable.yetmisdort);
                break;
            case 74:
                imageView.setImageResource(R.drawable.yetmisbes);
                break;
            case 75:
                imageView.setImageResource(R.drawable.yetmisalti);
                break;
            case 76:
                imageView.setImageResource(R.drawable.yetmisyedi);
                break;
            case 77:
                imageView.setImageResource(R.drawable.yetmisekiz);
                break;
            case 78:
                imageView.setImageResource(R.drawable.yetmisdokuz);
                break;
            case 79:
                imageView.setImageResource(R.drawable.seksen);
                break;

            case 80:
                imageView.setImageResource(R.drawable.seksenbir);
                break;
            case 81:
                imageView.setImageResource(R.drawable.sekseniki);
                break;
            case 82:
                imageView.setImageResource(R.drawable.seksenuc);
                break;
            case 83:
                imageView.setImageResource(R.drawable.seksendort);
                break;

            case 84:
                imageView.setImageResource(R.drawable.seksenbes);
                break;

            case 85:
                imageView.setImageResource(R.drawable.seksenalti);
                break;

            case 86:
                imageView.setImageResource(R.drawable.seksenyedi);
                break;

            case 87:
                imageView.setImageResource(R.drawable.seksensekiz);
                break;

            case 88:
                imageView.setImageResource(R.drawable.seksendokuz);
                break;

            case 89:
                imageView.setImageResource(R.drawable.doksan);
                break;


            case 90:
                imageView.setImageResource(R.drawable.doksanbir);
                break;

            case 91:
                imageView.setImageResource(R.drawable.doksaniki);
                break;

            case 92:
                imageView.setImageResource(R.drawable.doksanuc);
                break;

            case 93:
                imageView.setImageResource(R.drawable.doksandort);
                break;

            case 94:
                imageView.setImageResource(R.drawable.doksanbes);
                break;
            case 95:
                imageView.setImageResource(R.drawable.doksanalti);
                break;
            case 96:
                imageView.setImageResource(R.drawable.doksanyedi);
                break;
            case 97:
                imageView.setImageResource(R.drawable.doksansekiz);
                break;
            case 98:
                imageView.setImageResource(R.drawable.doksandokuz);
                break;

            case 99:
                imageView.setImageResource(R.drawable.yuz);
                break;

            case 100:
                imageView.setImageResource(R.drawable.yuzbir);
                break;

            case 101:
                imageView.setImageResource(R.drawable.yuziki);
                break;

            case 102:
                imageView.setImageResource(R.drawable.yuzuc);
                break;

            case 103:
                imageView.setImageResource(R.drawable.yuzdort);
                break;

            case 104:
                imageView.setImageResource(R.drawable.yuzbes);
                break;


        }

        //
    }
}
