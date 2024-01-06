/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaarraylist;

import java.util.ArrayList;

/**
 *
 * @author Didi
 */
public class JavaArrayList {

    public static void main(String[] args) {
        /*ArrayList =  a resizable array.
                       Elements can be added and removed after complilation phase
                       store reference data types       
        */
        //ArrayList<integer> (This if you making an array of integers)
        ArrayList<String>food = new ArrayList<String>();
        //to add values to the array list use the add function
        food.add("pizza");
        food.add("Hamburger");
        food.add("hotdog");
        
        //The setMethod: this allows you to set a value to a certain index food.set(index, element)
        food.set(0, "Sushi");
        
        //The removeMethod: This allows you to remove a value from a certain 
        food.remove(2);
        
        //The clearMethod allows you to clear everything within a array
        food.clear();
        
    for(int i = 0; i<food.size(); i++){
        System.out.println(food.get(i));
              
    }
    }
}
