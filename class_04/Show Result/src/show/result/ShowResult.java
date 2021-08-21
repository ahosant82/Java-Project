/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show.result;

import java.util.Scanner;

/**
 *
 * @author Study
 */
public class ShowResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //user input install
        Scanner input= new Scanner(System.in);
        
        // start Program 
        System.out.println("  Welcome To Java Programm");
        System.out.println("Dhaka Polytechnic Institute \n   Computer Techknology");
        System.out.println("\n"+"Students Result Informetions :- ");
        //
        System.out.print("Student Board Roll :");
        long roll = input.nextInt();
        System.out.print("Result : ");
        float result= input.nextFloat();
        
        //conditions
        //result > 4.00 then
        if(result > 4.00){
            System.out.println("Invaild Result!");
        }
        //result == 4.00 then
        else if(result == 4.00){
            System.out.println("Greate is = A+ ");
            System.out.println("Prenciple Messege : \n It's Outstanding Result");
        }
        //result => 3.75 = A
        else if(result>=3.75){
            System.out.println("Greate is = A ");
            System.out.println("Prenciple Messege : \n It's Very Good Result");
        }
        //result => 3.50 = A-
        else if(result>=3.50){
            System.out.println("Greate is = A -");
            System.out.println("Prenciple Messege : \n It's Good Result And Herd Working");
        }
        //result => 3.25 = B+
        else if(result>=3.25){
            System.out.println("Greate is = B+ ");
            System.out.println("Prenciple Messege : \n It's Good Result And Herd Working");
        }
        //result => 3.00 = B
        else if(result>=3.00){
            System.out.println("Greate is = B ");
            System.out.println("Prenciple Messege : \n It's Poor Result And Very Herd Working ");
        }
        //result => 2.75 = B-
        else if(result>=2.75){
            System.out.println("Greate is = B- ");
            System.out.println("Prenciple Messege : \n It's Poor Result And Very Herd Working ");
        }
        //result => 2.50 = C+
        else if(result>=2.50){
            System.out.println("Greate is = C+ ");
            System.out.println("Prenciple Messege : \n It's Poor Result And Very Herd Working ");
        }
        //result => 2.25 = C
        else if(result>=2.25){
            System.out.println("Greate is = C ");
            System.out.println("Prenciple Messege : \n It's Very Poor Result And Very Herd Working ");
        }
        //result => 2.00 = D
        else if(result>=2.00){
            System.out.println("Greate is = D ");
            System.out.println("Prenciple Messege : \n It's Very Poor Result And Very Herd Working ");
        }
        //result < 2.00 = F
        else{
            System.out.println("Greate is = F ");
            System.out.println("Prenciple Messege : \n Fail In The Exam And Try Next Year");
        }
        System.out.println("\n\n End The Programm: \n         Develop by A.R.Tonmoy");
    }
    
}
