package Raghujavaprogramms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String st=sc.nextLine();
		
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			char ch=st.charAt(i);
			String revername = rev+ch;
		
		
		System.out.print(revername);
		
		}
	}
}
