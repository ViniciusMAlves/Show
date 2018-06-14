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
public class Jurado extends Pessoa{
    
    private String especialidade;

    public Jurado(String especialidade, String nome, int id, Date dataNascimento, int idade, char sexo) {
        super(nome, id, dataNascimento, sexo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString()+ "Jurado : " + "especialidade=" + especialidade ;
    }
    
    
    
}
