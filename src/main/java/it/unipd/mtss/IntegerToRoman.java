////////////////////////////////////////////////////////////////////
// Andrea Martinato 2042342
// Leonardo Lago 2034297
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number){

        String s = "";

        if(number < 4){
            for(int i = 0; i < number; i++){
                s = s + "I";
            }
        }else if(number == 4){
            s = "IV";
        }else if(number == 5){
            s = "V";
        }else if(number < 9){
            s = "V";
            number = number - 5;
            for(int i = 0; i < number; i++){
                s = s + "I";
            }
        }else if(number == 9){
            s = "IX";
        }else{
            s = "X";
        }
        return s;
    }
    
}
