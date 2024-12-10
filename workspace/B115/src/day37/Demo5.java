package day37;

public class Demo5 {
//convert given String into upper case without using toUpper method
	public static void main(String[] args) {
		
		
		String s="Bhanu @12";
//		System.out.println(s.toUpperCase());
		
		for(char c:s.toCharArray())
		{
			if(c>='a' && c<='z') 
			{
				int i=c;
				i=i-32;
				c=(char)i;
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
			}
			
		}
	}

}
