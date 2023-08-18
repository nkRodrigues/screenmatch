package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {

        private int temporada;
        private boolean ativa;
        private int episodioPorTemporada;
        private int minitosPorEpisodio;

    public Serie(String nome, int dataDeLancamento) {
        super(nome, dataDeLancamento);
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;

    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinitosPorEpisodio() {
        return minitosPorEpisodio;
    }

    public void setMinitosPorEpisodio(int minitosPorEpisodio) {
        this.minitosPorEpisodio = minitosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodioPorTemporada * minitosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome da serie: " + super.getNome());
        System.out.println("Data de laçamento: " + super.getDataDeLancamento() );
        System.out.println("Temporadas: " + this.temporada);
        System.out.println("Tempo total da serie: " + getDuracaoEmMinutos());
        System.out.println("Incluido no plano: " + super.isIncluidoNoPlano());
        System.out.println("Avaliação: " + super.pegaMedia());
    }

    @Override
    public String toString() {
        return "Série: " + super.getNome() + "( " + super.getDataDeLancamento() + " )";
    }
}
