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

    @Test
    public void test5() {
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(5)).thenReturn("V");
            String exp =    " __      __\n" + 
                            " \\ \\    / /\n" +
                            "  \\ \\  / / \n" + 
                            "   \\ \\/ /  \n" +
                            "    \\  /   \n" +
                            "     \\/    \n";

            String act = RomanPrinter.print(5);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test10(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(10)).thenReturn("X");
            String exp =    " __   __\n" + 
                            " \\ \\ / /\n" +
                            "  \\ V / \n" + 
                            "   > <  \n" + 
                            "  / . \\ \n" + 
                            " /_/ \\_\\\n";

            String act = RomanPrinter.print(10);
            
            assertEquals(exp, act);
        }
    } 

    @Test
    public void test16(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(16)).thenReturn("XVI");
            String exp =    " __   __ __      __  _____ \n" +          
                            " \\ \\ / / \\ \\    / / |_   _|\n" +
                            "  \\ V /   \\ \\  / /    | |  \n" +
                            "   > <     \\ \\/ /     | |  \n" +
                            "  / . \\     \\  /     _| |_ \n" +
                            " /_/ \\_\\     \\/     |_____|\n";

            String act = RomanPrinter.print(16);
            
            assertEquals(exp, act);
        }
    } 

    @Test
    public void test50(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(50)).thenReturn("L");
            String exp =    "  _      \n" + 
                            " | |     \n" + 
                            " | |     \n" + 
                            " | |     \n" +
                            " | |____ \n" + 
                            " |______|\n";

            String act = RomanPrinter.print(50);
            
            assertEquals(exp, act);
        }
    }

    @Test
    public void test100(){
        try(MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)){
            utilities.when(() -> IntegerToRoman.convert(100)).thenReturn("C");
            String exp =    "    _____ \n" + 
                            "   / ____|\n" + 
                            "  | |     \n" + 
                            "  | |     \n" + 
                            "  | |____ \n" + 
                            "   \\_____|\n";

            String act = RomanPrinter.print(100);
            
            assertEquals(exp, act);
        }
    }

}
