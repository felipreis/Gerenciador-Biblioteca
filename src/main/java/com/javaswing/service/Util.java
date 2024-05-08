/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author felip
 */
public class Util {
    
    
    public Date stringToDate(String data) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataF = format.parse(data);
        return dataF;
    }
    
    
    public String calcularDevolucao(Date dataSaida, int status){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataSaida);
        
        if(status == 1){
          calendar.add(Calendar.DAY_OF_MONTH,14);
        }else if( status == 2){
          calendar.add(Calendar.DAY_OF_MONTH,7);
        }else if (status == 3){
            calendar.add(Calendar.DAY_OF_MONTH,21);
        }else{
            System.out.println("ERRO");
        }
        
        return sdf.format(calendar.getTime());
    }
    

    
}
