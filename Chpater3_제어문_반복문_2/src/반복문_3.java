//3의배수,5의 배수,7의배수합=> 갯수
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a3=0, a5=0,a7=0; //합
		int c3=0, c5=0, c7=0; //갯수
	
	
	 int i =1;
	 while (i<=100)
	 {
		 
		 
		  //중복적으로 수행 => 단일 조건, 중복이 없는 경우 => 다중 조건 
		 if(i%3==0)
		 
		 {
			  a3+=i;//합
			  c3++;//갯수
			 
		 }
		 if(i%5==0)
		 {
			 
			 a5+=i;
			 c5++;
			 
		 }
		 if(i%7==0)
		 {
			 a7+=i;
			 c7++;
		 }
	 }    i++; //증가식
	
	 System.out.println("============결과값===========");
	 System.out.println("1~100 사이의 3의 배수합 : "+a3+",갯수:"+c3); 
	 System.out.println("1~100 사이의 3의 배수합 : "+a5+",갯수:"+c5);
	 System.out.println("1~100 사이의 3의 배수합 : "+a7+",갯수:"+c7);
	 
	 int max=c3;
	 if(max<c5)
		 max=c5;
		 if(max<c7)
			 max=c7;
	 System.out.println("가장 맣은 갯수는 " +max));
	}
	
	
	


}
