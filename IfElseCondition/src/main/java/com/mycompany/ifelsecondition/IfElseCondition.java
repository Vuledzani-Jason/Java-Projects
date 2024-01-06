/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ifelsecondition;

import java.util.Scanner;

/**
 *
 * @author mpho
 */
public class IfElseCondition {

    public static void main(String[] args) {
       int FirstNumber;
       int SecondNumber;
       int ThirdNumber;
       
    System.out.println("Please enter of the three Numbers");
    Scanner scan = new Scanner (System.in);
    
    FirstNumber = scan.nextInt();
    SecondNumber = scan.nextInt();
    ThirdNumber = scan.nextInt();
    
    if (FirstNumber>SecondNumber && FirstNumber>ThirdNumber)
            System.out.println("The first number is the largest");
    
    else if (SecondNumber>FirstNumber && SecondNumber>ThirdNumber)
            System.out.println("The second number is the largest");
    
    else if (ThirdNumber>FirstNumber && ThirdNumber>SecondNumber)
            System.out.println("The Third Number is the Largest");
    
    else
        System.out.println("Cannot Compute");
             
    }
}
