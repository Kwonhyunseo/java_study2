package com.sist.exam3;

//A==> a,b,name ,A(),print()
//공유=>addr,display() => 
class A
{
	
	int a;
	int b;
	String name;
	static String addr;
	public A()

	{
		/*			int a;
					int b;
				String name;
				static String addr;
			
		 *  
		 */
		
		display();
		a=10;
		b=20;
		name="hong";
		addr="seoul";
	}
	
	public void print ()
	{
		
		/*			int a;
		int b;
	String name;
	static String addr;

*  
*/

display();
a=10;
b=20;
name="hong";
addr="seoul";
}
		

	
	public static void display()
	{
		
		//addr=>static은 static만 사용이 가능 
		addr="";
		
		A aa=new A(); //인스턴스는 객체 생성후에 사용이 가능하다 
		aa.a=10;
		aa.b=20;
		
		aa.name ="shim";
		aa.print();
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
