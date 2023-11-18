/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade_Telas;

import javax.swing.JButton;
import javax.swing.JLabel;
import projeto_faculdade_Controller.Controller;

/**
 *
 * @author Sávio
 */
public class TelaMenu extends javax.swing.JFrame {

    Controller  controller;
    TelaMenu telaMenu;
    public TelaMenu() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ButtonALUNO = new javax.swing.JButton();
        ButtonResponsavel = new javax.swing.JButton();
        ButtonNotas = new javax.swing.JButton();
        ButtonDiretoria = new javax.swing.JButton();
        ButtonHistorico = new javax.swing.JButton();
        ButtonSair1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonSair.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonSair.setForeground(new java.awt.Color(0, 0, 255));
        ButtonSair.setText("SAIR");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        ButtonALUNO.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        ButtonALUNO.setForeground(new java.awt.Color(0, 0, 255));
        ButtonALUNO.setText("Aluno");
        ButtonALUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonALUNOActionPerformed(evt);
            }
        });

        ButtonResponsavel.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        ButtonResponsavel.setForeground(new java.awt.Color(0, 0, 255));
        ButtonResponsavel.setText("Responsável");
        ButtonResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResponsavelActionPerformed(evt);
            }
        });

        ButtonNotas.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        ButtonNotas.setForeground(new java.awt.Color(0, 0, 255));
        ButtonNotas.setText("Notas");
        ButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNotasActionPerformed(evt);
            }
        });

        ButtonDiretoria.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        ButtonDiretoria.setForeground(new java.awt.Color(0, 0, 255));
        ButtonDiretoria.setText("Diretoria");
        ButtonDiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiretoriaActionPerformed(evt);
            }
        });

        ButtonHistorico.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        ButtonHistorico.setForeground(new java.awt.Color(0, 0, 255));
        ButtonHistorico.setText("Histórico");
        ButtonHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHistoricoActionPerformed(evt);
            }
        });

        ButtonSair1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonSair1.setForeground(new java.awt.Color(0, 0, 244));
        ButtonSair1.setText("Sair");
        ButtonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSair1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonALUNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(ButtonNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(ButtonDiretoria, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(ButtonHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ButtonSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(ButtonDiretoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ButtonHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(ButtonSair1)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BANCO DE DADOS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESCOLAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(948, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonSair)
                        .addGap(569, 569, 569))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(312, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSair)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1062, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonALUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonALUNOActionPerformed
        TelaAluno telaAluno = new TelaAluno();
        telaAluno.setVisible(true);
        
    }//GEN-LAST:event_ButtonALUNOActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResponsavelActionPerformed
        TelaResponsavel telaResponsavel = new TelaResponsavel();
        telaResponsavel.setVisible(true);
    }//GEN-LAST:event_ButtonResponsavelActionPerformed

    private void ButtonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNotasActionPerformed
        TelaNotas telaNotas = new TelaNotas();
        telaNotas.setVisible(true);
    }//GEN-LAST:event_ButtonNotasActionPerformed

    private void ButtonDiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiretoriaActionPerformed
        TelaDiretoria telaDiretoria = new TelaDiretoria();
        telaDiretoria.setVisible(true);
    }//GEN-LAST:event_ButtonDiretoriaActionPerformed

    private void ButtonHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHistoricoActionPerformed
        TelaHistórico telaHistórico = new TelaHistórico();
        telaHistórico.setVisible(true);
    }//GEN-LAST:event_ButtonHistoricoActionPerformed

    private void ButtonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSair1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ButtonSair1ActionPerformed

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public TelaMenu getTelaMenu() {
        return telaMenu;
    }

    public void setTelaMenu(TelaMenu telaMenu) {
        this.telaMenu = telaMenu;
    }

    public JButton getButtonALUNO() {
        return ButtonALUNO;
    }

    public void setButtonALUNO(JButton ButtonALUNO) {
        this.ButtonALUNO = ButtonALUNO;
    }

    

    public JButton getButtonSair() {
        return ButtonSair;
    }

    public void setButtonSair(JButton ButtonSair) {
        this.ButtonSair = ButtonSair;
    }

    

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    

    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonALUNO;
    private javax.swing.JButton ButtonDiretoria;
    private javax.swing.JButton ButtonHistorico;
    private javax.swing.JButton ButtonNotas;
    private javax.swing.JButton ButtonResponsavel;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JButton ButtonSair1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
