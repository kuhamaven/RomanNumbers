import java.util.HashMap;

public class RomanToDecimal {

    //Asumimos que SIEMPRE nos llega un número valido.

    private static final HashMap<String,Integer> romanSymbols = new HashMap<>(){
        {
            put("I",1);
            put("IV",4);
            put("V",5);
            put("IX",9);
            put("X",10);
            put("XL",40);
            put("L",50);
            put("XC",90);
            put("C",100);
            put("CD",400);
            put("D",500);
            put("CM",900);
            put("M",1000);
        }
    };

    public static int convert(String romanNumber) {
        if(romanNumber.length()==0) return 0;
        if(romanNumber.length()==1) return romanSymbols.get(romanNumber);
        String prefix1 = romanNumber.substring(0,1);
        String prefix2 = romanNumber.substring(1,2);
        int intPrefix1 = romanSymbols.get(prefix1);
        int intPrefix2 = romanSymbols.get(prefix2);

        if(intPrefix1>=intPrefix2) {
            return intPrefix1 + convert(romanNumber.substring(1));
        }
        else {
            return romanSymbols.get(romanNumber.substring(0,2)) + convert(romanNumber.substring(2));
        }
    }
}