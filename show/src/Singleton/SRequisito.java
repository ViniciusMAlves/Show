/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Requisito;
import java.util.ArrayList;

/**
 *
 * @author SATC
 */
public class SRequisito {
    ArrayList<Requisito> r = new ArrayList<>();

    public ArrayList<Requisito> getR() {
        return r;
    }

    @Override
    public String toString() {
        return "\n" + "requisitos=" + r ;
    }
    
    
    
    private SRequisito() {
    }
    
    public static SRequisito getInstance() {
        return SRequisitosHolder.INSTANCE;
    }
    
    private static class SRequisitosHolder {

        private static final SRequisito INSTANCE = new SRequisito();
    }
}
