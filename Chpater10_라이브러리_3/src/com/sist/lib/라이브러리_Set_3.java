package com.sist.lib;
import java.util.*;
//
//<div class="ellipsis rank01"><span>








//<a href="javascript:melon.play.playSong('1000002721',36318125);" title="Kitsch 재생">Kitsch</a>
//</span></div><br>
import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class 라이브러리_Set_3 {
   public static Set genieMusic()
   {
	Set set =new HashSet();
	try
	{
		for(int i=1;i<=2;i++)
		{
			Document doc =Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg=2").get();
			Elements title =  (Elements) doc.select("table.list-wrap a.title");
			for(int j=0; j<(   (List<Element>) title).size();j++)
			{
				//System.out.println(title.get(j).text());
				//set.add(((ArrayList<Element>) title).get(j).text());
			}
		}
	}catch(Exception ex) {}
			return set;
   }
   public static Set melonMusic()
   {
	   Set set =new HashSet();
	   try
	   {
		   Document doc =Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		 org.jsoup.select.Elements title= doc.select("div.wrap_song_info div.rank01 a");
				
				 for(int i=0; i<title.size();i++)
				 {
					// System.out.println(title.get(i).text());
					 //set.add(title.get(i).text());
				 }
	   }catch(Exception ex) {}
		return set;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //지니뮤직 읽기
		Set genie= genieMusic();
		System.out.println(genie);
		 //멜론 읽기
		Set melon = melonMusic();
		System.out.println(melon);
		
	//지니뮤직에만 있는 노래 찾기
		genie.removeAll(melon);//차집합
		//[1,2,3,4,5]-[1,2,3,4,6,7]=[5]
		System.out.println(genie);
		
		for(Object obj: genie)
		{
			System.out.println(obj.toString()); 
			 melon.retainAll(genie); //교집합 
				for(Object obj1:melon)
				{
					System.out.println(obj1.toString());
				}
		}
	}

}
