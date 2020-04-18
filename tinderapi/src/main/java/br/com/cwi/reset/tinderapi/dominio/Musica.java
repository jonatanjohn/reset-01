package br.com.cwi.reset.tinderapi.dominio;

import java.time.LocalDate;

public class Musica {

    private Integer id;

    private String nome;

    private String artista;

    private String estiloMusical;

    private LocalDate lancamento;

    public Musica(Integer id, String nome, String artista, String estiloMusical, LocalDate lancamento) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.estiloMusical = estiloMusical;
        this.lancamento = lancamento;
    }

    public Musica() {
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }
}

