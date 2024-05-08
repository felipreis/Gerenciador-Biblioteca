/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author felip
 */
public class Util {
    
    
    public Date stringToDate(String data) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        Date dataF = format.parse(data);
        return dataF;
    }
    
    
    public Date calcularDevolucao(Date dataSaida, int status){
        Date dataEntrega;
        
        if(status == 1){
          dataEntrega = ;
        }else if( status == 2){
           dataEntrega = dataSaida;
        }else if (status == 3){
            dataEntrega = dataSaida;
        }
        return dataEntrega;
    }
    

    
}
