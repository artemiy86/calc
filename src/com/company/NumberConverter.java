package com.company;
import java.util.TreeMap;

public class NumberConverter {

    private static String[] romanNumber = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static int toArabicNumber(String number){
        for(int i=0;i<romanNumber.length;i++) {
            if (romanNumber[i].equals(number)) {
                return i;
            }
        }
        return 0;
    }

    public static String toRomanNumber(int number){
        int numb = Math.abs(number);
        int i = map.floorKey(numb);
        if(numb == i)
            return map.get(numb);
        return map.get(i) + toRomanNumber(numb - i);
    }

}