package com.mobaires.curso.lectordenoticias;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by cduarte on 12/21/15.
 */
public class DetailActivity extends FragmentActivity {
    public static final String EXTRA_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // check if dual pane mode is active
        // if yes, finish this activity
        if (getResources().getBoolean(R.bool.dual_pane)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String url = extras.getString(EXTRA_URL);
            DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            detailFragment.setText(url);
        }
    }
}