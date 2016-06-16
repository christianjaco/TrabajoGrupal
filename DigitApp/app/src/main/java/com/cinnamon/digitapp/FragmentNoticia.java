package com.cinnamon.digitapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.digitapp.controller.NoticiaController;
import com.cinnamon.digitapp.dao.NoticiaDAO;
import com.cinnamon.digitapp.model.Noticia;

import java.util.List;

/**
 * Created by Christian on 16/6/2016.
 */
public class FragmentNoticia extends Fragment {
    public static final String CATEGORIA = "categoria";

    public static FragmentNoticia dameUnFragmentNoticia(String categoria){
        FragmentNoticia fragmentFirst = new FragmentNoticia();
        Bundle args = new Bundle();
        args.putString(CATEGORIA,categoria );

        return fragmentFirst;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.view_pager_detalle, container, false);

        Bundle unBundle = getArguments();
        String unaCategoria = unBundle.getString(CATEGORIA);


        NoticiaController noticiaController = new NoticiaController();

        RecyclerView recyclerView = (RecyclerView) fragmentView.findViewById(R.id.layout_recycler_view);
        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(null, noticiaController.getFeedsFiltrados(unaCategoria));

        recyclerView.setAdapter(adapterRecyclerView);
        return fragmentView;

    }
}
