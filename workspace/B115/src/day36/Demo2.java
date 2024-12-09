package day36;

import java.util.Scanner;

public class Demo2 {
//searching--> print position if found
	public static void main(String[] args) {
		int[] a= {10,15,20,25};
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to search");
		int number=sc.nextInt();
		sc.close();
		String msg="Not found";
		
		for(int i=0;i<a.length;i++)
		{
			int value=a[i];
			if(value==number)
			{
				msg="Found at index: "+i;
				break;
			}
		}
		System.out.println(msg);

	}

}
