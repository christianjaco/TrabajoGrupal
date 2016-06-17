package com.cinnamon.digitapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.cinnamon.digitapp.controller.NoticiaController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 16/6/2016.
 */
public class AdapterFragmentViewPager extends FragmentStatePagerAdapter {

    private List<Fragment> listaFragmentNoticias;

    public AdapterFragmentViewPager(FragmentManager fm) {
        super(fm);
        this.listaFragmentNoticias =new ArrayList<>();
        this.listaFragmentNoticias.add(FragmentNoticia.dameUnFragmentNoticia("deporte"));
        this.listaFragmentNoticias.add(FragmentNoticia.dameUnFragmentNoticia("masleidas"));
        this.listaFragmentNoticias.add(FragmentNoticia.dameUnFragmentNoticia("entretenimiento"));
        this.listaFragmentNoticias.add(FragmentNoticia.dameUnFragmentNoticia("moda"));
        this.listaFragmentNoticias.add(FragmentNoticia.dameUnFragmentNoticia("social"));
    }

    @Override
    public Fragment getItem(int position) {

        return this.listaFragmentNoticias.get(position);
    }

    @Override
    public int getCount() {

        return listaFragmentNoticias.size();
    }
}
