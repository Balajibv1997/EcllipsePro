package Raghujavaprogramms;

public class FindUcLcDiSp {

	public static void main(String[] args) {
		String s="BalajiMamata123@";
		int uc=0,lc=0,di=0,sp=0;
		for(int i=0;i<s.length();i++) {
		 
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z')
				uc++;
			else if(ch>='a'&& ch<='z')
			lc++;
		
		else if(ch>='0'&& ch<='9')
			di++;
		else 
			sp++;
		}
 System.out.println(uc);
 System.out.println(lc);
 System.out.println(di);
 System.out.println(sp);
	}

}
