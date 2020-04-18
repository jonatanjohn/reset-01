package br.com.cwi.reset.tinderapi.dominio;

import java.time.LocalDate;

public class Serie {

    private Integer id;

    private String nome;

    private String diretor;

    private String estiloSerie;

    private LocalDate lancamento;

    private String sinopse;

    private int numeroTemporada;

    private int numeroEpisodio;

    public Serie(Integer id, String nome, String diretor, String estiloSerie, LocalDate lancamento, String sinopse, int numeroTemporada, int numeroEpisodio) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.estiloSerie = estiloSerie;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodio = numeroEpisodio;
    }

    public Serie() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstiloSerie() {
        return estiloSerie;
    }

    public void setEstiloSerie(String estiloSerie) {
        this.estiloSerie = estiloSerie;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }
    }


