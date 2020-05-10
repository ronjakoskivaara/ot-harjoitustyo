
package paassalaskuharjoitus.domain;
/**
 *The class provides methods for creating randoms between 0 and 50 for subtraction calculations
 */
import java.util.Random;

public class RandomGeneratorForSubtraction {
    
    private Random random;
    
    public RandomGeneratorForSubtraction() {
        this.random = new Random();
    }
    /** 
     * The method creates the first random in the subtraction between 0 and 50
     * @return returns the random
     */
    public int returnFirstRandomForSubtraction() {
        int first = random.nextInt(51);
        return first;
    }
    /** 
     * The method creates the second random in the subtraction to be smaller than the first one, but above 0
     * @return returns the random
     */
    public int returnSecondRandomForSubtraction(int first) {
        int second = random.nextInt(first);
        return second;
    }
    
}
