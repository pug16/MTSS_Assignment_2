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

}
