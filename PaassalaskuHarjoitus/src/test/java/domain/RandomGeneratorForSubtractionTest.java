/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import paassalaskuharjoitus.domain.RandomGeneratorForSubtraction;

/**
 *
 * @author koskiron
 */
public class RandomGeneratorForSubtractionTest {
    
    RandomGeneratorForSubtraction random;
    
    @Before
    public void setUp() {
        this.random = new RandomGeneratorForSubtraction();
    }   
    @Test
    public void firstGeneratedNumberBelow51() {
        int test = this.random.returnFirstRandomForSubtraction();
        assertTrue(test < 51);
    }
    @Test
    public void secondGeneratedNumberSmallerThanGiven() {
        int test = this.random.returnSecondRandomForSubtraction(10);
        assertTrue(test < 10);
    }
}
