package com.cinnamon.digitapp.view;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.cinnamon.digitapp.AdapterFragmentViewPager;
import com.cinnamon.digitapp.AdapterRecyclerView;
import com.cinnamon.digitapp.FragmentDeporte;
import com.cinnamon.digitapp.FragmentEntretenimiento;
import com.cinnamon.digitapp.FragmentMasLeido;
import com.cinnamon.digitapp.FragmentModa;
import com.cinnamon.digitapp.FragmentSocial;
import com.cinnamon.digitapp.R;
import com.cinnamon.digitapp.ActivityViewPager;
import com.cinnamon.digitapp.controller.NoticiaController;
import com.cinnamon.digitapp.model.Noticia;

import java.util.ArrayList;
import java.util.List;

public class ActivityMain extends AppCompatActivity {

    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        AdapterFragmentViewPager adapterViewPager = new AdapterFragmentViewPager(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);

        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);

        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new ListenerMenu());

    }

    private void selectedMenuItem(MenuItem item) {


        Integer id = item.getItemId();

        if (id == R.id.mas_leidas_drawer_view) {

            FragmentMasLeido crearFragmentMasLeido = new FragmentMasLeido();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.aca_va_el_fragment, crearFragmentMasLeido);
            fragmentTransaction.commit();

        } else if (id == R.id.deporte_drawer_view) {

            FragmentDeporte crearFragmentDeporte = new FragmentDeporte();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.aca_va_el_fragment, crearFragmentDeporte);
            fragmentTransaction.commit();
        } else if (id == R.id.entretenimiento_drawer_view) {

            FragmentEntretenimiento crearFragmentEntretenimiento = new FragmentEntretenimiento();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.aca_va_el_fragment, crearFragmentEntretenimiento);
            fragmentTransaction.commit();
        } else if (id == R.id.social_drawer_view) {

            FragmentSocial crearFragmentSocial = new FragmentSocial();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.aca_va_el_fragment, crearFragmentSocial);
            fragmentTransaction.commit();
        } else if (id == R.id.moda_drawer_view) {
            FragmentModa crearFragmentModa = new FragmentModa();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.aca_va_el_fragment, crearFragmentModa);
            fragmentTransaction.commit();
        }
    }

    private class ListenerMenu implements NavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            selectedMenuItem(item);
            return true;
        }
    }
}
