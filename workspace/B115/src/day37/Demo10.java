package day37;

public class Demo10 {

	public static void main(String[] args) {
		String s="Dad";
		String r="";
		for(char a:s.toCharArray())
		{
			r=a+r;
		}

		if(s.equalsIgnoreCase(r))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is NOT a palindrome");
		}
	}

}
