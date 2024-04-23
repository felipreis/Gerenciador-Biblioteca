/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.modelo.Usuario;
import com.javaswing.service.UsuarioService;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author felip
 */
public class UsuarioControle {
    
     public boolean cadastrar(Usuario usuario) throws SQLException{
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.cadastrar(usuario);
    }
     
     public ArrayList<Usuario> consultar(Usuario usuario) throws SQLException{
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.consultar(usuario);
    }
     
     public boolean excluir(Usuario usuario) throws SQLException{
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.excluir(usuario);
    }
     
     public Usuario consultarCodigo(Usuario usuario) throws SQLException {
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.consultarCodigo(usuario);
    }
     
     public boolean atualizar(Usuario usuario) throws SQLException{
         UsuarioService usuarioService = new UsuarioService();
         return usuarioService.atualizar(usuario);
     }
    
}
