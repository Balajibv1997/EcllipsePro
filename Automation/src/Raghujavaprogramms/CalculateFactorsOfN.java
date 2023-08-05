package Raghujavaprogramms;

import java.util.Scanner;

public class CalculateFactorsOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int n=sc.nextInt();
int fact=1;
for(int i=0; i<=n;i++) {
	fact=fact*i;
}
System.out.println(n+fact);
	}

}
