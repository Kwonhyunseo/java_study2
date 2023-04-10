/*
 * 
 * 1.조건문 / 선택문 
 *   ----------- 상세보기 , 검색 ,로그인, 아이디체크, 우편번호 검색
 *   ----------- 댓글, 수정, 삭제...
 *   형식) 
 *       if(조건문)=>조건문(부정,연산자,비교연산자,논리연산자)
 *       {
 *         출력내용=>true일때만 수행하는 문장
 *       } 
 *       예) => 번호 3번인 내용을 출력해라 => 상세
 *       -----------------------------------
 *       단일 : 속도가 늦다.(독립적인 문장) => 중복적으로 수행
 *       ------------------------------------------
 *       다중조건 
 *       
 *       true/false을 나눠서 처리
 *       ---------------------
 *       if(조건문)
 *       {
 *          조건이 true일때 처리
 *       }
 *       else
 *       {
 *         조건이 false일때 처리
 *       }
 *       
 *       예)
 *           if(로그인이 되었다면)
 *           { 
 *              main으로 이동해라
 *            }
 *            
 *           else
 *           {
 *             회원가입으로 해라
 *           }
 *
 *
 *
 *        if(아이디중복체크 =>중복)
 *        {
 *         이미사용중이 아이디입니다=> 메세지
 *         }
 *         else
 *         {
 *         
 *          사용이 가능한 아이디입니다.
 *          }
 *          
 *          if(검색된 있는 경우)
 *          { 
 *             검색된 내용 출력
 *             
 *           }
 *           
 *           else
 *           {
 *           
 *            검색된 내용이 없습니다
 *            }
 *       
 *   다중조건문 : 조건이 많은 경우 해당되는 조건만 수행이 가능 
 *   if()
 *   {
 *    조건문 true일때 수행되는 문장 ==> 종료
 *    조건문 false일떄
 *          |
 *   }
 *   else if(조건문)
 *   {
 *    조건문 true일때 수행되는 문장 ==> 종료
 *    조건문 false일떄
 *   }      |
 *   else if()
 *   {
 *    조건문 true일때 수행되는 문장 ==> 종료
 *    조건문 false일떄
 *   }     |
 *   else if()
 *   {
 *    조건문 true일때 수행되는 문장 ==> 종료
 *    조건문 false일떄
 *   }
 *   else
 *   {
 *       해당 조건이 없는 경우 ==> 생략이 가능
 *    }
 *   
 *   
 *   조건이 두개인 경우 ==> &&
 *   if( 아이디가 같고 비밀번호가 같으면)
 *   if( id.equals("") && pwd.equals(""))
 *   {
 *   }
 *   
 *   웹 => 일반사용자 => 최대한 서비스
 *   /////////////////////////////
 *   if(id.equals(""))
 *   { 
 *     if(pwd.equals(""))
 *     {
 *       로그인
 *     }
 *     else
 *     {
 *       비밀번호 틀립니다.
 *     }
 *   } 
 *   else
 *   {
 *   
 *    아이디가 존재하지 않습니다.
 *   
 *   
 *   }
 *   ///////////////////////////////
 *   
 *   선택문 : 네트워크, 게임 (키값)
 *   switch(정수,문자,문자열) ==> 해당위치로부터 break가 나올때 까지 수행
 *                 -----
 *   
 *   {
 *     case "Login";
 *       처리
 *       break;
 *     case "Logout";
 *       처리
 *       break;
 *    ... 
 *    ...
 *    default:
 *   ===> 1 2 ( 문장 2,3,4)
 *   case 1:
 *     문장1 ==> 수행후 종료
 *     break
 *   case 2:
 *     문장2
 *   case 3:
 *     문장3
 *   case 4:
 *     문장4
 *     break;
 *   case 5:
 *   
 *   switch()
 *   {
 *     case 1:
 *      int a=10;
 *       System.out.println(a);
 *       break;
 *      case 2: 
 *      int a=20;
 *       System.out.println(a);
 *       break;
 *      case 2: 
 *      int a=30;
 *       System.out.println(a);
 *       break;
 *       
 *       
 *       
 *       
 *       
 * 2.반복문
 * ------------- 목록, 페이징(화면 출력)
 * 1)for : 반복횟수가 지정된 경우
 * 2)while:반복횟수가 없는경우
 *    => 파일읽기, 데이터베이스
 * 3)do~while: 한번이상을 수행 .....
 * 
 * 3.반복 제어문
 * 
 * ------------- 페이징  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub

		int i=1;
		switch(i)
		{
		case 1:
		{
			int a=10;
			System.out.println(a);
			
		}
		    break;
		case 2:
		{
			int a=20;
			System.out.println(a);
			
		}
		   break;
		case 3:
		{
			int a=30;
			System.out.println(a);
			
		}
		
		
		
	}*/

		
		
		String[] title= {"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear"};
		System.out.println("총" + title.length+"곡");
		
		int page=0; 
		if(page == 0)
			page=1;
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("페이지 입력:");
	     page =scan.nextInt();
	     break;
	}
	    

		int j=0;
		int rowSize=2;
		int pagecnt=(page*rowSize)-rowSize; //start
		/*
		 *  start    end
		 *   0        9  => 1page
		 *   10       19 => 2page
		 *   20       29 => 3page
		 *   
		 *   
		 *   
		 * 
		 */
		// =>오라클 (인라인뷰)
		for(int i=0;i<title.length;i++)
		{
			if(j<10 && i>=pagecnt) //0~9 SKIP
			{
				System.out.println((i+1)+"."+title[i]);
			}
		}
		
		
		
		
	}
		
		
		
}
