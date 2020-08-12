/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codebind.calender;

/**
 *
 * @author meghana
 */
import java.util.Calendar;  

public class Calendarclass{
     public static void main(String[] args) {  
   Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -15);  
   System.out.println("15 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 4);  
   System.out.println("4 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 2);  
   System.out.println("2 years later: " + calendar.getTime());  
   }  
}  

