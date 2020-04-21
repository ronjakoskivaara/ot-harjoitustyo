/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import paassalaskuharjoitus.domain.Subtraction;

/**
 *
 * @author koskiron
 */
public class SubtractionTest {
    
    private Subtraction subtraction;
    private Random random;
    
    @Before
    public void setUp() {
        this.subtraction = new Subtraction();
        this.random = new Random();
    }
    @Test
    public void printCalculationReturnsString() {
        assertTrue(subtraction.printCalculation() instanceof String);
    }
    @Test
    public void printCalculationInstructionReturnsString() {
        assertTrue(subtraction.printCalculationClassInstruction() instanceof String);
    }
    @Test
    public void notAnsweringANumberCreatesException() {
        assertEquals("Et syöttänyt numeroa", subtraction.compareAnswer("a"));
    }
}
