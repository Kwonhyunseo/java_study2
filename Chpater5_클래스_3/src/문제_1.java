import java.util.Scanner;
/*
 *  method =>140page
 *  1)메소드 형식 => 기능처리
 *    -------
 *    웹=> 화면 변경
 *    ---------- 메뉴 클릭, 버튼 클릭, 이미지 클릭....
 *    검색, 글쓰기 , 수정, 회원가입, 회원탈퇴...
 *    사용자의 동작과 관련 
 *    리턴형 메소드명(매개변수...) => 선언부
 *    {
 *     구현부 
 *    }
 *    
 *    = 리턴타입(리턴형)
 *     처리후 결과값 한개만 전송이 가능하다
 *     **** 여러개인 경우 : 배열 ,클래스
 *     **** 한개인 경우 : 일반 기본형 , String 
 *     1)결과값이 있는경우
 *        리턴형 메소드(매개변수...)
 *        ----
 *        {
 *        return 값; 일치 ==> 리턴형 클수도 있따
 *        }     ---    
 *       예) 
 *          int method()
 *           {
 *             return 10.5; => 오류발생
 *           }
 *           int method()
 *           {
 *             return (int)10.5; => 오류발생
 *           }
 *           ==> int a =method(); ==> a=10
 *                ==> method()
 *           double method()
 *           {
 *            return 10;
 *           }
 *           ==> double d= method()
 *               ==> 결과값을 받아서 처리
 *           예) 오라클에서 데이터를 읽기
 *           ----------------------
 *           => 브라우저로 보낸다
 *           int[] method()
 *           {
 *            int[] arr={1,2,3,4,5};
 *            return arr;//배열 주소만 넘겨준다
 *            }
 *            ==> int [] arr = method()
 *            String method()
 *            {
 *            
 *     2)결과값이 없는 경우
 *      void method()
 *      ----
 *      
 *      {
 *        return;// 메소드 종료
 *      }
 *      void method1()
 *      {
 *        생략=> 컴파일러가 자동으로 추가 return
 *      }
 *      => import 추가
 *         import java.lang.*=> 자동추가
 *         System
 *         String
 *         Math
 *         --------
 *      
 *      ==>method()   
 *      
 *    =메소드명 => 식별자와 동일 
 *               길이에 제한이 없다.= 의미를 부여
 *               aaa(), bbb(), ccc()
 *               getName()
 *    =매개변수 : 사용자 요청값 
 *    메소드 유형
 *    --------
 *    리터형 매개변수
 *     0     0
 *     0     x
 *     x     0
 *     x     x
 * 
 * 
 */

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
