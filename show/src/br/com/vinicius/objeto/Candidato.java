/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Candidato extends Pessoa{
    private String Nascionalidade;
    private String profissao;

    public Candidato(String Nascionalidade, String profissao, String nome, int id, Date dataNascimento, int idade, char sexo) {
        super(nome, id, dataNascimento, idade, sexo);
        this.Nascionalidade = Nascionalidade;
        this.profissao = profissao;
    }

    public String getNascionalidade() {
        return Nascionalidade;
    }

    public void setNascionalidade(String Nascionalidade) {
        this.Nascionalidade = Nascionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Candidato{" + "Nascionalidade=" + Nascionalidade + ", profissao=" + profissao + '}';
    }
    
    
    
}
