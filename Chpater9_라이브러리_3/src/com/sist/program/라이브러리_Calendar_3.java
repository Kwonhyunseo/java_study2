package com.sist.program;
import java.text.SimpleDateFormat;
import java.util.*;
public class 라이브러리_Calendar_3 {
   public static void log()
   {
	   SimpleDateFormat sdf = new  SimpleDateFormat("mm 분 ss초");
	   long start =System.currentTimeMillis();
	   for(int i=0; i< 100000;i++)
	   {
		   
	   }
	  
	   long end = System.currentTimeMillis();
	   long result =end - start;
	   Date date = new Date(result);
	
	   System.out.println(sdf.format(date));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//long a= System.currentTimeMillis();
		//Date date =new Date(a);
		//System.out.println(date);
		log ();
		
		
	}

}
