package Raghujavaprogramms;

import java.util.Scanner;

public class FindDuplicatesINString {

	public static void main(String[] args) {
		
		String str="balaji";
		int count=0;
		char ch[]=str.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]);
					count++;
					System.out.println(count);
					break;
				
				
				}
				
				
			}
		}
		
		
		
		
		
	}
}
