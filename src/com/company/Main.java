package com.company;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	String[] arg = new String[3];
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Привет, это калькулятор");
	    do {
			System.out.print("Введи операцию: ");
			String input = scan.nextLine();
			int space = 0;
			for(char el : input.toCharArray()){
				if(el == ' ') space++;
			}
			if(space < 2 || space >= 3){
				System.out.println("Неверный формат ввода");
				System.exit(1);
			}
			int i = 0;
			for (String val : input.split(" ", 3)) {
				arg[i] = val;
				i++;
			}
			Calc calc = new Calc(arg[0], arg[1], arg[2]);

		}while(true);
    }
}