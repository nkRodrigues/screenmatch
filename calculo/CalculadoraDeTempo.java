package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

        private int tempototal;

        //Tempo necessario para maratonar filme/serie!
        public  void inclui(Titulo titulo){
            tempototal += titulo.getDuracaoEmMinutos();
        }

        public int getTempototal(){
            return tempototal;
        }

}
