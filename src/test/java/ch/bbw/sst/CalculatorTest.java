package ch.bbw.sst;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator testee;
    @Test
    public void summe() {
        testee = new Calculator();
        assertTrue(testee.summe(10,25) == 35);
    }

    @Test
    public void subtraktion() {
        testee = new Calculator();
        assertTrue(testee.subtraktion(25,10)==15);
    }
}