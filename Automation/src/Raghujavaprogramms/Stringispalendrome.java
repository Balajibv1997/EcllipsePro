package Raghujavaprogramms;

import java.util.Scanner;

public class Stringispalendrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String str=sc.nextLine();
		boolean rs=isPalendrome(str);
		if(rs==true)
			System.out.println("String is palendrome");
		else
			System.out.println("String is not palendrome");	
		
		
	}

	 static boolean isPalendrome(String st ) {
		int i=0, j=st.length()-1;
		while(i<j) {
			char ch[]=st.toCharArray();
			if(ch[i]!=ch[j])
				i++;
			j--;
			return false;
		}
		return true;
		
		
	
	} 
}
