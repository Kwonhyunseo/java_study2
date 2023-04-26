package com.sist.string;
import java.io.*;
public class 라이브러리_String_2 {

	public static void main(String[] args) {
		
		try{
			FileReader fr =new FileReader ("‪‪c:\\Users\\SIST\\Desktop\\movie.txt");
			int i=0;
			String data= "" ;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
		
			
			fr.close();
			System.out.println(data);
		}catch(IOException ex)
		{
			ex.printStackTrace(); //에러 메세지 확인
			//getMessage(0
		}  
	

	}

}
