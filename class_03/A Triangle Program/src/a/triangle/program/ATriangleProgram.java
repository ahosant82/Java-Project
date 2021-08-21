/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.triangle.program;

import java.util.Scanner;

/**
 *
 * @author Study
 */
public class ATriangleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input= new Scanner(System.in);
        System.out.println("Determining The Area of a Triangle Program in Java:");
        //Triangle base-->b
        System.out.print("Triangle Base  -");
        float b= user_input.nextFloat();
        //Triangle height-->h
        System.out.print("Triangle Height - ");
         float h =user_input.nextFloat() ;  
        float area = ( b*h) / 2 ;  
                         System.out.println("Area of Triangle is: "+area);
                         System.out.print("\n End Program");
    }
    
}
