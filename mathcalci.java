package com.oops.interfaceex1;

import java.util.Scanner;

public class mathcalci implements interfaceexa1{

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		int result;
		result= n1+n2;
		return result;
	}

	@Override
	public int div(int n1, int n2) {
		// TODO Auto-generated method stub
		int result =n1/n2;
		return result;
	}

	@Override
	public int mod(int n1, int n2) {
		// TODO Auto-generated method stub
		int result;
		result = n1 % n2;
		
		return result;
	}

}
