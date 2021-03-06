package mert.pokemongoelkitabi.mert.pokemongoelkitabi;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import mert.pokemongoelkitabi.mert.pokemongoelkitabi.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView txA,txB,txKur,txOy,txpok,txter;
    private List<String> isimler = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // dil destği bölümü
        Locale locale = Locale.getDefault(); // Sayfayı yüklemeden önce default locale alıyoruz ve sayfayı ona göre yüklüyoruz.
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
//

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LinearLayout linearLayout,pokedex,oyun,terim;
        isimler.add("Kurulum");
        isimler.add("Nasıl Oynanır?");
        isimler.add("Pokedex");
        isimler.add("Terimler Sözlüğü");

        Typeface face= Typeface.createFromAsset(getAssets(),"PokemonSolid.ttf");
        txA=(TextView)findViewById(R.id.textView56);
        txB=(TextView)findViewById(R.id.textView57);
        txKur=(TextView)findViewById(R.id.isim);
        txOy=(TextView)findViewById(R.id.isim2);
        txpok=(TextView)findViewById(R.id.isim3);
        txter=(TextView)findViewById(R.id.isim4);
        txA.setTypeface(face);
        txB.setTypeface(face);
        txKur.setTypeface(face);
        txOy.setTypeface(face);
        txpok.setTypeface(face);
        txter.setTypeface(face);

        linearLayout=(LinearLayout)findViewById(R.id.linear);
        oyun=(LinearLayout)findViewById(R.id.oyun);
        pokedex=(LinearLayout)findViewById(R.id.pokedex);
        terim=(LinearLayout)findViewById(R.id.terimler);


        // dil desteği

        ImageView b1 = (ImageView) findViewById(R.id.imageButton);
        ImageView b2 = (ImageView) findViewById(R.id.imageButton2);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Locale locale = new Locale("en");  //locale en yaptık. Artık değişkenler values-en paketinden alınacak
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                finish();//mevcut acivity i bitir.
                startActivity(getIntent());//activity i baştan yükle

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                Locale locale = new Locale(""); //locale i default locale yani türkçe yaptık. Artık değişkenler values paketinden alınacak
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());
                finish();//mevcut acivity i bitir.
                startActivity(getIntent());//activity i baştan yükle


            }
        });


        //



//  reklam ekleme banner---------------
        AdView adView = (AdView) this.findViewById(R.id.adView);
      AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest); //adView i yüklüyoruz

        /*if (adView != null) {
            adView.resume(); // reklamı başlatır
        }*/
//--------------------------------------------
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),kurulumActivity.class);
                startActivity(i);
            }
        });
        pokedex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PokemonActiviy.class);
                startActivity(i);
            }
        });

        oyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Oyun.class);
                startActivity(i);
            }
        });
        terim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Terimler.class);
                startActivity(i);
            }
        });


      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.kurulum) {

            Intent i = new Intent(getApplicationContext(),kurulumActivity.class);
            startActivity(i);

        } else if (id == R.id.oyun) {

            Intent i = new Intent(getApplicationContext(),Oyun.class);
            startActivity(i);


        } else if (id == R.id.pokemon) {

            Intent i = new Intent(getApplicationContext(),PokemonActiviy.class);
            startActivity(i);
        } else if (id == R.id.terim) {
            Intent i = new Intent(getApplicationContext(),Terimler.class);
            startActivity(i);
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
