/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class DaoTabela extends AbstractTableModel{
    
    
    private ArrayList linhas;
    private String[] colunas;

    public DaoTabela(ArrayList linha,String[] col) {
        setLinhas(linha);
        setColunas(col);
    }
    
    
    
    
   

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
        
        
    }
    
}
