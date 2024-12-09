package day36;

import java.util.Scanner;

public class Demo1 {
//searching--> 
	public static void main(String[] args) {
		int[] a= {10,15,20,25,30,35,15};
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to search");
		int number=sc.nextInt();
		sc.close();
		String msg="Not found";
		for(int element:a)
		{
			if(element==number)
			{
				msg="found";
				break;
			}
		}
		
		System.out.println(msg);

	}

}
