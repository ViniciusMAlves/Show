/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Apresentacao;
import br.com.vinicius.objeto.Musica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SApresentacao {
   private List<Apresentacao> apresentacao = new ArrayList();
   private List<Musica> musica = new ArrayList();

    public List<Musica> getMusica() {
        return musica;
    }
   
    public List<Apresentacao> getApresentacao() {
        return apresentacao;
    }

    @Override
    public String toString() {
        return "\n" + "apresentacao=" + apresentacao + "\n, musica=" + musica ;
    }
   
   
    
    private SApresentacao() {
    }
    
    public static SApresentacao getInstance() {
        return SApresentacaoHolder.INSTANCE;
    }
    
    private static class SApresentacaoHolder {

        private static final SApresentacao INSTANCE = new SApresentacao();
    }
}
