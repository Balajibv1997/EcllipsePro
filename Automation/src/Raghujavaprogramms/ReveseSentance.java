package Raghujavaprogramms;

import java.util.Scanner;

public class ReveseSentance {

	public static void main(String[] args) {
		String[] s="My name is Balaji".split(" ");
		String ans=" ";
		for(int i=s.length-1;i>=0;i--) {
			ans+=s[i]+" ";
			
		}
			System.out.println(ans);
		}
		
	}

