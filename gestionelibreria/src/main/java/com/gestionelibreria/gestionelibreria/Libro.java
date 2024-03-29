package com.gestionelibreria.gestionelibreria;

public class Libro {

    private Integer id;
    private String nome;
    private String autore;
    private Integer annoPubblicazione;

    public Libro(Integer id, String nome, String autore, Integer annoPubblicazione) {
        this.id = id;
        this.nome = nome;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
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

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Integer annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione='" + annoPubblicazione + '\'' +
                '}';
    }
}
