package Usuario;

import Curiosidades.Curiosidade;
import Esportes.Esporte;
import Filme.Filme;
import Jogos.Jogo;
import Musica.Musica;
import Serie.Serie;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {

    private int id;

    private String nome;

    private String email;

    private double telefone;

    private LocalDate dataDeNascimento;

    private String bio;

    private String latitude;

    private String longitude;

    private String linkDaFoto;

    private ArrayList<Musica> musicasCurtidas = new ArrayList<Musica>();
    private ArrayList<Jogo> jogosCurtidos = new ArrayList<Jogo>();
    private ArrayList<Serie> seriesCurtidas = new ArrayList<Serie>();
    private ArrayList<Filme> filmesCurtidos = new ArrayList<Filme>();
    private ArrayList<Esporte> esportesCurtidos = new ArrayList<Esporte>();
    private ArrayList<Curiosidade> curiosidadesCurtidas = new ArrayList<Curiosidade>();

    public Usuario(String nome, String email, double telefone, LocalDate dataDeNascimento, String bio, String latitude, String longitude, String linkDaFoto) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.linkDaFoto = linkDaFoto;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Musica> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void setMusicasCurtidas(ArrayList<Musica> musicasCurtidas) {
        this.musicasCurtidas = musicasCurtidas;
    }

    public ArrayList<Jogo> getJogosCurtidos() {
        return jogosCurtidos;
    }

    public void setJogosCurtidos(ArrayList<Jogo> jogosCurtidos) {
        this.jogosCurtidos = jogosCurtidos;
    }

    public ArrayList<Serie> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public void setSeriesCurtidas(ArrayList<Serie> seriesCurtidas) {
        this.seriesCurtidas = seriesCurtidas;
    }

    public ArrayList<Filme> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public void setFilmesCurtidos(ArrayList<Filme> filmesCurtidos) {
        this.filmesCurtidos = filmesCurtidos;
    }

    public ArrayList<Esporte> getEsportesCurtidos() {
        return esportesCurtidos;
    }

    public void setEsportesCurtidos(ArrayList<Esporte> esportesCurtidos) {
        this.esportesCurtidos = esportesCurtidos;
    }

    public ArrayList<Curiosidade> getCuriosidadesCurtidas() {
        return curiosidadesCurtidas;
    }

    public void setCuriosidadesCurtidas(ArrayList<Curiosidade> curiosidadesCurtidas) {
        this.curiosidadesCurtidas = curiosidadesCurtidas;
    }

    public String getLinkDaFoto() {
        return linkDaFoto;
    }

    public void setLinkDaFoto(String linkDaFoto) {
        this.linkDaFoto = linkDaFoto;
    }

    public String listarMusicasDoUsuario() {

        String musicas = "";

        for (Musica musica : musicasCurtidas){

            musicas += musica.toString();
        }

        return musicas;
    }

    public String listarFilmesDoUsuario()
    {
        String filmes = "";

        for (Filme filme : filmesCurtidos)
        {
            filmes += filme.toString();
        }

        return filmes;
    }

    public String listarSeriesDoUsuario()
    {
        String series = "";

        for (Serie serie : seriesCurtidas)
        {
            series += serie.toString();
        }

        return series;
    }

    public String listarJogosDoUsuario()
    {
        String jogos = "";

        for (Jogo jogo : jogosCurtidos)
        {
            jogos += jogo.toString();
        }

        return jogos;
    }

    public String listarEsportesDoUsuario()
    {
        String esportes = "";

        for (Esporte esporte : esportesCurtidos)
        {
            esportes += esporte.toString();
        }

        return esportes;
    }

    public String listarCuriosidadesDoUsuario()
    {
        String curiosidades = "";

        for (Curiosidade curiosidade : curiosidadesCurtidas)
        {
            curiosidades += curiosidade.toString();
        }

        return curiosidades;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", email: '" + email + '\'' +
                ", telefone: " + telefone + '\'' +
                ", dataDeNascimento: " + dataDeNascimento + '\'' +
                ", bio: " + bio + '\'' +
                ", latitude: " + latitude + '\'' +
                ", longitude: " + longitude + '\'' +
                '}';
    }
}




