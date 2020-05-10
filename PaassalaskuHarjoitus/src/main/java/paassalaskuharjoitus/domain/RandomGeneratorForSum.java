
package paassalaskuharjoitus.domain;

/**
 *The class provides methods for creating randoms between 0 and 50 for sum calculations
 */

import java.util.Random;

public class RandomGeneratorForSum {
    private Random random;
    
    public RandomGeneratorForSum() {
        this.random = new Random();
    }
    /**
     * The method creates a random between 0 and 50
     *
     * @return returns the random
     */    
    public int returnRandomForSum() {
        int number = random.nextInt(51);
        return number;
    }
}
