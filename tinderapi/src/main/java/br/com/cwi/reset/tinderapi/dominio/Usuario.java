package br.com.cwi.reset.tinderapi.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Usuario {

    private Integer id;

    private String nome;

    private String email;

    private String telefone;

    private LocalDate dataDeNascimento;

    private String bio;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String linkDaFoto;

    public Usuario(Integer id, String nome, String email, String telefone, LocalDate dataDeNascimento, String bio, BigDecimal latitude, BigDecimal longitude, String linkDaFoto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.linkDaFoto = linkDaFoto;
    }

    public Usuario (){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getLinkDaFoto() {
        return linkDaFoto;
    }

    public void setLinkDaFoto(String linkDaFoto) {
        this.linkDaFoto = linkDaFoto;
    }




}
