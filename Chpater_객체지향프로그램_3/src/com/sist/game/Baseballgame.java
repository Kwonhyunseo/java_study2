package com.sist.game;
/*
 * 
 *  1. 컴퓨터 난수 발생 int []com
 *  2. 사용자 입력 int [] user
 *  3. 비교 int[] com/ int user => s,b
 *  4. 힌트 s,b
 *  5. 종료여부 확인 s 
 *  
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

import com.sist.movie.Movie;

public class Baseballgame {

	
	
	int[] com = new int [3];
	int [] user=new int[3];
	int s,b;
	//1/ 컴퓨터 난수 발생 
	void rand()
	{
		
		for( int i =0; i< com .length;i++)
		{
			
			com[i]=(int )(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i] ==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		
	}
	
	//2. 사용자 입력 void
	void userInput()
	{
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input <100 || input > 999)
			{
				System.out.println("잘못된 입력입니다.!!!");
			 
				continue; //도스에서만
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("같은 숫자는 사용할수 없습니다.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할수없습니다.");
				continue;
			}
			break;
				
				
			}
		}
	
	void compare()

	{
		s=0;
		b=0;
		for(int i=0;i<com.length;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(com[i]==user[j]) 
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		
	}
	//3. 비교 void
	//4. 힌트 void
	
	void hint()
	{
		System.out.printf("InputNumber : %d%d%d, Result :  %dS-%dB\n",user[0],user[1],user[2],s,b);
	}
	//5.종료여부 void
	
	boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	//6.조립 =>process
	void process()
	{
		Scanner scan=new Scanner(System.in);
		rand();
		while(true)
		{
			
			
			
				userInput();
				compare();
				hint();
				if(isEnd(s))
				{
					System.out.println("게임을 다시할까요?(y(Y)/n(N)):");
					
				 char c= scan.next().charAt(0);
				 if(c=='y'||c=='Y')
				 {
					 System.out.println("새게임을 시작합니다!!");
					 process();//재귀호출
					 
				 }
				 else
				 {

						System.out.println("Game over");
						System.exit(0);
						
				 }
			}
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Baseballgame b= new Baseballgame();
		b.process();
	}
	
	
	
	
	
}
