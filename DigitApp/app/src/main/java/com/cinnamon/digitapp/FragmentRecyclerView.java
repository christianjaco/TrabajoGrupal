package com.cinnamon.digitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.digitapp.controller.NoticiaController;
import com.cinnamon.digitapp.dao.NoticiaDAO;
import com.cinnamon.digitapp.model.Noticia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 16/6/2016.
 */
public class FragmentRecyclerView extends Fragment {

    private RecyclerView recyclerView;
    private List<Noticia> listaNoticias = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        recyclerView= (RecyclerView)container.findViewById(R.id.layout_recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL, false));

        cargarNoticias();
        NoticiaController noticiaController = new NoticiaController();

        AdapterRecyclerView adapterRecyclerView=new AdapterRecyclerView(null,listaNoticias);

        recyclerView.setAdapter(adapterRecyclerView);

        ListenerNoticias unListenerDeNoticias = new ListenerNoticias();
        adapterRecyclerView.setOnClickListener(unListenerDeNoticias);

        return  recyclerView;
    }

    public void cargarNoticias() {

        NoticiaController noticiaController = new NoticiaController();
        listaNoticias = noticiaController.getFeeds();

    }
    private class ListenerNoticias implements View.OnClickListener{


        @Override
        public void onClick(View view) {
            Intent unIntent= new Intent(view.getContext(),ActivityViewPager.class);
            startActivity(unIntent);
        }
    }



}
