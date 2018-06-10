/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author fernando_2
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public Boolean add(Cliente cliente) {
        String sql = "INSERT INTO clientes "
                   + "(nome, cnpj, ie, telefone, ramal, contato, setor, email, endereco, " +
                     "numero, bairro, cep, estado, cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCnpj());
            pstmt.setString(3, cliente.getIe());
            pstmt.setString(4, cliente.getTelefone());            
            pstmt.setString(5, cliente.getRamal());            
            pstmt.setString(6, cliente.getContato());            
            pstmt.setString(7, cliente.getSetor());
            pstmt.setString(8, cliente.getEmail());            
            pstmt.setString(9, cliente.getEndereco());            
            pstmt.setString(10, cliente.getNumero());
            pstmt.setString(11, cliente.getBairro());
            pstmt.setString(12, cliente.getCep());
            pstmt.setString(13, cliente.getEstado());
            pstmt.setString(14, cliente.getCidade());
            
            pstmt.executeUpdate();
            pstmt.close();
            
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        
        return false;        

    }
    
    public DefaultTableModel getData() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nome");
        dtm.addColumn("CNPJ");
        //dtm.addColumn("IE");
        //dtm.addColumn("Telefone");
        //dtm.addColumn("Ramal");
        dtm.addColumn("Contato");
        //dtm.addColumn("Setor");
        //dtm.addColumn("Email");
        //dtm.addColumn("Endereço");
        //dtm.addColumn("Número");
        //dtm.addColumn("Bairro");
        //dtm.addColumn("CEP");
        dtm.addColumn("Estado");
        dtm.addColumn("Cidade");
        
        String sql = "SELECT * FROM clientes";
        
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                dtm.addRow(new String[]{
                            rs.getString("id"), 
                            rs.getString("nome"), 
                            rs.getString("cnpj"), 
                            //rs.getString("ie"), 
                            //rs.getString("telefone"), 
                            //rs.getString("ramal"), 
                            rs.getString("contato"), 
                            //rs.getString("setor"), 
                            //rs.getString("email"), 
                            //rs.getString("endereco"), 
                            //rs.getString("numero"), 
                            //rs.getString("bairro"), 
                            //rs.getString("cep"), 
                            rs.getString("estado"), 
                            rs.getString("cidade"), 
                             });
            }
            
            return dtm;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
  
    }
    
}
