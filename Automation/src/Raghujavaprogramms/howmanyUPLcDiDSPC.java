package Raghujavaprogramms;

import java.util.Scanner;

public class howmanyUPLcDiDSPC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String st=sc.nextLine();

int uc=0,lc=0,digits=0,spcl=0;

for(int i=0;i<st.length();i++) {
	char ch=st.charAt(i);
	if(ch>='A'&& ch<='z')
		uc++;
	else if(ch>='a'&& ch<='z')
		lc++;
	else if(ch>='0'&& ch<='9')
		digits++;
	else
		spcl++;
}
	System.out.println(uc+lc+digits+spcl);
	//System.out.println(lc);
  //  System.out.println(digits);
   // System.out.println(spcl);

	}

}
