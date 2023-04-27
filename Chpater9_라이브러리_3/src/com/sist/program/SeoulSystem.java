package com.sist.program;
//VO => DAO =>  전송  => 관련된 데이터는 무조건 묶어서 보낸다(VO)
import java.util.*;
import java.io.*;
public class SeoulSystem {
 private static SeoulLocationVo[] datas=new SeoulLocationVo[273];
 private int curpage ;//프로그램 종료시까찌 유지
 private int totalpage;
 //모든 사용자가 데이터를 공통으로 사용 
 static
 {
	 //데이터를 읽어서 메모리에 저장 =>초기화
	 try
	 {
		 StringBuffer sb =new StringBuffer();
		 int i=0;
		 FileReader fr = new FileReader("C:\\Users\\SIST\\Desktop\\seoul_location.txt");
		 while((i =fr.read())!=-1)
		 {
			 sb.append(String.valueOf((char)i));
			 
		 }
		 int k=0;
		 fr.close();
		 String [] loactions =sb.toString().split("\n");
		 String
		 System.out.println(sb.toString());
		 datas[k] = new SeoulLocationVo();
		 datas[k].setNo(Integer.parseInt(st.nextToken));
		 datas[k].setName(st.nextToken);
		 datas[k].setContent(st.nextToken);
		 datas[k].setAddress(st.nextToken);
	 }catch(Exception ex) {}
	 
	 public SeoulLocationVo[] seoulList(int page)

	 {
		 
		 SeoulLocationVo[] data=
				 new SeoulLocationVo[10];
						 int j=0;// 10개씩 나눠주는 변수 
		 int start=(page*10)-10; // 시작점 
		 /*
		  * 
		  * 1page =>0~9
		  * 2page =>10~19
		  * 3page=> 20~29
		  * 
		  * 
		  */
		 
		 for(int i =0; i< data.length;i++)
		 {
			 if(j<10 && i>=start)
			 {
				 data[k]=datas[i];
				 k++;
				 j++;
			 }
		 }
		 return data;
				 
	 }
	 public int seoulTotalPage()
	 {
		 return (int) (Math.ceil(datas.length/10.0));
		 //
	 }
	 //페이지별 데이터 출력
	 //메뉴 
	 public int menu()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("==============메뉴==============");
		 System.out.println("1.목록 출력(페이지별 ");
		 System.out.println("2.상세보기");
		 System.out.println("3. 명소 검색 ");
		 System.out.println("4.주소 검색");
		 System.out.println("9 종료");
		 System.out.println("===============================");
		 System.out.println("메뉴 선택 : ");
		return scan.nextInt();
	 }
	 //검색 => 이름
	 public SeoulLocationVo[] nameFind(String fd)
	 {
		 int count=0;
		 for (SeoulLocationVo vo :datas)
		 {
			 if (vo.getName().contains(fd))
			 {
				 count++;
			 }
		 }
		 //고정 =>가변 (Collection)
		 SeoulLocationVo[]seoul =new SeoulLocationVo[count];
		 int i = 0;
		 for (SeoulLocationVo vo :datas)
		 {
			 if (vo.getName().contains(fd))
			 {
				 seoul[i]=vo;
				 i++;
			 }
		 }
		 
		 return seoul;
	 }
	 public SeoulLocationVo[] addresssFind(String addr)
	 {
		 int count=0;
		 for (SeoulLocationVo vo :datas)
		 {
			 if (vo.getaddress().contains(addr))
			 {
				 count++;
			 }
		 }
		 //고정 =>가변 (Collection)
		 SeoulLocationVo[]seoul =new SeoulLocationVo[count];
		 int i = 0;
		 for (SeoulLocationVo vo :datas)
		 {
			 if (vo.getAddress().contains(fd))
			 {
				 seoul[i]=vo;
				 i++;
			 }
		 }
		 
		 return seoul;
	 //주소 검색
	 //상세보기 
	 public void process()
	 {
		 System.out.println("★★★★★★★★★★★★★★sist 영화★★★★★★★★★★★★★★★★★★★★");
		 while(true)
		 {
			 int menu =menu();
			 if(menu=9)
			 {
				 System.out.println("프로그램 종료!!!");
				 break;
			 }
			 else if (menu==3)
			 {
				 Scanner scan =new Scanner(System.in);
				 System.out.print("검색어 입력:");
				 String name = scan.next();
				  SeoulLocationVo[] data =nameFind(name);
				  System.out.println(name + " ")
						  for(SeoulLocationVo vo :data)
						  {System.out.println(vo.getNo()+"."+ vo.getName());
							  
						  }
			 }
		 }else if (menu==4)
		 {
			 Scanner scan =new Scanner(System.in);
			 System.out.print("주소 입력:");
			 String name = scan.next();
			  SeoulLocationVo[] data =nameFind(name);
			  System.out.println(name + "검색은 총  "+data.length+"건입니다.");
					  for(SeoulLocationVo vo :data)
					  {System.out.println(vo.getNo()+"."+ vo.getName());
					  }
					  
					  else if (menu==1)
					  {
						  Scanner scan=new Scanner(System.in);
						  while(true)
						  {System.out.println("페이지 입력(1~28):");
						  curpage=scan.nextInt();
						  if(curpage<1|| curpage>28)
							  
						  {
							  System.out.println("없는 페이지입니다.");
							  continue;
						  }
						 break;
						  totalpage=seoulTotalPage();
						  System.out.println(curpage+ " page / " + totalpage +" pages )
						  SeoulLoacationVo[] data = seoulList(curpage);
						  for(SeoulLoacationVo vo:data);
						  {
							  if(vo!=null)
							  {
								  System.out.println(vo.getNo()+ " . " + vo.getName());
							  }
						 
						  }
					  }
					  else if(menu==2)
					  {
						  
						  Scanner scan=new Scanner(System.in);
						  System.out.print("상세볼 명소번호 입력 (1~273):");
						  int no= scan.nextInt();
						  System.out.println("번호: "+datas[no-1].get	No());
						  System.out.println("번호: "+datas[no-1].get	Name());
						  System.out.println("번호: "+datas[no-1].get	Address());
						  
						  System.out.println("번호: "+datas[no-1].get	Content());
						
					  }
		 }
	 }
	 
 }
 public static void mian (String [] args) {
	 SeoulSystem ss= new SeoulSystem();
	 
	 for(SeoulLocationVo vo : datas)
	 {
		 System.out.println(vo.getNo());
		 System.out.println(vo.getAddress());
		 System.out.println(vo.getContent());
		 System.out.println(vo.getContent()));
		 
	 }
 }
}

