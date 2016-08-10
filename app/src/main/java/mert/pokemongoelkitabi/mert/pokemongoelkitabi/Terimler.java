package mert.pokemongoelkitabi.mert.pokemongoelkitabi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
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
import mert.pokemongoelkitabi.mert.pokemongoelkitabi.R;

public class Terimler extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terimler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// fontları bu bölümde ekledim ----------------------------------
        Typeface face1= Typeface.createFromAsset(getAssets(),"terim.ttf");
        tx1=(TextView)findViewById(R.id.textView16);
        tx1.setTypeface(face1);
    TextView tx2=(TextView)findViewById(R.id.textView18);
            tx2.setTypeface(face1);
        TextView tx3=(TextView)findViewById(R.id.textView20);
        tx3.setTypeface(face1);
        TextView tx4=(TextView)findViewById(R.id.textView22);
        tx4.setTypeface(face1);
        TextView tx5=(TextView)findViewById(R.id.textView24);
        tx5.setTypeface(face1);
        TextView tx6=(TextView)findViewById(R.id.textView26);
        tx6.setTypeface(face1);
        TextView tx7=(TextView)findViewById(R.id.textView28);
        tx7.setTypeface(face1);
        TextView tx8=(TextView)findViewById(R.id.textView30);
        tx8.setTypeface(face1);
        TextView tx9=(TextView)findViewById(R.id.textView32);
        tx9.setTypeface(face1);
        TextView tx10=(TextView)findViewById(R.id.textView34);
        tx10.setTypeface(face1);
        TextView tx11=(TextView)findViewById(R.id.textView36);
        tx11.setTypeface(face1);
        TextView tx12=(TextView)findViewById(R.id.textView38);
        tx12.setTypeface(face1);
        TextView tx13=(TextView)findViewById(R.id.textView40);
        tx13.setTypeface(face1);
        TextView tx14=(TextView)findViewById(R.id.textView42);
        tx14.setTypeface(face1);
        TextView tx15=(TextView)findViewById(R.id.textView44);
        tx15.setTypeface(face1);
        TextView tx16=(TextView)findViewById(R.id.textView46);
        tx16.setTypeface(face1);
        TextView tx17=(TextView)findViewById(R.id.textView48);
        tx17.setTypeface(face1);
        TextView tx18=(TextView)findViewById(R.id.textView50);
        tx18.setTypeface(face1);
        TextView tx19=(TextView)findViewById(R.id.textView52);
        tx19.setTypeface(face1);
        TextView tx20=(TextView)findViewById(R.id.textView54);
        tx20.setTypeface(face1);

//---------------------------------------------------------------




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
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.terimler, menu);
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
            Intent i = new Intent(getApplicationContext(), PokemonActiviy.class);
            startActivity(i);
        } else if (id == R.id.terim) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
