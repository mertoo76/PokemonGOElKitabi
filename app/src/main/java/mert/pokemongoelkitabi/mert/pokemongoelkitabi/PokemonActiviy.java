package mert.pokemongoelkitabi.mert.pokemongoelkitabi;

import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import mert.pokemongoelkitabi.mert.pokemongoelkitabi.R;

import java.util.ArrayList;
import java.util.List;

public class PokemonActiviy extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    SharedPreferences sharedPreferences,sharedPreferences1,sharedPreferences2;
    SharedPreferences.Editor editor,editor1,editor2;
    private List<String> isimler = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_activiy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  reklam ekleme banner---------------
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest); //adView i yüklüyoruz

        /*if (adView != null) {
            adView.resume(); // reklamı başlatır
        }*/
//--------------------------------------------

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
        isimler.add("77-)Ponyta");//*
        isimler.add("78-)Rapidash");
        isimler.add("79-)Slowpoke");
        isimler.add("80-)Slowbro");
        isimler.add("81-)Magnemite");
        isimler.add("82-)Magneton");
        isimler.add("83-)Farfetch'd");
        isimler.add("84-)Doduo");
        isimler.add("85-)Dodrio");
        isimler.add("86-)Seel");
        isimler.add("87-)Dewgong");
        isimler.add("88-)Grimer");
        isimler.add("89-)Muk");
        isimler.add("90-)Shellder");
        isimler.add("91-)Cloyster");
        isimler.add("92-)Gastly");
        isimler.add("93-)Haunter");
        isimler.add("94-)Gengar");
        isimler.add("95-)Onix");
        isimler.add("96-)Drowzee");
        isimler.add("97-)Hypno");
        isimler.add("98-)Krabby");
        isimler.add("99-)Kingler");
        isimler.add("100-)Voltorb");
        isimler.add("101-)Electrode");
        isimler.add("102-)Exeggcute");
        isimler.add("103-)Exeggutor");
        isimler.add("104-)Cubone");
        isimler.add("105-)Marowak");
        isimler.add("106-)Hitmonlee");
        isimler.add("107-)Hitmonchan");
        isimler.add("108-)Lickitung");
        isimler.add("109-)Koffing");
        isimler.add("110-)Weezing");
        isimler.add("111-)Ryhorn");
        isimler.add("112-)Rhydon");
        isimler.add("113-)Chansey");
        isimler.add("114-)Tangela");
        isimler.add("115-)Kangaskhan");
        isimler.add("116-)Horsea");
        isimler.add("117-)Seadra");
        isimler.add("118-)Goldeen");
        isimler.add("119-)Seaking");
        isimler.add("120-)Staryu");
        isimler.add("121-)Starmie");
        isimler.add("122-)Mr.Mime");
        isimler.add("123-)Scyther");
        isimler.add("124-)Jynx");
        isimler.add("125-)Electabuzz");
        isimler.add("126-)Magmar");
        isimler.add("127-)Pinsir");
        isimler.add("128-)Tauros");
        isimler.add("129-)Magikarp");
        isimler.add("130-)Gyarados");
        isimler.add("131-)Lapras");
        isimler.add("132-)Ditto");
        isimler.add("133-)Eevee");
        isimler.add("134-)Vaporeon ");
        isimler.add("135-)Jolteon");
        isimler.add("136-)Flareon\n\n\n\n\n");



        sharedPreferences= getSharedPreferences("bilgi",MODE_PRIVATE);
        sharedPreferences1= getSharedPreferences("position",MODE_PRIVATE);
        sharedPreferences2= getSharedPreferences("isim",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor1=sharedPreferences1.edit();
        editor2=sharedPreferences2.edit();

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


            String[] array = new String[200];
            array= getResources().getStringArray(R.array.bilgi);


            // bilgi ekranında pokem fotorafını görmek için position bilgisini yolluyorum positiona göre fotoyu Bilgi.java dosyasında seçiyorum
            editor1.putInt("position",position);
            editor1.commit();


            // pokemon ismini bilgi ekranın yazdırmak için yolluyorum.

            String pokeIsim=isimler.get(position);
            editor2.putString("isim",pokeIsim);
            editor2.commit();


            // pokemon bilgilerini yolluyorum.

            String x1 = array[position];
           editor.putString("bilgi",x1);
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
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
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
