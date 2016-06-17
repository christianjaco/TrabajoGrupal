package com.cinnamon.digitapp.controller;

import com.cinnamon.digitapp.dao.NoticiaDAO;
import com.cinnamon.digitapp.model.Noticia;

import java.util.List;

/**
 * Created by Christian on 16/6/2016.
 */
public class NoticiaController {

    public List<Noticia> getFeeds(){

        NoticiaDAO noticiaDAO = new NoticiaDAO();

        return noticiaDAO.getNoticias();
    }

    public List<Noticia> getFeedsFiltrados(String categoria){
        NoticiaDAO noticiaDAO = new NoticiaDAO();
        List<Noticia>listaNoticias = noticiaDAO.getListaFiltrada(categoria);

        return listaNoticias;
    }


}
