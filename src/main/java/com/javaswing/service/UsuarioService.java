/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.UsuarioDao;
import com.javaswing.modelo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author felip
 */
public class UsuarioService {
    public boolean cadastrar(Usuario usuario) throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.cadastrar(usuario);
    }
    
    public ArrayList<Usuario> consultar(Usuario usuario) throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.consultar(usuario);
    }
    
    public boolean excluir(Usuario usuario) throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.excluir(usuario);
    }
    
    public Usuario consultarCodigo(Usuario usuario) throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.consultarCodigo(usuario);
    }
    
    public boolean atualizar(Usuario usuario) throws SQLException{
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.atualizar(usuario);
    }
}
