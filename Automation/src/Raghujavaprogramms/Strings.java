package Raghujavaprogramms;

import java.util.Scanner;

public class Strings {
	public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter and String sentence");
String str=sc.nextLine();
System.out.println("no of charectors is="+ str.length());
System.out.println("2 nd charectors is="+ str.charAt(2));



String st="Balaji";
int noofchar = str.length();
System.out.println(noofchar);


char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
	System.out.println(i+"===="+ch[i]);

char c[]= {'b','m','l'};
String s1=new String(c);
System.out.println(s1);

}
}
