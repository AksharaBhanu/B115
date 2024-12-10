package day37;

public class Demo7 {
//reverse the given String
	public static void main(String[] args) {
		String s="BAT";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		String msg="";
		for(char c:s.toCharArray())
		{
			msg=c+msg;
		}
		System.out.println(msg);
		
		String[] a = s.split("");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		StringBuffer s2=new StringBuffer(s);
		s2.reverse();
		System.out.println(s2);
		
		}

}
