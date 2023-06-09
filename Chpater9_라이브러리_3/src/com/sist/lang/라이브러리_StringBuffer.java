package com.sist.lang;
/*
 * 
 * StringbBuffer 
 * ------------
 * 1.String은 고정형 => 변경이되면 새로운 메모리를 생성
 *                    원본은 그대로 유지 (변하지 않는 문자열 저장)
 *   예) 
 *     String s="Hello Java";
 *    String ss= s.substring(0,5)                 
 *    => 변경해서 저장
 *       s= s.substring(0,5)
 *     => 변경시에 리턴형이 String  
 *     
 * 2. String 을 보완=>가변형 => StringBuffer(비동기) /StringBuilder    
 *     *** 프로그램에서 동기(한개씩 수행)/ 비동기 (동시에 여러개 일 수행) 
 *                  ----           ------  
 *       
 *       네트워크 : 클라이언트(요청)/ 서버(응답)
 *                =>오라클 (자바(요청=>SQL)/오라클서버) 
 *                =>웹(클라이언트/서버)
 *                             --- JSP /Spring
 *                             
 *  3.데이터가 많은 경우 => 문자열 결합 (append)
 *  4.문자열 처리 => 사용하는 클래스
 *  5.처리 속도가 빠르다 (최적화)
 *  6. 주요메소드
 *     length() : 문자갯수
 *     toString() : 객체를 문자열로 변환
 *                  ---------------
 *                  (String), String.valueOF()
 *       delete() : 삭제
 *       *******append():문자열 결합                               
 *       
 *       
 //append()=> 무자열 결합       
 */  

import java.io.*;
import java.net.*;
// => 클래스 =>CheckedException
public class 라이브러리_StringBuffer {

	public static void main(String[] args) {
		
		
		try
		{
			StringBuffer sb=new StringBuffer();
			
			//Buffer =>임시 기억장소
			URL url =new URL("view-source:https://www.10000recipe.com/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			//서버에 연결 
			if(conn!=null)//연결되었다면
			{
				while (true)//한줄씩 읽어온다
				{
					BufferedReader br=
							new BufferedReader( 
									new InputStreamReader(conn.getInputStream(),"UTF"
											String msg= br.readLine();
									if(msg==null) break;
									sb.append(msg +"\n");
									
				}
				conn.disconnect(); //서버 연결 해제
			}
			System.out.println(sb.toString());
		}catch(Exception ex) {ex.printStackTrace();}
		// TcODO Auto-generated method stub

	}

}
