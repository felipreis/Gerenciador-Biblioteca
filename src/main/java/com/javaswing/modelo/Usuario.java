/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.modelo;

/**
 *
 * @author Jorge Lescura
 */
public class Usuario {
            private int codigo;
            private String nome;
            private String telefone;
            private String cidade;
            private int tipo;

            public Integer getCodigo() {
                return codigo;
            }

            public void setCodigo(int id) {
                this.codigo = id;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getTelefone() {
                return telefone;
            }

            public void setTelefone(String telefone) {
                this.telefone = telefone;
            }

            public String getCidade() {
                return cidade;
            }

            public void setCidade(String cidade) {
                this.cidade = cidade;
            }
            
            public int getTipo(){
                return this.tipo;
            }
            
            public void setTipo(int tipo){
                this.tipo = tipo;
            }
}
