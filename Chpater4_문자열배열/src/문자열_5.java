//분리
/*
 *  문자를 자르기 : substring()
 *  문자 분리 :split()
 *  문자변경: replace() ,replaceAll()
 *  모든 데이터형 문자열 변경 : valueof()
 * 
 * 
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] music= {"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear"};
		/*	String s="HELLO JAVA!!";
			       //01234567891011
		 System.out.println("원본 : "+s);
		 String s1=s.substring(6);
		 System.out.println(s1);
		 String s2=s.substring(0,5);
		 System.out.println(s2);
		 String s3=s.substring(10,11);
		 System.out.println(s3);*/
		/*String ss="꽃";
		System.out.println(ss.length());
		for(String s:music)
			
		{
			System.out.println(s);
		}*/
		
		
		/*for(String s :music)
		{
			if(s.length()>1)
			{
				String ss=s.substring(0,1)+"....";
				System.out.println(ss);
			}
			else
			{
				System.out.println(s);
			}
		}*/
		
		
		String addr="서울특별시 성북구 개운사길 14"
				+ "지번 서울시 성북구 안암동5가 101-28";
		
		String s=addr.substring(0,addr.lastIndexOf("지"));
		 System.out.println(s);
		 /*
		  * 
		  *  인덱스가 있는 위치값
		  *  lastIndexOf()
		  *  indexOf()
		  * 
		  */
		 
		 String ss=addr.substring(addr.lastIndexOf("서울"));
		 System.out.println(ss);
		// String sss="Hello java";
		 // a 
		 
		 String str= "Hello java!!";
		 String sss1=str.replace("java","Oracle");
		 
		 System.out.println(sss1);
		 
		 
		 
		 
		 
		 
		 
	}

}
