/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Avaliacao {
   private Apresentacao apresentacao;
   private List<Jurado> jurados;
   private List<Requisito> requisitos;
   private float mediaGeral;

    public Avaliacao(Apresentacao apresentacao, float mediaGeral) {
        this.apresentacao = apresentacao;
        this.mediaGeral = mediaGeral;
    }

    

    

    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
    }

    public List<Jurado> getJurados() {
        return jurados;
    }

    public void setJurados(List<Jurado> jurados) {
        this.jurados = jurados;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

    public float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    @Override
    public String toString() {
        return "Avaliacao : " + "apresentacao=" + apresentacao + "\n" + jurados + "\n" + requisitos + "\n, media Geral=" + mediaGeral ;
    }
   
   
   
}
