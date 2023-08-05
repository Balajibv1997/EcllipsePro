package Raghujavaprogramms;

import java.util.Scanner;

public class StringisPalendromeornot {
	
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the string");
	String st=sc.nextLine();
	boolean rs= ispalandrome(st);
	if(rs==true)
		System.out.println("word id palendrome");
	
	else
		System.out.println("word is not palendrome wod");

}

 static boolean ispalandrome(String st) {
int i=0, j=st.length()-1;
while(i<j)
{
	if(st.charAt(i)!=st.charAt(j))
	return false;
	i++;
	j--;
}
return true;
}
}
