/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class test1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("cual es tu nombre? ");
        
        String nombre = input.nextLine();
        System.out.print("Hola ");
        System.out.print(nombre);
        System.out.println("!!!");
    }
  
}
