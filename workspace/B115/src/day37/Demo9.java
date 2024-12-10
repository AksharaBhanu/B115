package day37;

public class Demo9 {
//reverse the words without changing its position--> sihT sI avaJ
	public static void main(String[] args) {
		String msg="This Is Java";
		String[] words = msg.split(" ");
		for(String s:words)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
		
	}

}
