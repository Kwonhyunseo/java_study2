package com.sist.main2;
class Common{
	
	int a=10;
	int b=20;
	
	public void display() {
		System.out.println("Common:display Call..");
		
	}
}
class Child extends Common//is-a
{
	public void display() {
		System.out.println("Common:display Call..");
	}
	
	// a,b
}
class Child2{
	//상속없이 오버라이딩=> 익명의 클래스 
	Common c=new Common() {
		public void display() {
			System.out.println("Common:display Call..");
		}// a,b =>has-a
	};
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child c1 =new Child();
      System.out.println(c1.a);
      System.out.println(c1.b);
      c1.display();
      
      
      Child c2 =new Child();
      System.out.println(c2.a);
      System.out.println(c2.b);
      c2.display();
	}

}
