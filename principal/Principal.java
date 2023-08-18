package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme nomeDoFilme = new Filme("Senhor dos anéis", 1800);
        nomeDoFilme.setDuracaoEmMinutos(180);
        nomeDoFilme.setIncluidoNoPlano(true);


        nomeDoFilme.avalia(5);
        nomeDoFilme.avalia(10);
        nomeDoFilme.avalia(8);

        Filme favorito = new Filme("matrix", 2000);
        favorito.setDuracaoEmMinutos(150);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(8);
        favorito.avalia(6);
        favorito.avalia(7);


        Serie s = new Serie("resident evil", 2019);
        s.setTemporada(2);
        s.setIncluidoNoPlano(true);
        s.setEpisodioPorTemporada(8);
        s.setMinitosPorEpisodio(40);
        s.avalia(8);
        s.avalia(5);
        s.avalia(9);

//        System.out.println(s.pegaMedia());
//        System.out.println(nomeDoFilme.pegaMedia());
//        System.out.println(favorito.pegaMedia());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(s);
        calculadora.inclui(favorito);
        calculadora.inclui(nomeDoFilme);

        System.out.println("Tempo total será: " + calculadora.getTempototal());

        ArrayList<Titulo> list = new ArrayList<>();

        list.add(favorito);
        list.add(nomeDoFilme);
        list.add(s);

        System.out.println("Tamanho da lista " + list.size());
        System.out.println("Primeiro filme: " + list.get(0));
        System.out.println(list);




    }
}