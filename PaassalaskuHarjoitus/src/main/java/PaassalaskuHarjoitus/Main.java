/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaassalaskuHarjoitus;

import PaassalaskuHarjoitus.domain.Sum;
import java.util.Scanner;

/**
 *
 * @author koskiron
 */
public class Main {
    public static void main(String[] args) { 
        Scanner reader = new Scanner(System.in); 
        System.out.println("Tervetuloa päässälaskuharjoitteluun");
        System.out.println("Lopettaaksesi harjoittelu paina enter");
        
        boolean help = true;
        
        while(help) {
            Sum sumCalculation = new Sum();
            sumCalculation.printCalculation();
            String answer = reader.nextLine();
            if (answer.equals("")) {
                help = false;
            }
            else {
                sumCalculation.compareAnswer(answer);
            }
        }
        System.out.println("Kiitos!");
        
        

 }
    
}
