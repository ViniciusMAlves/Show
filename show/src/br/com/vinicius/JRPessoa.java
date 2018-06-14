/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import Singleton.SCandidato;
import Singleton.SJurado;
import br.com.vinicius.objeto.Candidato;
import br.com.vinicius.objeto.Jurado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class JRPessoa extends javax.swing.JFrame {

    SimpleDateFormat sdp = new SimpleDateFormat("dd/MM/yyyy");
    Candidato c;
    Jurado j;

    void desabilitarJurado() {

        this.jTFEspecialisacao.setEnabled(false);
      
    }

    void abilitarJurado() {

        this.jTFEspecialisacao.setEnabled(true);
        
    }

    void desabilitarCandidato() {
        this.jTFNacionalidade.setEnabled(false);
        this.jTFProfissao.setEnabled(false);
       
    }

    void abilitarCandidato() {
       this.jTFNacionalidade.setEnabled(true);
        this.jTFProfissao.setEnabled(true);
       
    }

    /**
     * Creates new form Pessoa
     */
    public JRPessoa() {
        initComponents();
        desabilitarJurado();
        desabilitarCandidato();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCadastro = new javax.swing.JLabel();
        jPnlCadidato = new javax.swing.JPanel();
        jLblCandidatos = new javax.swing.JLabel();
        jLblNacionalidade = new javax.swing.JLabel();
        jTFNacionalidade = new javax.swing.JTextField();
        jLblProfissao = new javax.swing.JLabel();
        jTFProfissao = new javax.swing.JTextField();
        jPnlJurados = new javax.swing.JPanel();
        jLblJurados = new javax.swing.JLabel();
        jLblEspecialidade = new javax.swing.JLabel();
        jTFEspecialisacao = new javax.swing.JTextField();
        jRBCandidato = new javax.swing.JRadioButton();
        jRBJurado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblId = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLblDataNascimento2 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFDataNascimento = new javax.swing.JTextField();
        jBtnCadastrar = new javax.swing.JButton();
        jRBMascolino = new javax.swing.JRadioButton();
        jRBfeminino = new javax.swing.JRadioButton();
        jRBOutro = new javax.swing.JRadioButton();
        jBtnSair = new javax.swing.JButton();
        jBtnCansuta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblCadastro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLblCadastro.setText("Cadastro");

        jPnlCadidato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));

        jLblCandidatos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLblCandidatos.setText("Candidatos");

        jLblNacionalidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNacionalidade.setText("Nacionalidade :");

        jLblProfissao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblProfissao.setText("Profissão :");

        javax.swing.GroupLayout jPnlCadidatoLayout = new javax.swing.GroupLayout(jPnlCadidato);
        jPnlCadidato.setLayout(jPnlCadidatoLayout);
        jPnlCadidatoLayout.setHorizontalGroup(
            jPnlCadidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCadidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlCadidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlCadidatoLayout.createSequentialGroup()
                        .addGroup(jPnlCadidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblNacionalidade)
                            .addComponent(jLblProfissao)
                            .addComponent(jTFProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnlCadidatoLayout.createSequentialGroup()
                        .addGroup(jPnlCadidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblCandidatos)
                            .addComponent(jTFNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))))
        );
        jPnlCadidatoLayout.setVerticalGroup(
            jPnlCadidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlCadidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblCandidatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblNacionalidade)
                .addGap(1, 1, 1)
                .addComponent(jTFNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblProfissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlJurados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));

        jLblJurados.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLblJurados.setText("Jurados");

        jLblEspecialidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblEspecialidade.setText("Especialisação :");

        javax.swing.GroupLayout jPnlJuradosLayout = new javax.swing.GroupLayout(jPnlJurados);
        jPnlJurados.setLayout(jPnlJuradosLayout);
        jPnlJuradosLayout.setHorizontalGroup(
            jPnlJuradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlJuradosLayout.createSequentialGroup()
                .addGroup(jPnlJuradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlJuradosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnlJuradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblEspecialidade)
                            .addComponent(jTFEspecialisacao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPnlJuradosLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLblJurados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlJuradosLayout.setVerticalGroup(
            jPnlJuradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlJuradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblJurados)
                .addGap(18, 18, 18)
                .addComponent(jLblEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEspecialisacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jRBCandidato.setText("Candidato");
        jRBCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCandidatoActionPerformed(evt);
            }
        });

        jRBJurado.setText("Jurado");
        jRBJurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBJuradoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Você é :");

        jLblNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblNome.setText("Nome :");

        jLblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblId.setText("Codigo :");

        jLblSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblSexo.setText("Sexo :");

        jLblDataNascimento2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblDataNascimento2.setText("Data de Nascimento :");

        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jRBMascolino.setText("Mascolino");

        jRBfeminino.setText("Feminino");

        jRBOutro.setText("Outros");

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnCansuta.setText("Consutar");
        jBtnCansuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCansutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jRBJurado)
                            .addComponent(jRBCandidato)
                            .addComponent(jLblNome)
                            .addComponent(jLblId)
                            .addComponent(jLblSexo)
                            .addComponent(jLblDataNascimento2)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCansuta)
                                .addGap(15, 15, 15)
                                .addComponent(jBtnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBMascolino)
                                .addGap(18, 18, 18)
                                .addComponent(jRBfeminino))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLblCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jRBOutro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPnlCadidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnlJurados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBCandidato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBJurado)
                        .addGap(27, 27, 27)
                        .addComponent(jLblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblDataNascimento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBMascolino)
                            .addComponent(jRBfeminino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBOutro)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnCadastrar)
                            .addComponent(jBtnSair)
                            .addComponent(jBtnCansuta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPnlCadidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPnlJurados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCandidatoActionPerformed
        if (jRBJurado.isSelected()) {
            desabilitarJurado();
        }
        abilitarCandidato();
    }//GEN-LAST:event_jRBCandidatoActionPerformed

    private void jRBJuradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBJuradoActionPerformed
        if (jRBCandidato.isSelected()) {
            desabilitarCandidato();
        }
        abilitarJurado();

    }//GEN-LAST:event_jRBJuradoActionPerformed

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        String nome, nascionalidade, proficao, especialidade;
        char sexo = ' ';
        int codigo;
        Date dataNascimento = null;

        nome = jTFNome.getText();
        codigo = Integer.parseInt(jTFId.getText());

        try {
            dataNascimento = sdp.parse(jTFDataNascimento.getText());
        } catch (ParseException ex) {
            Logger.getLogger(JRPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jRBMascolino.isSelected()) {
            sexo = 'm';
        } else {
            if (jRBfeminino.isSelected()) {
                sexo = 'f';
            } else {
                if (jRBOutro.isSelected()) {
                    sexo = 'o';
                }
            }
        }

        if (jRBCandidato.isSelected()) {
            nascionalidade = jTFNacionalidade.getText();
            proficao = jTFProfissao.getText();

            c = new Candidato(nascionalidade, proficao, nome, WIDTH, dataNascimento, WIDTH, sexo);
            SCandidato.getInstance().getCandidato().add(c);
        } else {
            if (jRBJurado.isSelected()) {
                especialidade = jTFEspecialisacao.getText();
                j = new Jurado(especialidade, nome, WIDTH, dataNascimento, WIDTH, sexo);
                SJurado.getInstance().getCandidato().add(j);
            }
        }
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnCansutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCansutaActionPerformed
        if (jRBCandidato.isSelected()) {
            JOptionPane.showMessageDialog(this, c.toString());
        } else {
            if (jRBJurado.isSelected()) {
                JOptionPane.showMessageDialog(this, j.toString());
            }
        }
    }//GEN-LAST:event_jBtnCansutaActionPerformed

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
            java.util.logging.Logger.getLogger(JRPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnCansuta;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCadastro;
    private javax.swing.JLabel jLblCandidatos;
    private javax.swing.JLabel jLblDataNascimento2;
    private javax.swing.JLabel jLblEspecialidade;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblJurados;
    private javax.swing.JLabel jLblNacionalidade;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblProfissao;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JPanel jPnlCadidato;
    private javax.swing.JPanel jPnlJurados;
    private javax.swing.JRadioButton jRBCandidato;
    private javax.swing.JRadioButton jRBJurado;
    private javax.swing.JRadioButton jRBMascolino;
    private javax.swing.JRadioButton jRBOutro;
    private javax.swing.JRadioButton jRBfeminino;
    private javax.swing.JTextField jTFDataNascimento;
    private javax.swing.JTextField jTFEspecialisacao;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNacionalidade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFProfissao;
    // End of variables declaration//GEN-END:variables
}