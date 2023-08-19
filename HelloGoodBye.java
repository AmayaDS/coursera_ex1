/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author hp
 */
public class HelloGoodBye {

    public static void main(String[] args) {
        //args  is used to hold the command line arguments
        //here checks whether arguments supplied in the cmd is 2
        if(args.length != 2){
            System.out.println("Two arguments only");
            return;// terminates the program
        }
        
        String name1 = args[0];
        String name2 = args[1];
        
        System.out.println("Hello" + name1 + "and" + name2);
        System.out.println("Goodbye" + name1 + "and" + name2);
        
    }
    
}
