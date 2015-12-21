package com.mobaires.curso.lectordenoticias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

/**
 * Created by cduarte on 12/21/15.
 */
public class NewsActivity extends FragmentActivity
                        implements MyListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {
        boolean dual_pane = getResources().getBoolean(R.bool.dual_pane);
        if (dual_pane) {
            DetailFragment fragment = (DetailFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            fragment.setText(link);
        } else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_URL, link);
            startActivity(intent);

        }
    }

}

