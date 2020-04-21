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
public class Subtraction {
    
    private int first;
    private int second;
    private int answer;
    private RandomGeneratorForSubtraction generator;
    
    public Subtraction() {
        this.generator = new RandomGeneratorForSubtraction();
    }
    public String printCalculation() {
        this.first = generator.returnFirstRandomForSubtraction();
        this.second = generator.returnSecondRandomForSubtraction(this.first);
        this.answer = this.first - this.second;
        return ("Laske " +  this.first + " - " + this.second);
    }
    public String compareAnswer(String s) {
        try {
            int playerAnswer = Integer.valueOf(s);
            if (playerAnswer == this.answer) {
                return "Oikein";
            } else {
                return "Väärin";
            }
        } catch (Exception e) {
            return "Et syöttänyt numeroa";
        }
    }
        
    public String printCalculationClassInstruction() {
        return "Miinuslaskujen harjoittelua";
    } 
    
}
