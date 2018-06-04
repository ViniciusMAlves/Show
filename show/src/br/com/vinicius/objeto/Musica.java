/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

/**
 *
 * @author SATC
 */
public class Musica {

    private String Artista;
    private String musica;
    private String genero;
    private int tempo;

    public Musica(String Artista, String musica, String genero, int tempo) {
        this.Artista = Artista;
        this.musica = musica;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Musica{" + "Artista=" + Artista + ", musica=" + musica + ", genero=" + genero + ", tempo=" + tempo + '}';
    }

}
