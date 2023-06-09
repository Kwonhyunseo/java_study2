package com.sist.exception;
/*
 *   3.final 클래스 => 중단 클래스 (java.lang)
 *   ------------ 확장을 할수 없다( 있는 그대로 사용) =>상속을 내리지 못한다
 *                상위클래스가 될 수 없다. 
 * 
 *   java.lang
 *   java.util
 *   java.io
 *   java.net
 *   java.text
 *   ------------ 기본 라이브러리
 *   
 *   java sql, javax. http.servlet.* javax.xml....
 *   오라클      브라우저 ... 
 *  4. 오버라이딩(상속의 기본 ) => 변경해서 사용 ( 다형성)
 *     객체지향의 3대 요소
 *      1. 데이터 보호  목적
 *          캡슐화 : 변수를 은닉화 => 메소드를 통해서 접근이 가능하게 만든다 
 *                 ---------                  ------
 *                  private                   public
 *               => 변수는 2가지 기능만 수행
 *                 메모리 저장 / 메모리에서 데이터 읽기
 *                  -----     --------------
 *                  setter     getter
 *               => 모든 멤버변수 : private
 *               => 모든 메소드(생성자); public => 다른 클래스와 연결이 가능
 *          접근 지정어
 *          --------
 *          1) private : 자신의 클래스에서만 사용이 가능 (은닉화)
 *                       다른 클래스에서는 접근이 불가능 
 *          2) default : 같은 패키지에서만 접근이 가능 
 *          3) public : 공개(패키지 상관 없이 모든 클래스에 접근이 가능)            
 *      2. 재사용하는 목적 : 상속 , 포함 =>클래스 크기 결정 => 형변환 
 *          class A
 *          class B extends A => A가 가지고 있는 모든 내용을 가지고 온다
 *                  ----- A 의 내용을 변경해서  사용,추가가 가능하다 
 *                       라이브러리 => 프로그램에  맞지 않는 경우 (수정)
 *               ================> A(상속을 내린 클래스)> B(상속을 받은 클래스)
 *               => A a= new A()
 *                  B b =new B()
 *                  A c = new B () => 묵시적 형변환 (자동)
 *                      ------> 추상클래스/인터페이스 (메모리 할당이 안된다)
 *                              ---------------
 *                              메모리 할당시에 상속을 받은 클래스를 이용해서 메모리 할당을 한다
 *                              미완성 클래스( 메소드가 구현이 안된 상태 )
 *                                          -------------------
 *                             => 설계, 같은 기능 ( 처리를 프로그램에 맞게 할떄)
 *                                     버튼 클릭 , 마우스 클릭 ... 
 *                                     게시판 : 글쓰기              
 *                  B d =(B)c; => 명시적 형변환(강제)  
 *                  ----------- 라이브러리에서 많이 사용 
 *                  => 클래스를 저장해서 관리 (클래스)=>Collection
 *                  'A' 'BBBBBB'
 *                  1byte 5byte ==>1000byte        
 *       
 *             
 *             class A
 *             {
 *                B b =new B(); // 특별한 경우가 아니면 재정의하지 않는다 
 *              }
 *              class B
 *                       
 *      3. 수정, 추가 목적(유지보수) 
 *         수정(오버라이딩)추가(오버로딩) => 메소드관련
 *         ---------------------------------------
 *                        오버로딩          오버라이딩
 *         ---------------------------------------
 *          관계           한개의 클래스      상속관계
 *                        상속관계       
 *         --------------------------------------
 *          메소드명        동일              동일
 *         ---------------------------------------
 *          매개변수        갯수나             동일
 *                        데이터형이 다르다
 *         --------------------------------------
 *          리턴형          관계없음          동일
 *         -------------------------------------
 *          접근지정어       관계없음          확장가능
 *          ------------------------------------
 *           사용처         생성자          인터페이스/
 *                                       추상클래스
 *          ------------------------------------
 *         ****상속
 *         1)호출 ==>상위클래스의 생성자가 먼저 호출(기본생성자)
 *          class A
 *          {
 *          
 *            public A(int a) {}
 *            public A(int a)
 *          }
 *          class B
 *          {
 *            public B (int a,int b) {}
 *          }
 *          B b=new B();
 *          =>new A() => new B()
 *         
 *         2)예외조건 : static ,생성자 ,초기화브럭 , private 
 *        
 *        클래스의 종류
 *        =추상클래스
 *        =인터페이스  => 추상클래스의 단점을 보완 (클래스와 동일하게 취급)
 *        ***클래스(단일)/ 인터페이스(다중)
 *        ---- 설계도(구현이 안된 상태) => 미완성 클래스 (자신이 메모리 할당을 할수 없다)
 *        ---- 여러개의 관련된 클래스를 모아서 한개의 객체명으로 제어 
 *        ---------------------------------------------------------
 *                       추상클래스                인터페이스
 *        ---------------------------------------------------------
 *        상속관계         단일 상속                다중 상속
 *       - ------------------------------------------ --------------
 *        상속키워드        extends               implements
 *       ---------------------------------------------------------
 *        멤버변수          인스턴스변수              상수형변수만 사용 
 *                        정적변수
 *      ----------------------------------------------------------
 *        메소드          구현된메소드              구현이 안된 메소드
 *                      구현이 안된 메소드          
 *      -----------------------------------------------------------
 *        기법             오버라이딩                오버라이딩
 *      -----------------------------------------------------------
 *        형식
 *        
 *           추상클래슥
 *           [접근지정어]abstract class ClassName
 *           {
 *             -----------------------------
 *              변수
 *                인스턴스 변수
 *                static 변수
 *             ---------------------------
 *               메소드
 *                 구현된 메소드
 *                 [접근지정어]리턴형 메소드명(매개변수...)
 *                 {
 *                 }
 *                 구현이 안된 메소드(선언)
 *                 [접근지정어]abstract 리턴형 메소드명(매개변수...);
 *                          --------
 *             ---------------------------
 *              생성자 , 오버로딩이 가능 
 *             ----------------------------
 *             
 *            }
 *            
 *            인터페이스 
 *            [접근지정어] interface Interface명 {
 *              ----------------------------
 *               변수선언(성수형변수)
 *                int a=10; =>값을 명시적으로 지정
 *                =>public static final int a=10;
 *                  --------------------
 *              ---------------------------
 *                구현이 안된 메소드 목록 
 *                void display();
 *                  =>public abstract void display();
 *                   ----------------
 *              ---------------------------
 *                구현이 메소드 목록
 *                default void aaa(){}
 *                 => public default void aaa(){}
 *                static void bbb(){}
 *                  => public static void bbb(){}
 *              ----------------------------
 *            }
 *            ==>인터페이스는 변수나 메소드가 public (연결목적 => 언제든 연결이 가능)
 *      ----------------------------------------------------------
 *      상속
 *      
 *              extends
 *      interface ==>interface
 *            implements
 *      interface ==>class
 *      
 *      다중상속
 *      class A implements 인터페이스, 인터페이스 ..... 
 *      6.인터페이스와 클래스가 다른점은 무엇입니가?
 *      다중/단일/모든 메소드 변수=>public 
 *      여러개의 클래스를 모아서 관리 
 *      인터페이스와 추상클래스가 다른점은 무엇입니까?
 *      인터페이스의 장점=>리모컨 
 *      =>표준화가 가능하다 
 *      =>서로다른 클래스 연결
 *      =>독립적으로 사용할수있다
 *      => 개발 시간을 단축할수 있다.
 *      
 *      표준화가능 ,독립적인 프로그래밍 가능
 *      패키지관의 연결을 도와주지는 않는다. 이거슨 import의역할이다.
 *      필드는 초기화하지 않아도 된다.
 *      ----멤버변수 int =>0,double =>o,o boolean =false,string =null
 *      클래스에 생성자가 없어도된다
 *      ====컴파일러가 자동으로 기본생성자 추가.
 *      생성자는 일반적으로 필드를 초기화한다.
 *      --- 생성자의 역할
 *          = 객체 생성시에 호출 (생성자는 반드시 한개 이상이 필요하다)
 *          = 멤버변수에 대한 초기화
 *          =클래스명과 동일/리턴형이 없다/접근지정어는 보통 public
 *          =오버로딩을 지원한다(여러개 생성자가 있을수 있다)
 *          =초기화 
 *          = 1)명시적 초기화
 *            2)구현후에 초기화값 대입 => 파일읽기 , 제어문, 데이터베이스 
 *               초기화블록
 *               생성자 ==> 주로 사용빈도가 많다 
 *          필드는 생성자보다 먼저 선언해야한다. 아니다....
 *          순서는 자유다.....(class 설계 순서는 관계없다)
 *              모든클래스의 최상위클래스는 Object 이다
 *              자바의 모든 클래스는 Object로부터 상속을 받는다
 *              Object=> 모든 데이터형의 가장 큰데이터형 
 *               부모객체를 자식 클래스 타입 변수에 대입할수 있다. 없다..틀렸다.
 *              
 *      
 */


  

import java.util.*;
class AAA
{
	public void aaa() {
		public AAA() {}
		int a=10;
	}
}
abstract class C
{
	C(){}
	C(int a){}
}

class A
{
	int a=10;
	String name ="홍길동";
    //A(){}
	public A() {}
	public A(int a)
	{
		this.a=a;
	}
	
}
// new A() =>new A(10)
class B extends A
{
	
	int b =20;
	public B()
	{
		
		
	}
}
//A a =new B() ==>A에 있는 데이터만 사용 , 메소드는 변경된 것만 사용
// 하위클래스에서 추가된 메소드, 변수는 사용할 수 없다.
//B b=new B()
public class 정리_7  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	A a =new B();
		//B b=(B)a;
	/* String s1="Hello";
	 String s2="Hello";
	 String s3=new String ("Hello");
	 if(s1==s2)
	 
		 System.out.println("같다(참조주소)");
	 */
	}

}
