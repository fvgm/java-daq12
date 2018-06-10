/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                   + "(nome, cnpj, ie, telefone, ramal, contato, email, endereco, " +
                     "numero, bairro, cep, estado, cidade) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCnpj());
            pstmt.setString(3, cliente.getIe());
            pstmt.setString(4, cliente.getTelefone());            
            pstmt.setString(5, cliente.getRamal());            
            pstmt.setString(6, cliente.getContato());            
            pstmt.setString(7, cliente.getEmail());            
            pstmt.setString(8, cliente.getEndereco());            
            pstmt.setString(9, cliente.getNumero());
            pstmt.setString(10, cliente.getBairro());
            pstmt.setString(11, cliente.getCep());
            pstmt.setString(12, cliente.getEstado());
            pstmt.setString(13, cliente.getCidade());
            
            pstmt.executeUpdate();
            pstmt.close();
            
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        
        return false;        

    }
    
}
