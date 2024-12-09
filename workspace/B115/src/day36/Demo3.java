package day36;

import java.util.Scanner;

public class Demo3 {
//searching--> print position if found
//write searching code for String[]
	public static void main(String[] args) {
		int[] a= {10,15,20,25,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to search");
		int number=sc.nextInt();
		sc.close();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			int value=a[i];
			if(value==number)
			{
				count++;
			}
		}
	
		if(count==0)
		{
			System.out.println("Not found");
		}
		else if(count==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("duplicate:"+count);
		}
	}

}
