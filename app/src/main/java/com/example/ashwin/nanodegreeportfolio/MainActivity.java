package com.example.ashwin.nanodegreeportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popularMovies;
    Button stockHawk;
    Button buildItBigger;
    Button makeYourAppMaterial;
    Button goUbiquitous;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        popularMovies= (Button) findViewById(R.id.buttonPopularMovies);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Come back on Aug 21st to launch PopularMovies 1.0");
            }
        });

        stockHawk= (Button) findViewById(R.id.buttonStockHawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("Come back on December 4th to launch StockHawk");


            }
        });

        buildItBigger= (Button) findViewById(R.id.buttonBuildItBigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("We are going to Build It Bigger on February 27th ");

            }
        });

        makeYourAppMaterial= (Button) findViewById(R.id.buttonMakeYourAppMaterial);
        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("My App Material will be ready by May 1st");

            }
        });

        goUbiquitous= (Button) findViewById(R.id.buttonGoUbiquitous);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast(" We'll Go Ubiquitous on  May 29th");

            }
        });

        capstone= (Button) findViewById(R.id.buttonCapstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayToast("We'll top it all off with Capstone on July 17th ");

            }
        });




    }

    private void displayToast(String toastMessage) {
        Context context= getApplicationContext();
        int duration= Toast.LENGTH_SHORT;
        Toast toast= Toast.makeText(context, toastMessage, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
