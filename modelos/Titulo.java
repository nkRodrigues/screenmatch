package br.com.alura.screenmatch.modelos;

import java.util.Comparator;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int dataDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;

        public Titulo( String nome, int dataDeLancamento){
            this.nome = nome;
            this.dataDeLancamento = dataDeLancamento;
        }
    


    public String getNome() {
        return this.nome;
    }

    public int getDataDeLancamento() {

        return dataDeLancamento;
    }

    public int getDuracaoEmMinutos() {

        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {

        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {

        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacao() {
        return  totalDeAvaliacao;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setDataDeLancamento(int dataDeLancamento) {

        this.dataDeLancamento = dataDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Data de lançamento: "  + this.dataDeLancamento);
        System.out.println("Duração: " + this.duracaoEmMinutos);
        System.out.println("Incluido no plano: " + this.incluidoNoPlano);
        System.out.println("Avaliação: " + pegaMedia());
    }

    public  void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }


}
