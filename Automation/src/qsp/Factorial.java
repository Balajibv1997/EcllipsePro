package qsp;
import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if(n==0)
			return 1;
		else {
		int x=(n*fact( n-1));
		return x;
	}

	}
	public static void main(String [] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=fact(num);
		System.out.println(x);
		sc.close();
	}
}