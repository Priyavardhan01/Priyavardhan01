package com.oops.interfaceex1;

import java.util.Scanner;

public class realcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("enter the values");
		int a =sc.nextInt();
		int b  =sc.nextInt();
		int result;
		
		mathcalci calc= new mathcalci();
		System.out.println("Enter which process to be done 1 2 3 or 0 for exit" );
		int ch;
		ch= sc.nextInt();
	
		switch(ch) {
		case 1:  result = calc.add(a, b);
		System.out.println("sum:"+result );
		break;
		case 2: result = calc.div(a, b);
		System.out.println("quotient:"+result);
		break;
		case 3: result = calc.mod(a,b);
		System.out.println("mod:"+result);
		break;
		case 0:
			System.exit(0);
	}

}
}
}