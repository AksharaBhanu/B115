package day36;

public class Demo6 {
//print the smallest number present in array
	public static void main(String[] args) {
		int[] a= {10,40,7,2};
		int smallest =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		
		System.out.println(smallest);
	}

}
