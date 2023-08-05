package Raghujavaprogramms;

import java.util.Scanner;

public class PrintOVelsAnConsoles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String st=sc.nextLine();
		
		int vc=0,cc=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc++;
			else
				cc++;		
		}
		}
		System.out.println("vowel count+"+vc);
		System.out.println("consonance count"+cc);
		

	}

}
