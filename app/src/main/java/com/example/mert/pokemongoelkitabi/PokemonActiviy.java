package com.example.mert.pokemongoelkitabi;

import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PokemonActiviy extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private List<String> isimler = new ArrayList<String>();
    private String[] bilgi={"1","2","3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_activiy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        isimler.add("1-)Bulbasaur");
        isimler.add("2-)Ivysaur");
        isimler.add("3-)Venusaur");
        isimler.add("4-)Charmender");
        isimler.add("5-)Charmeleon");
        isimler.add("6-)Charizard");
        isimler.add("7-)Squirtle");
        isimler.add("8-)Wartortle");
        isimler.add("9-)Blastoise");
        isimler.add("10-)Caterpie");
        isimler.add("11-)Metapod");

        //    yukarıyı kontrol et//
        isimler.add("12-)Butterfree");//
        isimler.add("13-)Weedle");
        isimler.add("14-)Kakuna");
        isimler.add("15-)Beedril");
        isimler.add("16-)Pidgey");
        isimler.add("17-)Pidgeotto");
        isimler.add("18-)Pidgeot");
        isimler.add("19-)Rattata");
        isimler.add("20-)Raticate");
        isimler.add("21-)Spearow");
        isimler.add("22-)Fearow");
        isimler.add("23-)Ekans");
        isimler.add("24-)Arbok");
        isimler.add("25-)Pikachu");
        isimler.add("26-)Raichu");
        isimler.add("27-)Sandshrew");
        isimler.add("28-)Sandslash");
        isimler.add("29-)Nidoran♀");
        isimler.add("30-)Nidorina");
        isimler.add("31-)Nidoqueen");
        isimler.add("32-)Nidoran♂");
        isimler.add("33-)Nidorino");
        isimler.add("34-)Nidoking");
        isimler.add("35-)Clefairy");
        isimler.add("36-)Clefable");
        isimler.add("37-)Vulpix");
        isimler.add("38-)Ninetales");
        isimler.add("39-)Jigglypuff");
        isimler.add("40-)Wigglytuff");
        isimler.add("41-)Zubat");
        isimler.add("42-)Golbat");
        isimler.add("43-)Oddish");
        isimler.add("44-)Gloom");
        isimler.add("45-)Vileplume");
        isimler.add("46-)Paras");
        isimler.add("47-)Parasect");
        isimler.add("48-)Venonat");
        isimler.add("49-)Venomoth");
        isimler.add("50-)Diglett");
        isimler.add("51-)Dugtrio");
        isimler.add("52-)Meowth");
        isimler.add("53-)Persian");
        isimler.add("54-)Psyduck");
        isimler.add("55-)Golduck");
        isimler.add("56-)Mankey");
        isimler.add("57-)Primeape");
        isimler.add("58-)Growlithe");
        isimler.add("59-)Arcanine");
        isimler.add("60-)Poliwag");
        isimler.add("61-)Poliwhirl");
        isimler.add("62-)Poliwrath");
        isimler.add("63-)Abra");
        isimler.add("64-)Kadabra");
        isimler.add("65-)Alakazam");
        isimler.add("66-)Machop");
        isimler.add("67-)Machoke");
        isimler.add("68-)Machamp");
        isimler.add("69-)Bellsprout");
        isimler.add("70-)Weepinbel");
        isimler.add("71-)Victreebel");
        isimler.add("72-)Tentacool");
        isimler.add("73-)Tentacruel");
        isimler.add("74-)Geodude");
        isimler.add("75-)Graveler");
        isimler.add("76-)Golem");
        isimler.add("77-)Ponyta");
        isimler.add("78-)Rapidash");
        isimler.add("79-)Slowpoke");
        isimler.add("80-)Slowbro");

        sharedPreferences= getSharedPreferences("bilgi",MODE_PRIVATE);
        editor=sharedPreferences.edit();

        final ListView listemiz = (ListView) findViewById(R.id.liste);
        OzelAdapter adaptorumuz=new OzelAdapter(this, isimler);
        listemiz.setAdapter(adaptorumuz);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




            Intent i = new Intent(getApplicationContext(),Bilgi.class);
        yazi ya= new yazi();
            String yolla =ya.getBilgi(position);
            //editor.putString("bilgi",bilgi[position]);
            editor.putString("bilgi",yolla);
            editor.commit();
            startActivity(i);
        }



    });

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
        getMenuInflater().inflate(R.menu.pokemon_activiy, menu);
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

            Intent i = new Intent(getApplicationContext(),kurulumActivity.class);
            startActivity(i);

        } else if (id == R.id.oyun) {

            Intent i = new Intent(getApplicationContext(),Oyun.class);
            startActivity(i);


        } else if (id == R.id.pokemon) {

           // pokemonda
        } else if (id == R.id.terim) {
            Intent i = new Intent(getApplicationContext(),Terimler.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
