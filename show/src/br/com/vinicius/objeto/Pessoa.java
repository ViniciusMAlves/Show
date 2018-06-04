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
public abstract class Pessoa {

    private String nome;
    private int id;
    private Date dataNascimento;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int id, Date dataNascimento, int idade, char sexo) {
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", id=" + id + ", dataNascimento=" + dataNascimento + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
