package com.company;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Calc {

    public Calc(String arg1, String oper, String arg2){
        int parseArg1 = 0;
        int parseArg2 = 0;
        int result = 0;
        boolean roman = false;

        try{
            parseArg1 = Integer.parseInt(arg1);
            parseArg2 = Integer.parseInt(arg2);
        }catch(Exception err){
            try {
               parseArg1 = NumberConverter.toArabicNumber(arg1);
               parseArg2 = NumberConverter.toArabicNumber(arg2);
               roman = true;
            }catch (Exception err2){
                System.out.println("Неверный формат чисел ");
            }
        }
        if(parseArg1 < 1 || parseArg1 > 10 || parseArg2 < 1 || parseArg2 > 10){
            System.out.println("Необходимо ввести числа от 1 до 10 включительно");
            System.exit(1);
        }

        switch(oper){
            case("+"):
                result = parseArg1 + parseArg2;
                break;
            case("-"):
                result = parseArg1 - parseArg2;
                break;
            case("*"):
                result = parseArg1 * parseArg2;
                break;
            case("/"):
                result = parseArg1 / parseArg2;
                break;
            default:
                System.out.println("Введена недопустимая арифметическая операция");
                System.exit(1);
        }
        if(roman){
            if(result <= 0)
                System.out.println("римляне таких цифр еще не придумали");
            else
                System.out.println(NumberConverter.toRomanNumber(result));
        }else{
            System.out.println(result);
        }

    }

}