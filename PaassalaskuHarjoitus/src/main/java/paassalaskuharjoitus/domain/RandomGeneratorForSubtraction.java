/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paassalaskuharjoitus.domain;

import java.util.Random;

// randoms limited so that the first one is bigger than the second
public class RandomGeneratorForSubtraction {
    
    private Random random;
    
    public RandomGeneratorForSubtraction() {
        this.random = new Random();
    }
    
    public int returnFirstRandomForSubtraction() {
        int first = random.nextInt(51);
        return first;
    }
    
    public int returnSecondRandomForSubtraction(int first) {
        int second = random.nextInt(first);
        return second;
    }
    
}
