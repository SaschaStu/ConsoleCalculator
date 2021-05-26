package ch.bbw.sst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator testee;

    @Before
    public void setUP(){
        testee = new Calculator();
    }
    @Test
    public void testiSumme2PosOK() {
        assertTrue(testee.summe(10,25) == 35);
    }
    @Test
    public void testiSumme2NegOK(){
        assertTrue(testee.summe(-1,-2) == -3);
    }

    @Test
    public void testiSumme1Neg1PosOK(){
        assertTrue(testee.summe(-1,3) == 2);
    }

    @Test
    public void testiSubtraktion2PosOK() {
        assertTrue(testee.subtraktion(25,10)==15);
    }

    @Test
    public void testiSubtraktion2NegOK(){
        assertTrue(testee.subtraktion(-1,-2) == 1);
    }

    @Test
    public void testiSubtraktion1Neg1PosOK(){
        assertTrue(testee.subtraktion(-3,5) == -8);
    }
}