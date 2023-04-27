package com_sist_text;
/*
 * 
 *  java.text=> 출력 형태를 만들어서 사용 ( 변경 ) 
 *  ----------
 *  SimpleDateFormat : 날짜 변경 
 *  DecimalFormat: 숫자변환 
 *  ------------- 가격출력 10,0000 원 
 *  MessageFormat : 데이터베이스 = > INSERT, UPDATE 
 *  -------------
 *  String name = "" , sex = "", addr = "", tel = "";
 *  int age =10;
 *  String sql ="INSERT INTO member VALUES("
 *              + " ' " + name + " ' ,' " +sex+ " ','" +addr+ "','"+tel+"','"+age+");
 *  String sql ="INSERT INTO member VALUES ('{1}','{2}','{3}','{4}',{5})
 * 
 * 
 */

import java .util.*;
import java.text.*;


public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 ");
		//yyyy-mm-dd , yyyy/mm/dd
		System.out.println(sdf.format(date));
		/*
		 * 
		 * yyyy 년도 =>rrrr
		 * mm월   =>mm
		 * dd일 => dd
		 * hh시간 => hh24
		 * mm분 => mi
		 * ss초 => ss
		 * 
		 * 
		 */
		
	}

}
