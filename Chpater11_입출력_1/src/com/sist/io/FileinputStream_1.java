package com.sist.io;
import java.io.FileInputStream;
/*
 * 
 * FileInputStream : 단위 byte (1byte씩 읽어온다)
 *  => 한글 포함된 데이터는 읽을 수 있는데 한글이 꺠진다.
 *    -------------- FileReader 
 *     .zip , .ppt , .png ... => 업로드 /다운로드
 *     -------------- 웹에서 자료실 , 갤러리 게시판 만들기 
 * 
 * => 주요메소드
 *   read() => 1byte =>리턴형 =>int 
 *   close() 닫기 
 *   
 * => 생성자 
 *    new FileInputStream (File file)
 *    new FileInputStream(String path)
 *      
 */
import java.util.*; 
import java.io.*;
public class FileinputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			//파일 읽기
			
			
			FileInputStream fis = new FileInputStream("C:\\Users\\SIST\\eclipse-javastudy\\Chpater11_입출력_1\\src\\com\\sist\\io\\FileinputStream_1.java" );
			int i = 0; // 1개 의 문자를 읽어 온다 => 문자 번호를 넘겨쥰다
			// 문자 번호를 받는 변수
			// -1 은 더이상 읽을 데이터가 없을 때 까지  =>EOF( End Of File ) -1 
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i); // 'A' =>65
			}
		}catch(Exception  ex) {}
		
		
		
		
	}

}
