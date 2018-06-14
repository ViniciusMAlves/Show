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
public class Requisito {
    private String requisitos;
    private float nota;
    private char status;

    public Requisito(String requisitos, float nota, char status) {
        this.requisitos = requisitos;
        this.nota = nota;
        this.status = status;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Requisito : " + "requisitos=" + requisitos + "\n, nota=" + nota + "\n, status=" + status ;
    }
    
    
}
