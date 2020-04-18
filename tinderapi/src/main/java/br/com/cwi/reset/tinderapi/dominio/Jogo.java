package br.com.cwi.reset.tinderapi.dominio;

import java.time.LocalDate;

public class Jogo {

    private Integer id;

    private String nome;

    private String publisher;

    private String estiloJogo;

    private LocalDate lancamento;

    private String plataforma;

    public Jogo(Integer id, String nome, String publisher, String estiloJogo, LocalDate lancamento, String plataforma) {
        this.id = id;
        this.nome = nome;
        this.publisher = publisher;
        this.estiloJogo = estiloJogo;
        this.lancamento = lancamento;
        this.plataforma = plataforma;
    }

    public Jogo (){

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEstiloJogo() {
        return estiloJogo;
    }

    public void setEstiloJogo(String estiloJogo) {
        this.estiloJogo = estiloJogo;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
