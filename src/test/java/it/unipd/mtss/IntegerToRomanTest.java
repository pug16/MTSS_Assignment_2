package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void test3() {
        int num = 3;
        String exp = "III";

        String act = IntegerToRoman.convert(num);

        assertEquals(exp, act);
    }
    
}
