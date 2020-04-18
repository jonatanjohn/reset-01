package br.com.cwi.reset.tinderapi.dominio;

import java.time.LocalDate;

public class Filme {

    private Integer id;

    private String nome;

    private String diretor;

    private String estiloFilme;

    private LocalDate lancamento;

    private String sinopse;

    public Filme(Integer id, String nome, String diretor, String estiloFilme, LocalDate lancamento, String sinopse) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.estiloFilme = estiloFilme;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
    }

    public Filme(){

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

    public String getEstiloFilme() {
        return estiloFilme;
    }

    public void setEstiloFilme(String estiloFilme) {
        this.estiloFilme = estiloFilme;
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
}
