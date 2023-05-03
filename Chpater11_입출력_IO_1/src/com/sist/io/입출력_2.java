package com.sist.io;
//파일 읽기 
// FileInputStream(1byte) /FileReader(2byte)
// 한글이 포함 ==> 반드시 2byte씩 읽어야 =>한글깨짐 방지가 가능하다 .
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileReader reader=null;
		try
		{
			reader= new FileReader("c:\\javaDev\\movie.txt");
			BufferedReader in= new BufferedReader(reader);
			int i =0; // 한글자씩 읽기 => read()
			//int read() => 글자의ASC코드를 읽어 온다 (정수)
			// A =>read () =>65 
			// int read (byte[] int,int ) => 읽은 바이트수 
			long start = System.currentTimeMillis();
		/*	while((i=reader.read())!=-1)
			{
				//-1 =>읽을 데이터가 없는 경우 => 전체 데이터 읽은 경우 
				// EOF 
				System.out.print((char)i);
			}*/
			while(true)
			{ String data = in.readLine();
			   if(data==null) break;
				System.out.println(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			}catch(Exception ex) {}
		}
		
		
		
	}

}
