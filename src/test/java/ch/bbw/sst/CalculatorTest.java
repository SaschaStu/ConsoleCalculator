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
    public void testiSummeMaxValue(){
        assertTrue(testee.summe(100, 2000000)< Integer.MAX_VALUE);
    }

    @Test
    public void testiSummeMinValue(){
        assertTrue(testee.summe(-100000, -1870000000)> Integer.MIN_VALUE);
    }

    @Test
    public void testiSumme2Zero(){
        assertTrue(testee.summe(0,0)== 0);
    }

    @Test
    public void testiSumme1Zero1Neg(){
        assertTrue(testee.summe(0,-1)==-1);
    }

    @Test
    public void testiSumme1Zero1Pos(){
        assertTrue(testee.summe(0,1)==1);
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

    @Test(expected = ArithmeticException.class)
    public void testiDivisionExpected(){
        assertEquals(true,testee.division(1,0));
    }

    @Test
    public void testiDivisionUnexpected() throws ArithmeticException{
        assertTrue(testee.division(5,1)==5);
    }

    @Test
    public void testihToMin(){
        assertTrue(testee.hToMin(4)==240);
    }

    //Generell unit testet man keine privaten Methoden direkt
    //Zwar wäre es indirekt durch Reflections möglich aber das wäre sehr aufwendig.
    /*@Test
    public void testiminToSec(){
        assertTrue(testee.minToSec(3)==180);
    }*/
}