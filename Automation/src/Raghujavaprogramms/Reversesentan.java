package Raghujavaprogramms;

import java.util.Scanner;

public class Reversesentan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String st=sc.nextLine();
		
	
		
		String s[]=st.split("");
		String word="";
		for(int i=s.length-1;i>=0;i--) {
			word+=s[i]+"";
		}
		System.out.println(word);
	}
}
