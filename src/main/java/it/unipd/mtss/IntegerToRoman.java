////////////////////////////////////////////////////////////////////
// Andrea Martinato 2042342
// Leonardo Lago 2034297
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){

        String s = "";

        for(int i = 0; i < number; i++){
            s = s + "I";
        }
        
        return s;
    }
    
}
