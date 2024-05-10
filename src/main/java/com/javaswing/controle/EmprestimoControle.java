/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.controle;

import com.javaswing.dao.EmprestimoDao;
import com.javaswing.modelo.Emprestimo;
import com.javaswing.service.EmprestimoService;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class EmprestimoControle {
    
     public boolean emprestarLivro(Emprestimo emprestimo) throws SQLException{
        EmprestimoService emprestimoService = new EmprestimoService();
        return emprestimoService.emprestarLivro(emprestimo);
    }
     
    public Emprestimo consultarEmprestimo(Emprestimo emprestimo) throws SQLException{
        EmprestimoService emprestimoService = new EmprestimoService();
        return emprestimoService.consultarEmprestimo(emprestimo);
    }
    
    public boolean devolverLivro(Emprestimo emprestimo) throws SQLException{
        EmprestimoService emprestimoService = new EmprestimoService();
        return emprestimoService.devolverLivro(emprestimo);
    }
}
