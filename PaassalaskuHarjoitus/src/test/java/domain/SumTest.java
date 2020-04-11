/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paassalaskuharjoitus.domain.Sum;

/**
 *
 * @author koskiron
 */
public class SumTest {
    
    private Sum sum;
    private Random random;
    
    @Before
    public void setUp() {
        this.sum = new Sum();
        this.random = new Random();
    }
    @Test
    public void printCalculationReturnsString() {
        assertTrue(sum.printCalculation() instanceof String);
    }
    @Test
    public void printCalculationInstructionReturnsString() {
        assertTrue(sum.printCalculationClassInstruction() instanceof String);
    }
    @Test
    public void notAnsweringANumberCreatesException() {
        assertEquals("Et syöttänyt numeroa", sum.compareAnswer("a"));
    }
}
