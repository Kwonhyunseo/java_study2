package com.sist.lib;
import java.util.*;
public class 라이브러리_Set_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set set=new HashSet();
		for(int i =0; i<10;i++)
		{
			int r=(int)(Math.random()*100)+1;
					set.add(r);
		}
		System.out.println(set);
		//50보다 작은 수
		//50보다 큰 수 
		for (int j=0;j<50;j++)
				{
			System.out.println(j);
				}
				
		for (int j=0;j>50;j++)
		{
	System.out.println(j);
		}
		System.out.println("========================");
		//1.정렬
		//2. 검색이 빠르다.
		TreeSet tset=new TreeSet();
		for(int i=0; i<10; i++)
		{
			int r=(int )(Math.random()*100)+1;
			tSet.add(r);
			
		}
		System.out.println(tSet);
		System.out.println("50보다 작은 수 : "+tSet.headSet(50));
		System.out.println("50보다 작은 수 : "+tSet.tailSet(50));
		
	}

}
