package com.dimaslz.demoandroidthings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.dimaslz.demoandroidthings.examples.Flavors.FlavorsActivity;
import com.dimaslz.demoandroidthings.examples.DynamicStrings.DynamicStringsActivity;


public class MainActivity extends ActionBarActivity {

    Context context;
    Activity activity;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        activity = this;

        Button example1 = (Button)findViewById(R.id.btn_example1);
        example1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(activity, DynamicStringsActivity.class);
                startActivity(intent);
            }
        });

        Button example2 = (Button)findViewById(R.id.btn_example2);
        example2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(activity, FlavorsActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
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
