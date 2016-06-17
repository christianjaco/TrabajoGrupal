package com.cinnamon.digitapp.dao;

import com.cinnamon.digitapp.model.Noticia;
import com.cinnamon.digitapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 16/6/2016.
 */
public class NoticiaDAO {


    public List<Noticia> getNoticias() {


        List<Noticia> listaNoticias = new ArrayList<>();

        listaNoticias.add(new Noticia("Uruguay eliminado de la Copa América", "Perdió con Venezuela", R.drawable.uruguay, 1, R.drawable.pelota_futbol, "deporte"));
        listaNoticias.add(new Noticia("Fede Bal habló en Showmatch", "Desmintió violencia de genero", R.drawable.showmatch, 10, R.drawable.tele, "entretenimiento"));
        listaNoticias.add(new Noticia("Snapchat, la red de los jóvenes", "Muy popular entre los millennials", R.drawable.snapchat, 20, R.drawable.redes, "social"));
        listaNoticias.add(new Noticia("El viernes 17 será feriado", "Se aprobó en diputados", R.drawable.diputados, 30, R.drawable.taza, "masleidas"));
        listaNoticias.add(new Noticia("Procesaron al ex titular del PAMI", "Se trata de Luciano Di Césare", R.drawable.pami, 45, R.drawable.taza, "masleidas"));
        listaNoticias.add(new Noticia("River mostro interes por Franco Armani", "Oferta formal por el arquero", R.drawable.armani, 50, R.drawable.pelota_futbol, "deporte"));
        listaNoticias.add(new Noticia("Medio aguinaldo fuera de ganancias", "Opina Sergio Massa", R.drawable.ganancias, 60, R.drawable.taza, "masleidas"));
        listaNoticias.add(new Noticia("Obama apoya oficialmente a Hillary Clinton", "Lo hizo en un video de Youtube", R.drawable.obama, 100, R.drawable.taza, "masleidas"));
        listaNoticias.add(new Noticia("Macarena abandonó la casa de GH", "Fue por voluntad propia", R.drawable.gh, 120, R.drawable.tele, "entretenimiento"));
        listaNoticias.add(new Noticia("Mira el nuevo look de Messi", "Se dejo la barba", R.drawable.messi, 140, R.drawable.vestido, "moda"));

        return listaNoticias;
    }

    public List<Noticia> getListaFiltrada(String unaCategoria) {

        List<Noticia> listNoticias = getNoticias();
        List<Noticia> listaNoticiasFiltradas = new ArrayList<>();


        for (int i = 0; i < listNoticias.size(); i++) {
            if (listNoticias.get(i).getCategoria().equals(unaCategoria)) {
                listaNoticiasFiltradas.add(listNoticias.get(i));
            }

        }
        return listaNoticiasFiltradas;
    }


}