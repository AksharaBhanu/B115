package day37;

public class Demo1 {
//count the number of char present in the String without using length method
	public static void main(String[] args) {
		String s="bhanu";
		System.out.println(s.length());
		String[] a = s.split("");
		System.out.println(a.length);
		
		int count=0;
		for(String b:a)
		{
			count++;
		}
		
		System.out.println(count);

	}

}
