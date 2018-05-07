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
public class Nota {
    private String disciplica;
    private float nota;    

    public Nota(String disciplica, float nota) {
        this.disciplica = disciplica;
        this.nota = nota;
    }

    public String getDisciplica() {
        return disciplica;
    }

    public void setDisciplica(String disciplica) {
        this.disciplica = disciplica;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "disciplica=" + disciplica + ", nota=" + nota + '}';
    }
    
    
}
