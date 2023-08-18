package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaLista {
    public static void main(String[] args) {

        Filme nomeDoFilme = new Filme("Senhor dos anéis", 2002);

        Filme favorito = new Filme("Matrix", 2000);

        Serie s = new Serie("Resident evil", 2019);

        Filme maisUm = new Filme("Duro de Mata", 2015);



        nomeDoFilme.avalia(10);
        favorito.avalia(5);
        s.avalia(7);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(nomeDoFilme);
        list.add(favorito);
        list.add(s);
        list.add(maisUm);

        System.out.println(list);
        System.out.println(list.get(1));

        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("nickollas");
        buscaPorArtista.add("pamella");
        buscaPorArtista.add("carlos");
        buscaPorArtista.add("caterina");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(list);
        System.out.println(list);




    }
}
