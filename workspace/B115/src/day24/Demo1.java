package day24;
//java example for encapsulation
class A
{
	private int i;//declaration
	
	A(int i)
	{
		this.i=i;//initialization
	}

	public int getI() {
		return i;//utilization
	}
	
	
}

public class Demo1 {

	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println(a1.getI());

	}

}
