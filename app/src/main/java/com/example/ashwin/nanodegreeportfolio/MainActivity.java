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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






    }

    public void buttonClick(View view)
    {
        switch(view.getId())
        {
            case R.id.buttonPopularMovies:
                displayToast("Come back on Aug 21st to launch PopularMovies 1.0");
                break;
            case R.id.buttonStockHawk:
                displayToast("Come back on December 4th to launch StockHawk");
                break;
            case R.id.buttonBuildItBigger:
                displayToast("We are going to Build It Bigger on February 27th ");
                break;
            case R.id.buttonMakeYourAppMaterial:
                displayToast("My App material will be made by May 1st");
                break;
            case R.id.buttonGoUbiquitous:
                displayToast(" We'll Go Ubiquitous on  May 29th");
                break;
            case R.id.buttonCapstone:
                displayToast("We'll top it all off with Capstone on July 17th ");
                break;
        }
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
