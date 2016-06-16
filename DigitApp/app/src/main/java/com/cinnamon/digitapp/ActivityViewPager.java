package com.cinnamon.digitapp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.cinnamon.digitapp.controller.NoticiaController;
import com.cinnamon.digitapp.model.Noticia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 11/6/2016.
 */
//ESTA ACTIVITY HAY QUE REEMPLAZARLA POR UN FRAGMENT , PERO YO LA PUSE NADA MAS PARA QUE SE VEA

public class ActivityViewPager extends AppCompatActivity {

//    List<Noticia> listaNoticias=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_activity);

        Toolbar toolbarViewPager=(Toolbar)findViewById(R.id.toolbar_view_pager);
        setSupportActionBar(toolbarViewPager);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

  //      cargarNoticias();

    }

//    public void cargarNoticias() {

 //       NoticiaController noticiaController = new NoticiaController();
 //       listaNoticias = noticiaController.getFeeds();

 //   }
}
