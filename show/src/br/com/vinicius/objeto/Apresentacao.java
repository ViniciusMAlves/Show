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
    private Boolean autoral;
    private Boolean adaptado;
    private float media;
    private Candidato candidato;
    private Musica musica;

    public Apresentacao(Boolean autoral, Boolean adaptado, float media) {
        this.autoral = autoral;
        this.adaptado = adaptado;
        this.media = media;
        
        
    }

    public Boolean getAutoral() {
        return autoral;
    }

    public void setAutoral(Boolean autoral) {
        this.autoral = autoral;
    }

    public Boolean getAdaptado() {
        return adaptado;
    }

    public void setAdaptado(Boolean adaptado) {
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
        return "Apresentacao : " + "autoral=" + autoral + "\n, adaptado=" + adaptado + "\n, media=" + media + "\n, candidato=" + candidato + "\n, musica=" + musica ;
    }
    
    
}
