package Raghujavaprogramms;

import java.util.Scanner;

public class Countstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String st=sc.nextLine();
		
		
		int uc=0,lc=0,dig=0,sp=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			else if(ch>='a'&&ch<='z')
				lc++;
			else if(ch>='0'&&ch<='9')
				dig++;
			else
				sp++;
		}
		System.out.println(uc+lc+dig+sp);
			

		
	}

}
