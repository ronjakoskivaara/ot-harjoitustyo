/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paassalaskuharjoitus.domain;


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
    
    
    public String printCalculation() {
        this.first = generator.returnRandomForSum();
        this.second = generator.returnRandomForSum();
        this.answer = this.first + this.second;
        return ("Laske " +  this.first + " + " + this.second);
    }
    public String compareAnswer(String s) {
        try {
            int playerAnswer = Integer.valueOf(s);
            if (playerAnswer == this.answer) {
                return "Oikein";
            } else {
                return "Väärin, oikea vastaus oli: " + this.answer;
            }
        } catch (Exception e) {
            return "Et syöttänyt numeroa";
        }
    } 
    public String printCalculationClassInstruction() {
        return "Pluslaskujen harjoittelua";
    }   
}
