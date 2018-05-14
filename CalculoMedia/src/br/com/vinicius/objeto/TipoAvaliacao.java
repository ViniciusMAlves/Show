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
public enum TipoAvaliacao {
    prova("prova"),
    trabalho("trabalho"),
    seminario("seminario");
    
    private String nome;

    private TipoAvaliacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoAvaliacao{" + "nome=" + nome + '}';
    }
    
    
    
    
}
