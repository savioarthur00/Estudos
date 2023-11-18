/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade_Telas;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import projeto_faculdade.DAO.DaoTabela;
import projeto_faculdade.Fachada.Fachada;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Diretoria;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class TelaDiretoria extends javax.swing.JFrame {
    
   SQL_Connection conex_sql =  new SQL_Connection(); 
   int flag=0;
   Diretoria diretoria = new Diretoria();
    public TelaDiretoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        preencherTabela("select *from diretoria order by nome");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldNomeDiretorBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonBuscar = new javax.swing.JButton();
        fieldNomeDiretor = new javax.swing.JTextField();
        fieldNomeInst = new javax.swing.JTextField();
        fieldcontato = new javax.swing.JTextField();
        fieldEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDiretoria = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldIDDiretor = new javax.swing.JFormattedTextField();
        ButtonEditarDiretoria = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ButtonVoltar = new javax.swing.JButton();
        ButtonSalvarDiretoria = new javax.swing.JButton();
        LabelpesquisarAluno = new javax.swing.JLabel();
        fieldCPFDiretor = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        ButtonNova = new javax.swing.JButton();
        fieldBuscarNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Instituição");

        fieldNomeDiretorBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeDiretorBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CPF:");

        ButtonBuscar.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonBuscar.setForeground(new java.awt.Color(0, 0, 255));
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        fieldNomeDiretor.setText("Exemplo: José Perera Lins ");
        fieldNomeDiretor.setEnabled(false);

        fieldNomeInst.setText("Exemplo:  Escola Carlos Rios");
        fieldNomeInst.setEnabled(false);

        fieldcontato.setText("Exemplo: (87)0000-0000");
        fieldcontato.setEnabled(false);

        fieldEndereco.setText("Exemplo: Rua Joaquim Nunes - Centro");
        fieldEndereco.setEnabled(false);

        TabelaDiretoria.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        TabelaDiretoria.setForeground(new java.awt.Color(0, 0, 255));
        TabelaDiretoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TabelaDiretoria);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Nome Diretor");

        labelID.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(0, 0, 255));
        labelID.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Telefone:");

        fieldIDDiretor.setEditable(false);
        fieldIDDiretor.setEnabled(false);

        ButtonEditarDiretoria.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonEditarDiretoria.setForeground(new java.awt.Color(0, 0, 255));
        ButtonEditarDiretoria.setText("Editar Diretoria");
        ButtonEditarDiretoria.setEnabled(false);
        ButtonEditarDiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarDiretoriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Endereço:");

        ButtonVoltar.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonVoltar.setForeground(new java.awt.Color(0, 0, 255));
        ButtonVoltar.setText("Voltar ao Menu");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        ButtonSalvarDiretoria.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonSalvarDiretoria.setForeground(new java.awt.Color(0, 0, 255));
        ButtonSalvarDiretoria.setText("Salvar Diretoria");
        ButtonSalvarDiretoria.setEnabled(false);
        ButtonSalvarDiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarDiretoriaActionPerformed(evt);
            }
        });

        LabelpesquisarAluno.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        LabelpesquisarAluno.setForeground(new java.awt.Color(0, 0, 255));
        LabelpesquisarAluno.setText("Pesquisar Diretor:");

        fieldCPFDiretor.setText("Exemplo:  000.000.000-00");
        fieldCPFDiretor.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nº");

        fieldNumero.setText("Exemplo:1012");
        fieldNumero.setEnabled(false);

        ButtonNova.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        ButtonNova.setForeground(new java.awt.Color(0, 0, 255));
        ButtonNova.setText("Nova Direção");
        ButtonNova.setEnabled(false);
        ButtonNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 244));
        jLabel4.setText("Buscar Instituição:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 244));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonEditarDiretoria, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(ButtonSalvarDiretoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonNova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNomeDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldIDDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldNomeInst, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldCPFDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelpesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldNomeDiretorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(fieldIDDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonNova, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEditarDiretoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldNomeInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldNomeDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSalvarDiretoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fieldCPFDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(fieldcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelpesquisarAluno)
                    .addComponent(fieldNomeDiretorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeDiretorBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeDiretorBuscarActionPerformed

    }//GEN-LAST:event_fieldNomeDiretorBuscarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed

        
        Diretoria diretoria = new Diretoria();
        
        diretoria.setPesquisa(fieldNomeDiretorBuscar.getText());
        Fachada.getInstance().buscar_diretoria(diretoria);        

        JOptionPane.showMessageDialog(null,"Encontrado");

        fieldIDDiretor.setText(String.valueOf(diretoria.getId_direcao()));
        fieldNomeInst.setText(diretoria.getNome_instituicao());
        fieldcontato.setText(diretoria.getContato());
        fieldNomeDiretor.setText(diretoria.getNome_diretor());
        fieldEndereco.setText(diretoria.getEndereco());
        fieldCPFDiretor.setText(diretoria.getCpf_diretor());
        
        ButtonEditarDiretoria.setEnabled(true);
        ButtonSalvarDiretoria.setEnabled(false);
        

    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEditarDiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarDiretoriaActionPerformed

        flag=2;
        habilitar();
        fieldNomeDiretorBuscar.setVisible(false);
        LabelpesquisarAluno.setVisible(false);
        ButtonBuscar.setVisible(false);
        ButtonEditarDiretoria.setVisible(false);
        ButtonSalvarDiretoria.setVisible(true);
        ButtonSalvarDiretoria.setEnabled(true);

    }//GEN-LAST:event_ButtonEditarDiretoriaActionPerformed

    public void habilitar(){
     
        fieldNomeInst.setEnabled(true);
        fieldcontato.setEnabled(true);
        fieldNomeDiretor.setEnabled(true);
        fieldEndereco.setEnabled(true);
        fieldCPFDiretor.setEnabled(true);
        
        
    }
    
    
    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void ButtonSalvarDiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarDiretoriaActionPerformed

        if(flag==1){
            Diretoria diretoria = new Diretoria(fieldNomeInst.getText(),fieldNomeDiretor.getText(), fieldCPFDiretor.getText(),
                    fieldEndereco.getText(),fieldcontato.getText(),fieldNumero.getText());
           

            if(Fachada.getInstance().salvarDiretor(diretoria)){

                Fachada.getInstance().getAllAluno();
                JOptionPane.showMessageDialog(null,"Diretoria cadastrada com sucesso"
                );
            }else{
                JOptionPane.showMessageDialog(null,"Erro");
            }

        }else{
            diretoria.setId_direcao(Integer.parseInt(fieldIDDiretor.getText()));

            diretoria.setNome_instituicao(fieldNomeInst.getText());
            diretoria.setCpf_diretor(fieldCPFDiretor.getText());
            diretoria.setEndereco(fieldEndereco.getText());
            diretoria.setNome_diretor(fieldNomeDiretor.getText());
            diretoria.setContato(fieldcontato.getText());
            diretoria.setNumero(fieldNumero.getText());

            Fachada.getInstance().editarDiretor(diretoria);

        }
        
        ButtonEditarDiretoria.setEnabled(false);
        ButtonBuscar.setVisible(true);
        LabelpesquisarAluno.setVisible(true);
        fieldNomeDiretorBuscar.setVisible(true);

    }//GEN-LAST:event_ButtonSalvarDiretoriaActionPerformed

    private void ButtonNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovaActionPerformed
         
      flag =1;  
   
     fieldIDDiretor.setVisible(false);
     labelID.setVisible(false);
     
     fieldcontato.setEnabled(true);
     fieldCPFDiretor.setEnabled(true);
     fieldEndereco.setEnabled(true);   
     fieldNomeDiretor.setEnabled(true);
     fieldNomeInst.setEnabled(true);
     fieldNumero.setEnabled(true);
     
     
     
     ButtonSalvarDiretoria.setEnabled(true);     
    
     ButtonEditarDiretoria.setEnabled(false);
     ButtonBuscar.setEnabled(false);
     
    }//GEN-LAST:event_ButtonNovaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
         
        
        diretoria.setPesquisa(fieldBuscarNome.getText());
        Fachada.getInstance().buscar_diretoria(diretoria);
        
        JOptionPane.showMessageDialog(null,"Encontrado");
        
        
        
        fieldIDDiretor.setText(String.valueOf(diretoria.getId_direcao()));
        fieldNomeDiretor.setText(diretoria.getNome_diretor());
        fieldCPFDiretor.setText(diretoria.getCpf_diretor());
        fieldEndereco.setText(diretoria.getEndereco());
        fieldNomeInst.setText(diretoria.getNome_instituicao());
        fieldNumero.setText(diretoria.getNumero());
        fieldcontato.setText(diretoria.getContato());
        
          
     
        ButtonEditarDiretoria.setEnabled(true);
        ButtonSalvarDiretoria.setEnabled(false);
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{
        "ID", "Instituição","Diretor","CPF","Endereço","Numero","Contato"
        };
        conex_sql.Connection();
        
        conex_sql.executaSql(Sql);
        
        try {
            conex_sql.rs.first();
            do {                
                dados.add(new Object[]{conex_sql.rs.getInt("id"),conex_sql.rs.getString("nome"),
                    conex_sql.rs.getString("diretor"),conex_sql.rs.getString("cpf"),conex_sql.rs.getString("endereco"),
                    conex_sql.rs.getString("numero"),
                    conex_sql.rs.getString("contato")
                    });
                
            } while (conex_sql.rs.next());
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher Array List");
        }
        DaoTabela daoTabela = new DaoTabela(dados, colunas);
        TabelaDiretoria.setModel(daoTabela);
        
        TabelaDiretoria.getColumnModel().getColumn(0).setPreferredWidth(50);
        TabelaDiretoria.getColumnModel().getColumn(0).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(1).setPreferredWidth(160);
        TabelaDiretoria.getColumnModel().getColumn(1).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(2).setPreferredWidth(160);
        TabelaDiretoria.getColumnModel().getColumn(2).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(3).setPreferredWidth(160);
        TabelaDiretoria.getColumnModel().getColumn(3).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(4).setPreferredWidth(190);
        TabelaDiretoria.getColumnModel().getColumn(4).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(5).setPreferredWidth(50);
        TabelaDiretoria.getColumnModel().getColumn(5).setResizable(false);
        TabelaDiretoria.getColumnModel().getColumn(6).setPreferredWidth(160);
        TabelaDiretoria.getColumnModel().getColumn(6).setResizable(false);
        
        
        
        TabelaDiretoria.getTableHeader().setReorderingAllowed(false);
      TabelaDiretoria.setAutoResizeMode(TabelaDiretoria.AUTO_RESIZE_OFF);
        TabelaDiretoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(TelaDiretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDiretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDiretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDiretoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDiretoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditarDiretoria;
    private javax.swing.JButton ButtonNova;
    private javax.swing.JButton ButtonSalvarDiretoria;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelpesquisarAluno;
    private javax.swing.JTable TabelaDiretoria;
    private javax.swing.JTextField fieldBuscarNome;
    private javax.swing.JFormattedTextField fieldCPFDiretor;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JFormattedTextField fieldIDDiretor;
    private javax.swing.JTextField fieldNomeDiretor;
    private javax.swing.JTextField fieldNomeDiretorBuscar;
    private javax.swing.JTextField fieldNomeInst;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldcontato;
    private javax.swing.JButton jButton1;
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
