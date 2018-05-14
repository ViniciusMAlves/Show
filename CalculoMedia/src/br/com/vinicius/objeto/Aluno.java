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
public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Nota> notas = new ArrayList<>();

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

   

    public Aluno setNotas(float n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", notas=" + notas + '}';
    }

   
    
    
}
