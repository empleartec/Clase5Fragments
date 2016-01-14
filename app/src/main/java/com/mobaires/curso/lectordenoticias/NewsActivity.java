package com.mobaires.curso.lectordenoticias;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

/**
 * Created by cduarte on 12/21/15.
 */
public class NewsActivity extends FragmentActivity
                                /* TODO implements... */
                                /* TODO News Activity debe implementar un Listener */
                                /* Que reciba mensajes de MyListFragment */ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO Hacer setContentView del layout del activity "main"


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.playa);

    }

    /**
     * TODO Debemos implementar el método del Listener de MyListFragment. El mismo ocurre
     * cuando el usuario hizo una elección en MyListFragment.
     * Eligieron una noticia en el fragment MyListFragment..
     * Debemos buscar el Fragment detailFragment, y setearle valor del texto en link
     *
     *  @Override
     *  public void onRssItemSe.... {
     *      DetailFragment fragment = ....getSupportFragmentManager().findFragmentBy... ;
     *      fragment.setText(link);
     *      ...
     *  }
     * */

}

