package Curiosidades;

import java.time.LocalDate;

public class Curiosidade {

    private int id;

    private String descricao;

    private EstiloCuriosidades estiloCuriosidades;

      public Curiosidade(String descricao, EstiloCuriosidades estiloCuriosidades) {
        this.descricao = descricao;
        this.estiloCuriosidades = estiloCuriosidades;

    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstiloCuriosidades getEstiloCuriosidades() {
        return estiloCuriosidades;
    }

    public void setEstiloCuriosidades(final EstiloCuriosidades estiloCuriosidades) {
        this.estiloCuriosidades = estiloCuriosidades;
    }



    @Override
    public String toString() {
        return "Curiosidade{" +
                "id: " + id +
                ", descricao: '" + descricao + '\'' +
                ", categoria: '" + estiloCuriosidades + '\'' +
                '}';
    }
}
