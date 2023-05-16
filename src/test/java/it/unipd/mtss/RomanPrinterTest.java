package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {

    @Test
    public void test1() {
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(1)).thenReturn("I");
            String exp =    "  _____ \n" + 
                            " |_   _|\n" +
                            "   | |  \n" +
                            "   | |  \n" +
                            "  _| |_ \n" +
                            " |_____|\n";
            String act = RomanPrinter.print(1);

            assertEquals(exp, act);
        }
    } 

}
