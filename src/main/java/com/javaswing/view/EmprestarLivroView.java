/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javaswing.view;

import com.javaswing.controle.LivroControle;
import com.javaswing.controle.UsuarioControle;
import com.javaswing.modelo.Livro;
import com.javaswing.modelo.Usuario;
import com.javaswing.service.Util;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jorge Lescura
 */
public class EmprestarLivroView extends javax.swing.JFrame {
    private Usuario usuarioEmprestimo;
    private Livro livroEmprestimo;
    /**
     * Creates new form LivroConsultarView
     */
    public EmprestarLivroView() {
        initComponents();
        setLocationRelativeTo( null );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtConsultarUsuario = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtConsultarLivro = new javax.swing.JTextField();
        btnConsultar1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dataAtual = new javax.swing.JTextField();
        CalculoDevolucao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE USUARIO");
        setSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Data Devoluçao");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 90, 27));
        getContentPane().add(txtConsultarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 230, 27));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        jLabel2.setText("Título");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 63, 27));

        txtConsultarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarLivroActionPerformed(evt);
            }
        });
        getContentPane().add(txtConsultarLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, 27));

        btnConsultar1.setText("Consultar");
        btnConsultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultar1MouseClicked(evt);
            }
        });
        getContentPane().add(btnConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 48, 63, 27));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        jLabel4.setText("Tipo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 63, 27));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 80, -1));

        jLabel5.setText("Quantidade");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 63, 27));

        jLabel6.setText("Data Atual");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 63, 27));

        dataAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAtualActionPerformed(evt);
            }
        });
        getContentPane().add(dataAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 80, -1));

        CalculoDevolucao.setText("Calcular");
        CalculoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculoDevolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(CalculoDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConsultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultar1MouseClicked
        LivroControle livroControle = new LivroControle();
        UsuarioControle usuarioControle = new UsuarioControle();
        
        Usuario usuarioEmprestimo = new Usuario();
        Livro livroEmprestimo = new Livro();
        
        livroEmprestimo.setTitulo(txtConsultarLivro.getText());
        usuarioEmprestimo.setNome(txtConsultarUsuario.getText());
        
        
       try {
            livroEmprestimo = livroControle.consultarTitulo(livroEmprestimo);
            usuarioEmprestimo = usuarioControle.consultarNome(usuarioEmprestimo);
        } catch (SQLException ex) {
            Logger.getLogger(LivroExcluirView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(usuarioEmprestimo.getTipo() == 1 ){
            jTextField2.setText("Professor");
        }else if(usuarioEmprestimo.getTipo() == 2){
            jTextField2.setText("Aluno");
        }else{
            jTextField2.setText("Funcionário");
        }
       
        jTextField1.setText(String.valueOf(livroEmprestimo.getQuantidade()));
        
        
    }//GEN-LAST:event_btnConsultar1MouseClicked

    private void txtConsultarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarLivroActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void dataAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataAtualActionPerformed

    private void CalculoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculoDevolucaoActionPerformed
        UsuarioControle usuarioControle = new UsuarioControle();
        Usuario usuarioEmprestimo = new Usuario(); 
        Util devolucao = new Util();
        
        try {
            usuarioEmprestimo = usuarioControle.consultarNome(usuarioEmprestimo);
            Date dataSaida = devolucao.stringToDate(dataAtual.getText());
        
            Date dataDevolucao = devolucao.calcularDevolucao(dataSaida,usuarioEmprestimo.getTipo());
        } catch (SQLException ex) {
            Logger.getLogger(LivroExcluirView.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        jTextField3.setText(dataDevolucao.toString());
                
    }//GEN-LAST:event_CalculoDevolucaoActionPerformed

    /**
     * @param args the command line arguments
     */
    


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculoDevolucao;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField dataAtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtConsultarLivro;
    private javax.swing.JTextField txtConsultarUsuario;
    // End of variables declaration//GEN-END:variables
}
