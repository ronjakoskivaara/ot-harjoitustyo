/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paassalaskuharjoitus.domain;

import java.util.Random;

public class RandomGeneratorForSum {
    //randoms limited 0-50
    private Random random;
    
    public RandomGeneratorForSum() {
        this.random = new Random();
    }
    
    public int returnRandomForSum() {
        int number = random.nextInt(51);
        return number;
    }
}
