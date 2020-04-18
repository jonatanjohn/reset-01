package br.com.cwi.reset.tinderapi.dominio;

public class Curiosidade {

    private Integer id;

    private String descricao;

    private String estiloCuriosidades;

    public Curiosidade(Integer id, String descricao, String estiloCuriosidades) {
        this.id = id;
        this.descricao = descricao;
        this.estiloCuriosidades = estiloCuriosidades;
    }

    public Curiosidade(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstiloCuriosidades() {
        return estiloCuriosidades;
    }

    public void setEstiloCuriosidades(String estiloCuriosidades) {
        this.estiloCuriosidades = estiloCuriosidades;
    }
}
