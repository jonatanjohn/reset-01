package Jogos;

import java.time.LocalDate;

public class Jogo {

    private int id;

    private String nome;

    private String publisher;

    private EstiloJogo estiloJogo;

    private LocalDate lancamento;

    private Plataformas plataforma;

    public Jogo(String nome, String publisher, EstiloJogo estiloJogo, LocalDate lancamento, Plataformas plataforma) {

        this.nome = nome;
        this.publisher = publisher;
        this.estiloJogo = estiloJogo;
        this.lancamento = lancamento;
        this.plataforma = plataforma;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public EstiloJogo getEstiloJogo() {
        return estiloJogo;
    }

    public void setEstiloJogo(final EstiloJogo estiloJogo) {
        this.estiloJogo = estiloJogo;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public  Plataformas getPlataformas() {
        return plataforma;
    }
    public void setPlataformas(final Plataformas plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", publisher: '" + publisher + '\'' +
                ", estiloJogo: " + estiloJogo +
                ", lancamento: " + lancamento +
                ", plataforma: " + plataforma +
                '}';
    }
}
