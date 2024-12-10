package day37;

public class Demo6 {
//convert given String into upper case without using toUpper method
	public static void main(String[] args) {
		String s="Bhanu @12";
//		System.out.println(s.toUpperCase());
		
		for(char c:s.toCharArray())
		{
			System.out.print(Character.toUpperCase(c));
		}
	}

}
