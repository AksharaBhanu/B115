package day37;

public class Demo2 {

	public static void main(String[] args) {
		String s="ABCDE";
		int i=0;
		while(true)
		{
			try 
			{
				s.charAt(i);
				i++;
			}
			catch (Exception e) 
			{
				break;
			}
		}

		System.out.println(i);
	}

}
