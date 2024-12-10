package day37;

public class Demo3 {
//print only digits present in the given String
	public static void main(String[] args) {
		String msg="Page 2 of 30";
		for(char a:msg.toCharArray())
		{
			if(a>='0' && a<='9')
			{
				System.out.print(a);
			}
		}

		System.out.println();
		
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(Character.isDigit(c))
			{
				System.out.print(c);
			}
		}
	}

}
