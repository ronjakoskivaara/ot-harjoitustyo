/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaassalaskuHarjoitus.domain;
import PaassalaskuHarjoitus.domain.RandomGeneratorForSum;


/**
 *
 * @author koskiron
 */
public class Sum {
    //rajaus luvut 0-50
    private int first;
    private int second;
    private int answer;
    private RandomGeneratorForSum generator;
    
    public Sum() {
        this.generator = new RandomGeneratorForSum();      
    }
    
    
    public void printCalculation() {
        this.first = generator.returnRandomForSum();
        this.second = generator.returnRandomForSum();
        this.answer = this.first + this.second;
        System.out.println("Laske " +  this.first + " + " + this.second);
    }
    public void compareAnswer(String s) {
        try {
            int playerAnswer = Integer.valueOf(s);
            if (playerAnswer == this.answer) {
                System.out.println("Oikein");
            } else {
                System.out.println("Väärin");
            }
        }
        catch (Exception e) {
            System.out.println("Et syöttänyt numeroa");
        }
    } 
    
    }
