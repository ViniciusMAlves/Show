/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import br.com.vinicius.objeto.Aluno;
import br.com.vinicius.objeto.Nota;
import br.com.vinicius.objeto.TipoAvaliacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class Pricipal extends javax.swing.JFrame {
     ArrayList<Aluno> alunos = new ArrayList<>();
     ArrayList<Nota> notas = new ArrayList<>();
     ArrayList<TipoAvaliacao> tipos = new ArrayList<>();
     TipoAvaliacao tipo = null;
     float calculo;
     
   
    
    /**
     * Creates new form Pricipal
     */
    public Pricipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCalculoMedia = new javax.swing.JLabel();
        jPAluno = new javax.swing.JPanel();
        jLAlunos = new javax.swing.JLabel();
        jLMatricula = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jPNomeDisciplina = new javax.swing.JPanel();
        jLNomeDisciplina = new javax.swing.JLabel();
        jTFNomeDisciplica = new javax.swing.JTextField();
        jCBDisciplina = new javax.swing.JComboBox<>();
        jPNotas = new javax.swing.JPanel();
        jLNotas = new javax.swing.JLabel();
        jLN1 = new javax.swing.JLabel();
        jLN2 = new javax.swing.JLabel();
        jLN3 = new javax.swing.JLabel();
        jLN4 = new javax.swing.JLabel();
        jTFN1 = new javax.swing.JTextField();
        jTFN2 = new javax.swing.JTextField();
        jTFN3 = new javax.swing.JTextField();
        jTFN4 = new javax.swing.JTextField();
        jBCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLCalculoMedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLCalculoMedia.setText("Calculo de medias");

        jPAluno.setBorder(new javax.swing.border.MatteBorder(null));

        jLAlunos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLAlunos.setText("Aluno");

        jLMatricula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLMatricula.setText("Matricula");

        jLNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLNome.setText("Nome");

        jBCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAlunos)
                .addGap(59, 59, 59))
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFMatricula)
                    .addComponent(jTFNome)
                    .addGroup(jPAlunoLayout.createSequentialGroup()
                        .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLMatricula)
                            .addComponent(jLNome))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBCadastrar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addGap(37, 37, 37))
        );

        jPNomeDisciplina.setBorder(new javax.swing.border.MatteBorder(null));

        jLNomeDisciplina.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLNomeDisciplina.setText("Nome da Disciplina");

        jCBDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma das opções", "Prova", "Trabalho", "Seminario" }));
        jCBDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPNomeDisciplinaLayout = new javax.swing.GroupLayout(jPNomeDisciplina);
        jPNomeDisciplina.setLayout(jPNomeDisciplinaLayout);
        jPNomeDisciplinaLayout.setHorizontalGroup(
            jPNomeDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNomeDisciplinaLayout.createSequentialGroup()
                .addGroup(jPNomeDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNomeDisciplinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFNomeDisciplica))
                    .addGroup(jPNomeDisciplinaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLNomeDisciplina)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPNomeDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPNomeDisciplinaLayout.setVerticalGroup(
            jPNomeDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNomeDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeDisciplina)
                .addGap(18, 18, 18)
                .addComponent(jTFNomeDisciplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPNotas.setBorder(new javax.swing.border.MatteBorder(null));

        jLNotas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLNotas.setText("Notas");

        jLN1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLN1.setText("N1");

        jLN2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLN2.setText("N2");

        jLN3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLN3.setText("N3");

        jLN4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLN4.setText("N4");

        jBCalcular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPNotasLayout = new javax.swing.GroupLayout(jPNotas);
        jPNotas.setLayout(jPNotasLayout);
        jPNotasLayout.setHorizontalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPNotasLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLNotas))
                            .addGroup(jPNotasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFN1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPNotasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLN2)
                                    .addComponent(jLN3)
                                    .addComponent(jLN4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFN3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFN2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFN4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCalcular)))
                .addContainerGap())
        );
        jPNotasLayout.setVerticalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNotas)
                .addGap(18, 18, 18)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLN1))
                .addGap(21, 21, 21)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLN2)
                    .addComponent(jTFN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLN3))
                .addGap(18, 18, 18)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLN4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBCalcular)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLCalculoMedia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCalculoMedia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPNomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        float n1,n2,n3,n4;
        
        n1=Float.parseFloat(jTFN1.getText());
        n2=Float.parseFloat(jTFN2.getText());
        n3=Float.parseFloat(jTFN3.getText());
        n4=Float.parseFloat(jTFN4.getText());
        
        
        
        calculo=(n1+n2+n3+n4)/4;
       
        JOptionPane.showMessageDialog(this, calculo);
        
        
        switch(jCBDisciplina.getSelectedIndex()){
            case 1: {
             tipo = TipoAvaliacao.prova;
             break;
            }
            case 2: {
                tipo = TipoAvaliacao.trabalho;
                break;
            }
            case 3:{
                tipo = TipoAvaliacao.seminario;
                break;
            }
        }
        
        
        
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        
        String nome,disciplina;
        int matricula;
        float nota;
     try{   
        matricula =Integer.parseInt(jTFMatricula.getText() ); 
        nome = jTFNome.getText();
        disciplina = jTFNomeDisciplica.getText();
        nota=calculo;
     } catch(NumberFormatException nfe){
         JOptionPane.showMessageDialog(this, "Voce digitou um caracter errado !!!");
         throw new RuntimeException();
     }
        
       tipos.add(tipo);
       alunos.add( new Aluno(nome, matricula)  );
       notas.add(new Nota(disciplina, nota));
       JOptionPane.showMessageDialog(this, alunos.toString()+"\n"+notas.toString()+"\n"+ tipos.toString()); 
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jCBDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDisciplinaActionPerformed
        new javax.swing.DefaultComboBoxModel(TipoAvaliacao.values());        
    }//GEN-LAST:event_jCBDisciplinaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JComboBox<String> jCBDisciplina;
    private javax.swing.JLabel jLAlunos;
    private javax.swing.JLabel jLCalculoMedia;
    private javax.swing.JLabel jLMatricula;
    private javax.swing.JLabel jLN1;
    private javax.swing.JLabel jLN2;
    private javax.swing.JLabel jLN3;
    private javax.swing.JLabel jLN4;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNomeDisciplina;
    private javax.swing.JLabel jLNotas;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPNomeDisciplina;
    private javax.swing.JPanel jPNotas;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFN1;
    private javax.swing.JTextField jTFN2;
    private javax.swing.JTextField jTFN3;
    private javax.swing.JTextField jTFN4;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNomeDisciplica;
    // End of variables declaration//GEN-END:variables

    private void add(float n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
