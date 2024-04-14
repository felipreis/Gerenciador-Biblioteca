/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.dao;

import com.javaswing.modelo.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;


/**
 *
 * @author felip
 */
public class UsuarioDao {
    
    
    public boolean cadastrar(Usuario usuario) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
                
        String query = "INSERT INTO usuario (nome,telefone,cidade) values (" +
                "'" +   usuario.getNome()  + "'," +
                "'" +   usuario.getTelefone()   + "'," +
                "'" +   usuario.getCidade() + "'" +
                 ")";
        
        
        
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
    
    public ArrayList<Usuario> consultar(Usuario usuario) throws SQLException {
        ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();
        
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectar();
        String query = "SELECT * FROM usuario where nome like '" + usuario.getNome() + "%'";
        Statement statement =  connection.createStatement();
        ResultSet retorno =  statement.executeQuery(query);
        
          
        while (retorno.next()){
            Usuario usuarioRetorno = new Usuario();     
                usuarioRetorno.setCodigo(retorno.getInt("codigo"));
                usuarioRetorno.setNome(retorno.getString("Nome"));
                usuarioRetorno.setTelefone(retorno.getString("Telefone"));
                usuarioRetorno.setCidade(retorno.getString("Cidade"));
                listUsuario.add(usuarioRetorno);
        }
        
        return listUsuario;
    }
}
