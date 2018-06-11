/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Jurado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SJurado {
    
    private List<Jurado> jurado = new ArrayList();

    public List<Jurado> getCandidato() {
        return jurado;
    }
     
     
    
    private SJurado() {
    }
    
    public static SJurado getInstance() {
        return SJuradoHolder.INSTANCE;
    }
    
    private static class SJuradoHolder {

        private static final SJurado INSTANCE = new SJurado();
    }
}
