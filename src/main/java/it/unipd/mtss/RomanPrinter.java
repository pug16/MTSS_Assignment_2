////////////////////////////////////////////////////////////////////
// Andrea Martinato 2042342
// Leonardo Lago 2034297
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        String[] row ={"", "", "", "", "", ""};
        for(int i = 0; i<romanNumber.length(); i++){
            switch (romanNumber.charAt(i)) {
                case 'I':
                    row[0] = row[0] + "  _____ ";
                    row[1] = row[1] + " |_   _|";
                    row[3] = row[3] + "   | |  ";
                    row[2] = row[2] + "   | |  ";
                    row[4] = row[4] + "  _| |_ ";
                    row[5] = row[5] + " |_____|";
                    break;
                
                default:
                    break;
            }
        }
        String s = "";
        for(int i = 0; i < 6; i++){
            s = s + row[i] + "\n";
        }
        return s;
    }
}
