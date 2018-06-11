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
public class Apresentacao {
    private String autoral;
    private String adaptado;
    private float media;
    private Candidato candidato;
    private Musica musica;

    public Apresentacao(String autoral, String adaptado, float media) {
        this.autoral = autoral;
        this.adaptado = adaptado;
        this.media = media;
        
    }

    public String getAutoral() {
        return autoral;
    }

    public void setAutoral(String autoral) {
        this.autoral = autoral;
    }

    public String getAdaptado() {
        return adaptado;
    }

    public void setAdaptado(String adaptado) {
        this.adaptado = adaptado;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "Apresentacao{" + "autoral=" + autoral + ", adaptado=" + adaptado + ", media=" + media + ", candidato=" + candidato + ", musica=" + musica + '}';
    }
    
    
}
