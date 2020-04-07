/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import paassalaskuharjoitus.domain.RandomGeneratorForSum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koskiron
 */
public class RandomGeneratorForSumTest {
    
    RandomGeneratorForSum random;
    
    @Before
    public void setUp() {
        this.random = new RandomGeneratorForSum();
    }   
    @Test
    public void generatedNumberBelow51() {
        int test = this.random.returnRandomForSum();
        assertTrue(test < 51);
    }
    @Test
    public void methodReturnsARandom() {
        int test = this.random.returnRandomForSum();
        assertFalse(test >= 51);
    }
}
