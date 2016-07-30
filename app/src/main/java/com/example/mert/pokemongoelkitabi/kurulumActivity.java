package com.example.mert.pokemongoelkitabi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class kurulumActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    TextView tx1,tx2,txb1,txb2,txb3,txb4,tx3,tx4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurulum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//fontları bu bölümde ekledim -----------------------------
        Typeface face2= Typeface.createFromAsset(getAssets(),"PokemonSolid.ttf");


        txb1=(TextView)findViewById(R.id.textView58);
        txb2=(TextView)findViewById(R.id.textView60);
        txb3=(TextView)findViewById(R.id.textView62);

        txb4=(TextView)findViewById(R.id.textView64);


        txb1.setTypeface(face2);
        txb2.setTypeface(face2);
        txb3.setTypeface(face2);
        txb4.setTypeface(face2);

//-----------------------------------




        //  reklam ekleme banner---------------
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest); //adView i yüklüyoruz

        /*if (adView != null) {
            adView.resume(); // reklamı başlatır
        }*/
//--------------------------------------------
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.kurulum) {
// kurulumda


        } else if (id == R.id.oyun) {

            Intent i = new Intent(getApplicationContext(), Oyun.class);
            startActivity(i);

        }else if (id == R.id.pokemon) {

            Intent i = new Intent(getApplicationContext(), PokemonActiviy.class);
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
