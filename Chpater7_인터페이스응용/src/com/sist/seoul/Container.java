package com.sist.seoul;
import java.util.*;

public class Container {

	
	String[] clsArr= {
			"com.sist.seoulLocation",
			"com.sist.seoulNature",
			"com.sist.seoulShopping",
			"com.sist.seoulHotel",
			"com.sist.seoulGuestHouse",
			
			
	};
	private String[] key= {
		
		"loc", "nat", "shop" , "hotel", "guest"
	};
	private Map clsMap=new HashMap();
	public Container()
	{
		
		try
		{
			for(int i=0; i<key.length;i++)
			{
				Class clsName=Class.forName(clsArr[i]);
				Object obj =clsName.getDeclaredConstructor().newInstance();
			    System.out.println(obj);
			    clsMap.put(key[i],obj);
			}
			
		}catch(Exception e) {}
	}
	public Object getBean(String Key)
	{
		return clsMap.get(Key);
	}
	
	public static void main(String[] args) {
		Container c= new Container();
	}
}
