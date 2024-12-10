package day37;

public class Demo4 {
//print sum of digits present in the given String
	public static void main(String[] args) {
	
				
		String msg="Page 2 of 34";
		int sum=0;
		for(char a:msg.toCharArray())
		{
			if(a>='0' && a<='9')
			{
				int i=a-48;
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		sum=0;
		for(char a:msg.toCharArray())
		{
			if(Character.isDigit(a))
			{
				int i=Character.getNumericValue(a);
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
