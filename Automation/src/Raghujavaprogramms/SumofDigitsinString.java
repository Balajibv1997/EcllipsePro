package Raghujavaprogramms;

import java.util.Scanner;

public class SumofDigitsinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String st=sc.nextLine();
	int sm=sumofDigits(st);
	System.out.println("sum of the digits in string"+sm);
	}
		static int sumofDigits(String st) {	
		
		int sum=0;
		for(int i=0; i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&& ch<='9')
				sum=sum+ch-48;
		}
  return sum;
		}
	}



