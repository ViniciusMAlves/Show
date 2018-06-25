/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Candidato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SCandidato {
   private List<Candidato> candidato = new ArrayList();

    public List<Candidato> getCandidato() {
        return candidato;
    }
   
   
    private SCandidato() {
    }
    
    public static SCandidato getInstance() {
        return SPessoaHolder.INSTANCE;
    }
    
    private static class SPessoaHolder {

        private static final SCandidato INSTANCE = new SCandidato();
    }

    @Override
    public String toString() {
        return "\n" + "candidato=" + candidato ;
    }
    
    
}
