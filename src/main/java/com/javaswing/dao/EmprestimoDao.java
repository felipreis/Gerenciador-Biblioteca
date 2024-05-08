/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;


import com.javaswing.modelo.Emprestimo;
import com.javaswing.modelo.Livro;
import com.javaswing.modelo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author felip
 */
public class EmprestimoDao  {

  
    public boolean emprestarLivro(Emprestimo emprestimo) {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
                
        String query = "INSERT INTO emprestimo (usuario,livro,saida,devolucao) values (" +
                "'" +   emprestimo.getCodUsuario()  + "'," +
                "'" +   emprestimo.getCodLivro()   + "'," +
                "'" +   emprestimo.getDataAtualString() + "'," +
                "'" + emprestimo.getDataDevolucaoString()+ "'" + ")";
        
        
        
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            conexao.desconectar(connection);
            return true;
        }catch (SQLException ex) {
            System.out.print(ex.initCause(ex));
            return false;
        } 
        
       
        
        
    }

    
    public boolean devolverLivro(Usuario usuario, Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public List<Livro> livroPorUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
