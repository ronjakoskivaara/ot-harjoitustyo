
package paassalaskuharjoitus.domain;


/**
 *The class provides methods for creating random sum and checking them.
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
    /**
     * The method prints a random sum calculation, and saves the correct answer for further use
     *
     * @return prints the sum instructions for the user to see
     */
    public String printCalculation() {
        this.first = generator.returnRandomForSum();
        this.second = generator.returnRandomForSum();
        this.answer = this.first + this.second;
        return ("Laske " +  this.first + " + " + this.second);
    }
    /**
     * The method compares the answer the user has given to the correct answer
     * 
     * @param s users answer
     *
     * @return prints correct if the answer was correct, wrong and the correct answer if it was incorrect and a note to write only numbers if the user used letters
     */
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
    /** 
     * The method prints instructions
     * 
     * @return prints the instruction for the user to see 
     */ 
    public String printCalculationClassInstruction() {
        return "Pluslaskujen harjoittelua";
    }   
}
