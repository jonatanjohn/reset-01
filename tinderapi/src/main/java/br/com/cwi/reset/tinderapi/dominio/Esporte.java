package br.com.cwi.reset.tinderapi.dominio;

public class Esporte {

    private Integer id;

    private String nome;

    public Esporte(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Esporte(){

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
}
