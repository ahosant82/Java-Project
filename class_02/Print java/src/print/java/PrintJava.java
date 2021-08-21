/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.java;
import java.util.Scanner;

/**
 *
 * @author Study
 */
public class PrintJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Welcome To Java Programm");
        //Variables
        int a= 100;
        int x = 20;
        int Addition= a+x;
        float multiplication= x*a;
            //Oparetors
        System.out.println("Java Oparetors :-");
        System.out.println("a+x = "+Addition);
        System.out.println("x*a = "+ multiplication);
     
        
        // user input variables
        System.out.println("INput From  User :"); 
        //Frist input
        System.out.print("Input Frist Value :- ");
        int num1= user_input.nextInt(); 
        // secend input
        System.out.print("Input Secend Value :- ");
        int num2= user_input.nextInt();
        //thered input
        System.out.print("Input Therd Value :- ");
        int num3= user_input.nextInt();
    
        
        //Arethmetic Oparetor (+,-,*,/,%)
        System.out.println("Arethmetic Oparetiona in Java :");
        int addition = num1+num3;
        int subtraction= num3-num1;
        long Multiplicetion= num2*num3;
        float divition= num1/num2;
        System.out.println("The ADDITIONS IS = "+ addition);
        System.out.println("THE SUBTRACTION IS = "+ subtraction);
        System.out.println("THE MULTIPLICETION IS = "+ Multiplicetion);
        System.out.println("THE DIVITIONS = "+ divition);
        System.out.println("\n END THE PROGRAMM");

        
        
        

    }
    
}
