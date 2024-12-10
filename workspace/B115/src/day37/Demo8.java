package day37;

public class Demo8 {
//reverse the words--> Java Is This
	public static void main(String[] args) {
		String msg="This Is Java";
		String[] words = msg.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}

}
