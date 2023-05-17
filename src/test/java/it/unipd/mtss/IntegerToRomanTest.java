package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void test4() {
        int num = 4;
        String exp = "IV";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test5() {
        int num = 5;
        String exp = "V";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test6() {
        int num = 6;
        String exp = "VI";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test9() {
        int num = 9;
        String exp = "IX";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test10() {
        int num = 10;
        String exp = "X";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }
    
    @Test
    public void test14() {
        int num = 14;
        String exp = "XIV";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test20() {
        int num = 20;
        String exp = "XX";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test50() {
        int num =50;
        String exp = "L";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test43() {
        int num = 43;
        String exp = "XLIII";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test100() {
        int num = 100;
        String exp = "C";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test94() {
        int num = 94;
        String exp = "XCIV";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test462() {
        int num = 462;
        String exp = "CDLXII";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test500() {
        int num = 500;
        String exp = "D";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test607() {
        int num = 607;
        String exp = "DCVII";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test938() {
        int num = 938;
        String exp = "CMXXXVIII";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test
    public void test1000() {
        int num = 1000;
        String exp = "M";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }

    @Test(expected = NumberOverFourThousandException.class)
    public void testOver4000(){
        int num = 4000;
        IntegerToRoman.convert(num);
    }

    @Test(expected = NumberUnderOneException.class)
    public void testUnderOne(){
        int num = 0;
        IntegerToRoman.convert(num);
    }

    @Test
    public void testClass(){
        int num = 73;
        String exp = "LXXIII";
        IntegerToRoman conv = new IntegerToRoman();
        String act = conv.convert(num);
        assertEquals(exp, act);
    }
}
