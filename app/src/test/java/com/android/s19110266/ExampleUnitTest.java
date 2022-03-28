package com.android.s19110266;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calculator mCalculator = new Calculator();
    //ADD
    @Test
    public void addTwoNumbersEx1() {
        double result = mCalculator.add(1000d,123111d);
        assertEquals(result, 124111d,0);
    }

    @Test
    public void addTwoNumbersEx2() {
        double result = mCalculator.add(-1212d, -2d);
        assertEquals(result, -1214d,0);
    }

    @Test
    public void addTwoNumbersEx3() {
        double result = mCalculator.add(3111.211f, 2.222d);
        assertEquals(result, 3113.433d,0.01d);
    }

    @Test
    public void addTwoNumbersEx4() {
        double result = mCalculator.add(Double.POSITIVE_INFINITY, 2111d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void addTwoNumbersEx5() {
        double result = mCalculator.add(-224d, 0d);
        assertEquals(result, -224d,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //SUB
    @Test
    public void subTwoNumbersEx1() {
        double result = mCalculator.sub(4d,2d);
        assertEquals(result, 2d,0);
    }

    @Test
    public void subTwoNumbersEx2() {
        double result = mCalculator.sub(-5d, -20d);
        assertEquals(result, 15d,0);
    }

    @Test
    public void subTwoNumbersEx3() {
        double result = mCalculator.sub(3.111f, 2.222d);
        assertEquals(result, 0.89d,0.001d);
    }

    @Test
    public void subTwoNumbersEx4() {
        double result = mCalculator.sub(Double.POSITIVE_INFINITY, 2.222d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void subTwoNumbersEx5() {
        double result = mCalculator.sub(-22.232d, 10d);
        assertEquals(result, -22.232d,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //Mul
    @Test
    public void mulTwoNumbersEx1() {
        double result = mCalculator.mul(3d,2d);
        assertEquals(result, 6d,0);
    }

    @Test
    public void mulTwoNumbersEx2() {
        double result = mCalculator.mul(-5d, -2d);
        assertEquals(result, 10d,0);
    }

    @Test
    public void mulTwoNumbersEx3() {
        double result = mCalculator.mul(3.111f, 2.222d);
        assertEquals(result, 6.912d,0.001d);
    }

    @Test
    public void mulTwoNumbersEx4() {
        double result = mCalculator.mul(Double.POSITIVE_INFINITY, 2.22212321d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void mulTwoNumbersEx5() {
        double result = mCalculator.mul(-22d, 1.111d);
        assertEquals(result, -24.442d,0);
    }
    @Test
    public void mulTwoNumbersEx6() {
        double result = mCalculator.mul(22d, 0d);
        assertEquals(result, 0,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    // DIV
    @Test
    public void divTwoNumbersEx1() {
        double result = mCalculator.div(6d,2d);
        assertEquals(result, 3d,0);
    }

    @Test
    public void divTwoNumbersEx2() {
        double result = mCalculator.div(2d, -2d);
        assertEquals(result, -1d,0);
    }

    @Test
    public void divTwoNumbersEx3() {
        double result = mCalculator.div(3.6f, 2.2d);
        assertEquals(result, 1.6363636363d,0.001d);
    }

    @Test
    public void divTwoNumbersEx4() {
        double result = mCalculator.div(2d,Double.POSITIVE_INFINITY);
        assertEquals(result, 0,0);
    }
    @Test
    public void divTwoNumbersEx5() {
        double result = mCalculator.div(-22d, 10d);
        assertEquals(result, -2.2d,0);
    }
    @Test
    public void divTwoNumbersEx6() {
        double result = mCalculator.div(111111d, 0d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void divTwoNumbersEx7() {
        double result = mCalculator.div(111d, 0.12d);
        assertEquals(result, 925d,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //POW
    @Test
    public void powTwoNumbersEx1() {
        double result = mCalculator.pow(4d,2d);
        assertEquals(result, 16d,0);
    }

    @Test
    public void powTwoNumbersEx2() {
        double result = mCalculator.pow(-2d, 2d);
        assertEquals(result, 4d,0);
    }

    @Test
    public void powTwoNumbersEx3() {
        double result = mCalculator.pow(3.2f, 2.3d);
        assertEquals(result, 14.51593283d,0.001d);
    }

    @Test
    public void powTwoNumbersEx4() {
        double result = mCalculator.pow(121212d,Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    @Test
    public void powTwoNumbersEx5() {
        double result = mCalculator.pow(22d, 0d);
        assertEquals(result, 1,0);
    }
    @Test
    public void powTwoNumbersEx6() {
        double result = mCalculator.pow(0, -1d);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //FAC
    @Test
    public void facNumberEx1() {
        double result = mCalculator.factorial(3d);
        assertEquals(result, 6d,0);
    }

    @Test
    public void facNumberEx2() {
        double result = mCalculator.factorial(-3d);
        assertEquals(result, -6d,0);
    }

    @Test
    public void facNumberEx3() {
        Double result = mCalculator.factorial(3.1f);
        assertEquals(String.valueOf(result), "null");
    }
    @Test
    public void facNumberEx4() {
        double result = mCalculator.factorial(0d);
        assertEquals(result, 1d,0);
    }
    @Test
    public void facNumberEx5() {
        double result = mCalculator.factorial(1);
        assertEquals(result, 1, 0);
    }
    ///////////////////////////////////////////////////////////////////////////////
    //LOG
    @Test
    public void logTwoNumbersEx1() {
        double result = mCalculator.logarith(4d,2d);
        assertEquals(result, 0.5d,0);
    }

    @Test
    public void logTwoNumbersEx2() {
        double result = mCalculator.logarith(-1d, -2d);
        assertEquals(result, Double.NaN,0);
    }

    @Test
    public void logTwoNumbersEx3() {
        double result = mCalculator.logarith(3.111f, 2.222d);
        assertEquals(result, 0.7034d,0.001d);
    }

    @Test
    public void logTwoNumbersEx4() {
        double result = mCalculator.logarith(2.222d,Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY,0);
    }

    @Test
    public void logTwoNumbersEx5() {
        double result = mCalculator.logarith(22d, 0d);
        assertEquals(result, Double.NEGATIVE_INFINITY,0);
    }
    @Test
    public void logTwoNumbersEx6() {
        double result = mCalculator.logarith(0, 3d);
        assertEquals(result, 0,0);
    }
}