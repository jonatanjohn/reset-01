package Filme;

import Musica.EstiloMusical;

import java.time.LocalDate;

public class Filme {


    private int id;

    private String nome;

    private String diretor;

    private EstiloFilme estiloFilme;

    private LocalDate lancamento;

    private String sinopse;

    public Filme(String nome, String diretor, EstiloFilme estiloFilme, LocalDate lancamento, String sinopse) {

        this.nome = nome;
        this.diretor = diretor;
        this.estiloFilme = estiloFilme;
        this.lancamento = lancamento;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
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

    public EstiloFilme getEstiloFilme() {
        return estiloFilme;
    }

    public void setEstiloFilme(final EstiloFilme estiloFilme) {
        this.estiloFilme = estiloFilme;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public  String getSinopseFilme() {
        return sinopse;
    }
    public void setSinopseFilme(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", diretor: '" + diretor + '\'' +
                ", estiloFilme: " + estiloFilme +
                ", lancamento: " + lancamento +
                ", sinopse: " + sinopse +
                '}';
    }
}
