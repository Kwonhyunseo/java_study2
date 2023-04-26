package com.sist.lib;
//equals => Object에서는 객체비교 String에서는 문자열 
class Student2{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student2(String name)
	{
		this.name=name;
	}
}
//==(객체=>주소) , equals(객체 가지고 있는 변수값 비교)
//재정의 하지 않는 경우는 ==동일하다
//Object =>equals 는 사용 빈도가 많지 않다 => 오버라이딩을 사용해야된다
//=>String  ...equals 가 재정이되어 있다 (실제 문자열)
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");

		System.out.println("s1="+s1);	
		System.out.println("s2="+s2);
		/*/
		 * 
		 * 
		 * 
		 * s1= 5e91993f s2=1c4af82c (객체비교 ==주소값을 비교한다)
		 */
		if(s1==s2)
		{
			System.out.println("s1과 s2은 같다");
			
		}
		else
		{
			
			System.out.println("s1과 s2은 같지않다");
		}
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2은 가지 않다");
		}
		else
		{
			
			System.out.println("")
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
			  return  name ==((Student2)obj).name;
		else
			 return false;
		
	}

}
