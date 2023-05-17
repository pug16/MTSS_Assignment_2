////////////////////////////////////////////////////////////////////
// Andrea Martinato 2042342
// Leonardo Lago 2034297
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] r={"C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(number >= values[i]){
                number = number - values[i];
                roman.append(r[i]);
            }
        }
        return roman.toString();
    }
    
}
