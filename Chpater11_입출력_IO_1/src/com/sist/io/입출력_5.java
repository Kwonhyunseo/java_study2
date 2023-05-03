package com.sist.io;
import java.io.*;
import java.net.*;
public class 입출력_5 {
	
	/*
	 *  URLConnection => url.openConnction()
	 *    |
	 *    --------------------------
	 *    |                        |
	 *  HttpURLConnection  HttpsURLConnction
	 *  
	 *  
	 *  class A
	 *  class B extends A
	 *  
	 *  B b =(B) new A () ; => 오류
	 *  int a = (int ) 10.5
	 *
	 * 
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 URL url=new URL("https://www.10000recipe.com ");
		 HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		if(conn!=null)
		{ //브라우저 =>1byte씩 전송
			//1byte=>2byte로 변환 
			// InputStreamReader
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			while(true)
			{
				String data= in.readLine();
						if(data==null)break;
						System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
		
		
		
		
		
		
	}

}
