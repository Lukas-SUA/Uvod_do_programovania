/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consoleapp;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
//import java.io.Console;
import java.io.*;

/**
 *
 * @author KEAI
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here  
        int a = 0;
        int b = 0; 
        int sum = 0; 
        String retazec = ""; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("hello java...");

        System.out.println("Enter value a ");
        a = scan.nextInt(); 
        System.out.println(" Value a: " + a);
        
        System.out.println("Enter value b ");
        b = scan.nextInt();
        System.out.println(" Value b:" + b);
        
        sum = a + b; 
        System.out.println(" Suma: " + sum);        

        System.out.println(" Zadaj retazec ");
        retazec = scan.next(); 
        System.out.println(" Zadau si retazec: " +retazec +",  suma je:"+sum);
        

        scan.nextLine();
        scan.nextLine();

        
        /*n = new BufferedReader(
                new InputStreamReader(System.in));
        retazec = stdin.readLine(); 
        System.out.print(" Zadau si retazec: " +retazec);*/ 
        //scan.nextLine();
    }
}
