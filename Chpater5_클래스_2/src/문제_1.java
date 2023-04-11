/*
 * 
 *  메소드 : 클래스의 구성요소 (동적)
 *  -----
 *  1)특정 기능을 수행하는 명령문의 집합
 *                    ----- 연산자 /제어문
 *  2) 한가지 기능만 수행 할 수 있게 한다.
 *     예)
 *        댓글
 *        ========= 댓글(class)
 *        댓글 목록출력
 *        댓글 쓰기
 *        댓글 수정
 *        댓글 삭제
 *        =========
 *        게시판(class)
 *        -----------
 *        글쓰기
 *        목록출력
 *        상세보기
 *        수정
 *        삭제
 *        -----------
 *        영화(CGV)=> 상속(메가박스)=> 상속(롯데시네마)
 *        ----
 *        목록출력
 *        상세보기
 *        예약하기
 *        추천하기
 *        검색하기
 * 3) 메소드 구성요소
 *     선언부
 *     void display() 
 *     구현부
 *     {
 *       처리
 *     }
 *          
 *     선언부
 *     [접근지정어][옵션] 리턴형 메소드명(매개변수....)
 *                          ----- ----------- 사용자가 요청한 값
 *                                            0개 이상 
 *                          알파벳,한글로 시작(알파벳은 대소문자 구분)
 *                          숫자사용이 가능 (앞에 사용 금지)
 *                          키워드는 사용 금지 
 *                          특수문자 사용가능(_,$)
 *                          공백을 사용할 수 없다.
 *                          **** 소문자로 시작한다.
 *                    ----- 기본형(int, long,byte,double,char,boolean)
 *                    ----- 배열 , 클래스 
 *     --------- static /final/abstract 
 *     public/protected/default/private
 *     {
 *     
 *     }       
 *  
 *   static int add(int a, int b)
 *   {              a=10   b=20
 *      return a+b           
 *   
 *   }
 *   호출
 *   넘겨준 데이터를 받아서 저장
 *   int result=add(10,20);
 *       ----- 30
 *  *** 메소드를 호출시에는 메소드는 처음부터 끝까지 수행한후에 호출된 위치로 
 *  
 *  
 *  메소드 만드는 방법
 *  -------------
 *  리턴형     메개변수
 *   0         0 =>String substring(int s,int e)
 *                 String s= "Hello Java";
 *                 String ss.s.susbring(0,5)
 *   0         x
 *   x         0
 *   x         x
 *  --------------
 *   
 *  
 */



 

public class 문제_1 {
 /*   static void method1()
    {
	System.out.println("method1 진입...");
	System.out.println("method1 기능 처리....");
	System.out.println("method1 종료....");
    }*/
	
	
	static void method1()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.out.println("method1 진입전 ...");
		method1();
		System.out.println("프로그램 종료");*/
		
		/*String s="Hello Java";
		System.out.println(s.substring(0,5));
		System.out.println(s);
*/
		
		method1();
		
	}

}
