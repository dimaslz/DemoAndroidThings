package com.dimaslz.demoandroidthings.examples.DynamicStrings;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dimaslz.demoandroidthings.R;

import java.text.MessageFormat;

public class DynamicStringsActivity extends ActionBarActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_strings);

        Resources resource = getResources();

        // Example 1
        String example_1_1 = resource.getQuantityString(R.plurals.example1_1, 1, 1);
        String example_1_2 = resource.getQuantityString(R.plurals.example1_1, 5, 5);

        TextView tv_example_1_1 = (TextView)findViewById(R.id.tv_example_1_1);
        tv_example_1_1.setText(example_1_1);
        TextView tv_example_1_2 = (TextView)findViewById(R.id.tv_example_1_2);
        tv_example_1_2.setText(example_1_2);

        // Example 2
        String example_2_1 = (String) resource.getText(R.string.example2_1);

        TextView tv_example_2_1 = (TextView)findViewById(R.id.tv_example_2_1);
        tv_example_2_1.setText(MessageFormat.format(example_2_1, 0));
        TextView tv_example_2_2 = (TextView)findViewById(R.id.tv_example_2_2);
        tv_example_2_2.setText(MessageFormat.format(example_2_1, 1));
        TextView tv_example_2_3 = (TextView)findViewById(R.id.tv_example_2_3);
        tv_example_2_3.setText(MessageFormat.format(example_2_1, 5));
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dynamic_strings, menu);
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
