package day36;

public class Demo4 {

	public static void main(String[] args) {
//		int[] a= {10,4,7,1,15};
		int[] a= {10,40,7,100,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int f=a[i];
				int s=a[j];
				if(f>s)
				{
					a[j]=f;
					a[i]=s;
				}
			}
		}
		
		for(int v:a)
		{
			System.out.print(v+" ");
		}
	}

}
