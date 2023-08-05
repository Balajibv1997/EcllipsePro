package Raghujavaprogramms;

public class Palendrome {

	public static void main(String[] args) {
		String St="gadag";
		String rev="";
		for(int i=St.length()-1; i>=0;i--) {

        char ch=St.charAt(i);
        String Revname=ch+rev;
        System.out.println(Revname);

		}

	}

}
