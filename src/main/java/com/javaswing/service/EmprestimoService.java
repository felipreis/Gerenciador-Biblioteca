/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import com.javaswing.dao.EmprestimoDao;
import com.javaswing.modelo.Emprestimo;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class EmprestimoService {
    
    public boolean emprestarLivro(Emprestimo emprestimo) throws SQLException{
        EmprestimoDao emprestimoDao = new EmprestimoDao();
        return emprestimoDao.emprestarLivro(emprestimo);
    }
    
    public Emprestimo consultarEmprestimo(Emprestimo emprestimo) throws SQLException{
        EmprestimoDao emprestimoDao = new EmprestimoDao();
        return emprestimoDao.consultarEmprestimo(emprestimo);
    }
}
