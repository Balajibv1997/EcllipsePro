package Raghujavaprogramms;

import java.util.Scanner;

public class HowmanyEvenANdAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		int evencount=0,oddcount=0;
		for( int i=0;i<n;i++) {
			if(n%2==0) {
				evencount++;	
			}
			else
		        oddcount++;	
		}
		
		System.out.println(evencount);
		System.out.println(oddcount);
	}
	

}
