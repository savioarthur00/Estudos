/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade_Telas;


import java.sql.SQLException;
import java.util.ArrayList;
import javafx.scene.control.TextField;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import projeto_faculdade.DAO.DAOAluno;
import projeto_faculdade.DAO.DaoTabela;
import projeto_faculdade.Fachada.Fachada;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.SqlUtil.SQL_Connection;
import projeto_faculdade_Controller.Controller;

/**
 *
 * @author Sávio
 */
public class TelaAluno extends javax.swing.JFrame {

    SQL_Connection conex_sql =  new SQL_Connection();
    int flag=0;
    Aluno aluno = new Aluno();
    Controller  controller;
    public TelaAluno() {
       
        initComponents();  
         this.setLocationRelativeTo(null);
        preencherTabela("select *from alunos order by nome");
              
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonNovoAluno = new javax.swing.JButton();
        ButtonEditarAluno = new javax.swing.JButton();
        ButtonSalvarAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelpesquisarAluno = new javax.swing.JLabel();
        fieldNomeAlunoBuscar = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        fieldCidade = new javax.swing.JTextField();
        fieldUf = new javax.swing.JTextField();
        fieldNacionalidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAluno = new javax.swing.JTable();
        labelID = new javax.swing.JLabel();
        fieldID = new javax.swing.JFormattedTextField();
        ButtonVoltar = new javax.swing.JButton();
        fieldCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonNovoAluno.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonNovoAluno.setForeground(new java.awt.Color(0, 0, 255));
        ButtonNovoAluno.setText("NOVO ALUNO");
        ButtonNovoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoAlunoActionPerformed(evt);
            }
        });

        ButtonEditarAluno.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonEditarAluno.setForeground(new java.awt.Color(0, 0, 255));
        ButtonEditarAluno.setText("EDITAR ALUNO");
        ButtonEditarAluno.setEnabled(false);
        ButtonEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarAlunoActionPerformed(evt);
            }
        });

        ButtonSalvarAluno.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonSalvarAluno.setForeground(new java.awt.Color(0, 0, 255));
        ButtonSalvarAluno.setText("SALVAR ALUNO");
        ButtonSalvarAluno.setEnabled(false);
        ButtonSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarAlunoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("RG:");

        fieldNome.setEnabled(false);

        fieldRG.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Data:");

        fieldData.setEnabled(false);
        fieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Cidade:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("UF:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Nacionalidade:");

        LabelpesquisarAluno.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        LabelpesquisarAluno.setForeground(new java.awt.Color(0, 0, 255));
        LabelpesquisarAluno.setText("Pesquisar Aluno:");

        fieldNomeAlunoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeAlunoBuscarActionPerformed(evt);
            }
        });

        ButtonBuscar.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonBuscar.setForeground(new java.awt.Color(0, 0, 255));
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        fieldCidade.setEnabled(false);

        fieldUf.setEnabled(false);

        fieldNacionalidade.setEnabled(false);

        TabelaAluno.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        TabelaAluno.setForeground(new java.awt.Color(0, 0, 255));
        TabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TabelaAluno);
        if (TabelaAluno.getColumnModel().getColumnCount() > 0) {
            TabelaAluno.getColumnModel().getColumn(0).setResizable(false);
            TabelaAluno.getColumnModel().getColumn(1).setResizable(false);
            TabelaAluno.getColumnModel().getColumn(2).setResizable(false);
            TabelaAluno.getColumnModel().getColumn(3).setResizable(false);
        }

        labelID.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(0, 0, 255));
        labelID.setText("ID:");

        fieldID.setEditable(false);
        fieldID.setEnabled(false);

        ButtonVoltar.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonVoltar.setForeground(new java.awt.Color(0, 0, 255));
        ButtonVoltar.setText("VOLTAR MENU");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        fieldCPF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonNovoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEditarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addComponent(ButtonSalvarAluno)
                    .addComponent(ButtonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldRG)
                            .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(LabelpesquisarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNomeAlunoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNovoAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEditarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSalvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(fieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelpesquisarAluno)
                    .addComponent(fieldNomeAlunoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAlunoActionPerformed
        
         
        if(flag==1){
        Aluno aluno = new Aluno(fieldNome.getText(),fieldCPF.getText(),fieldCidade.getText(),
                fieldUf.getText(),fieldNacionalidade.getText(),fieldRG.getText(),fieldData.getText());
                           

        if(Fachada.getInstance().salvarAluno(aluno)){
           
            
            Fachada.getInstance().getAllAluno();
            JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso"
                    );
        }else if(Fachada.getInstance().salvarAluno(aluno) == false){
            JOptionPane.showMessageDialog(null,"Preencha corretamente os dados");
            
        }
        
       }else{
            aluno.setId(Integer.parseInt(fieldID.getText()));
             
            aluno.setNome(fieldNome.getText());
            aluno.setCpf(fieldCPF.getText());
            aluno.setNacionalidade(fieldNacionalidade.getText());
            aluno.setRg(fieldRG.getText());
            aluno.setCidade(fieldCidade.getText());
            aluno.setUF(fieldUf.getText());
            aluno.setData(fieldData.getText());
            
            Fachada.getInstance().editarAluno(aluno);
            
            
            
        }
        ButtonNovoAluno.setVisible(true);
        ButtonNovoAluno.setEnabled(true);
        ButtonEditarAluno.setVisible(true);
        ButtonBuscar.setVisible(true);
        LabelpesquisarAluno.setVisible(true);
        fieldNomeAlunoBuscar.setVisible(true);
        
       
        
        
        
    }//GEN-LAST:event_ButtonSalvarAlunoActionPerformed

    private void ButtonNovoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoAlunoActionPerformed
        limparTela();
        flag =1;  
   
     fieldID.setVisible(false);
     labelID.setVisible(false);
     
     fieldNome.setEnabled(true);
     fieldUf.setEnabled(true);
     fieldCidade.setEnabled(true);   
     fieldData.setEnabled(true);
     fieldNacionalidade.setEnabled(true);
     fieldRG.setEnabled(true);
     fieldCPF.setEnabled(true);
     
     
     ButtonSalvarAluno.setEnabled(true);     
    
     ButtonEditarAluno.setEnabled(false);
     ButtonBuscar.setEnabled(false);
     
     
    
     
        
        
        
        
    }//GEN-LAST:event_ButtonNovoAlunoActionPerformed

    private void fieldNomeAlunoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeAlunoBuscarActionPerformed
               
        
        
        
    }//GEN-LAST:event_fieldNomeAlunoBuscarActionPerformed

    private void ButtonEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarAlunoActionPerformed
       
        flag=2;
        habilitar();
        fieldNomeAlunoBuscar.setVisible(false);
        LabelpesquisarAluno.setVisible(false);
        ButtonBuscar.setVisible(false);       
        ButtonEditarAluno.setVisible(false);
        ButtonNovoAluno.setVisible(false);
        ButtonSalvarAluno.setVisible(true);
        
        
    }//GEN-LAST:event_ButtonEditarAlunoActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        
        Aluno aluno = new Aluno();
        
        aluno.setPesquisa(fieldNomeAlunoBuscar.getText());
        Fachada.getInstance().buscarAluno(aluno);
        
        JOptionPane.showMessageDialog(null,"Encontrado");
        
        
        
        fieldID.setText(String.valueOf(aluno.getId()));
        fieldNome.setText(aluno.getNome());
        fieldUf.setText(aluno.getUF());
        fieldCidade.setText(aluno.getCidade());
        fieldData.setText(aluno.getData());
        fieldNacionalidade.setText(aluno.getNacionalidade());
        fieldRG.setText(aluno.getRg());
        fieldCPF.setText(aluno.getCpf());          
          
     
        ButtonEditarAluno.setEnabled(true);
        ButtonSalvarAluno.setEnabled(false);
        ButtonNovoAluno.setVisible(false);   
        
        
        
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void fieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataActionPerformed

    
    public void habilitar(){
     fieldNome.setEnabled(true);
     fieldUf.setEnabled(true);
     fieldCidade.setEnabled(true);
     
     fieldData.setEnabled(true);
     fieldNacionalidade.setEnabled(true);
     fieldRG.setEnabled(true);
     fieldCPF.setEnabled(true);
         
     ButtonSalvarAluno.setEnabled(true);
        
    }
    public void limparTela(){
         fieldNome.setText("");
         fieldCPF.setText("");
         fieldCidade.setText("");
         fieldUf.setText("");
         fieldNacionalidade.setText("");         
         fieldRG.setText("");         
         fieldData.setText("");
    }
    
    
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{
        "ID", "Nome","CPF","RG","UF","Cidade","Nacionalidade","Data"
        };
        conex_sql.Connection();
        
        conex_sql.executaSql(Sql);
        
        try {
            conex_sql.rs.first();
            do {                
                dados.add(new Object[]{conex_sql.rs.getInt("id"),conex_sql.rs.getString("nome"),
                    conex_sql.rs.getString("cpf"),conex_sql.rs.getString("rg"),conex_sql.rs.getString("uf"),
                    conex_sql.rs.getString("cidade"),
                    conex_sql.rs.getString("nacionalidade"),
                    conex_sql.rs.getString("data")});
                
            } while (conex_sql.rs.next());
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher Array List");
        }
        DaoTabela daoTabela = new DaoTabela(dados, colunas);
        TabelaAluno.setModel(daoTabela);
        
        TabelaAluno.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaAluno.getColumnModel().getColumn(0).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(1).setPreferredWidth(160);
        TabelaAluno.getColumnModel().getColumn(1).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(2).setPreferredWidth(110);
        TabelaAluno.getColumnModel().getColumn(2).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(3).setPreferredWidth(110);
        TabelaAluno.getColumnModel().getColumn(3).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(4).setPreferredWidth(50);
        TabelaAluno.getColumnModel().getColumn(4).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(5).setPreferredWidth(110);
        TabelaAluno.getColumnModel().getColumn(5).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(6).setPreferredWidth(110);
        TabelaAluno.getColumnModel().getColumn(6).setResizable(false);
        TabelaAluno.getColumnModel().getColumn(7).setPreferredWidth(110);
        TabelaAluno.getColumnModel().getColumn(7).setResizable(false);
        
        
        
        TabelaAluno.getTableHeader().setReorderingAllowed(false);
       TabelaAluno.setAutoResizeMode(TabelaAluno.AUTO_RESIZE_OFF);
        TabelaAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex_sql.desconection();
        
        
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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditarAluno;
    private javax.swing.JButton ButtonNovoAluno;
    private javax.swing.JButton ButtonSalvarAluno;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelpesquisarAluno;
    private javax.swing.JTable TabelaAluno;
    private javax.swing.JFormattedTextField fieldCPF;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JFormattedTextField fieldData;
    private javax.swing.JFormattedTextField fieldID;
    private javax.swing.JTextField fieldNacionalidade;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNomeAlunoBuscar;
    private javax.swing.JTextField fieldRG;
    private javax.swing.JTextField fieldUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    // End of variables declaration//GEN-END:variables
}
