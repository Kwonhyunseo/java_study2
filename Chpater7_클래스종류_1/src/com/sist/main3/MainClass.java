package com.sist.main3;
/*
 * 
 *  인터페이스 간의 상속
 *  interface A
 *  interface B extends A 
 *              -------
 *              
 *  interface A
 *  {
 *    void aaa();
 *              
 *   }           
 *   interface B extends A
 *   {
 *     void bbb();
 *     //void aaa();
 *   }
 * 
 * 
 * class C implements B
 * {        ---------
 * 
 *   public void aaa(){}
 *   public void bbb(){}
 * }
 * 
 * 
 * 
 */

interface A
{
	
	
}

interface B extends A 
{
	
	
	
}

class C implements B // C<B => interface 도 클래스와 동일 => 구분 ( 클래스는 단일상속 )
{
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		
		
		A a= new C ();
		B b=new C ();
		C c=new C();// 
		
		if(c instanceof A) //c객체는 A에 포함 
			System.out.println ("ok");
		// TODO Auto-generated method stub
		
		if(c instanceof B) // C<B
			System.out.println ("ok2");
		if(b instanceof A) // B<A
			System.out.println ("ok3");
		if(a instanceof C)   //A<C
			System.out.println ("ok4");
		if(a instanceof B)   //A<B
			System.out.println ("ok5");
		
		String s="";
		StringBuffer sb=new StringBuffer();
		Object o =new Object();
		if(s instanceof Object)   //A<B
			System.out.println ("ok");
		if(sb instanceof Object)   //A<B
			System.out.println ("ok2");
		if(o instanceof String)   //A<B
			System.out.println ("ok3");
		
		//instanceof는 객체 크기
		// 오른쪽 클래스가 크거나 같으면 =>true 
		
	 
	}

}
