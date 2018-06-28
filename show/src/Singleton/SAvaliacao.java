/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Avaliacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SAvaliacao {
    private List<Avaliacao> avaliacao = new ArrayList<>();

    public List<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    @Override
    public String toString() {
        return "SAvaliacao{" + "avaliacao=" + avaliacao + '}';
    }

    
    
    
    private SAvaliacao() {
    }
    
    public static SAvaliacao getInstance() {
        return SAvaliaçãoHolder.INSTANCE;
    }
    
    private static class SAvaliaçãoHolder {

        private static final SAvaliacao INSTANCE = new SAvaliacao();
    }
}
