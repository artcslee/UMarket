package com.lees.umarket.ui.activities;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.lees.umarket.R;
import com.lees.umarket.markets.MarketItem;
import com.lees.umarket.ui.fragments.MarketItemFragment;
import com.lees.umarket.ui.fragments.MarketItemListFragment;

public class MainActivity extends AppCompatActivity implements MarketItemListFragment.OnListFragmentInteractionListener {
    boolean portrait;
    View detailsHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        detailsHolder = findViewById(R.id.details_container);
        if (null == detailsHolder) {
            portrait = true;
        } else {
            portrait = false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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

    @Override
    public void onMarketItemSelected(MarketItem item) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.details_container, new MarketItemFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

}
