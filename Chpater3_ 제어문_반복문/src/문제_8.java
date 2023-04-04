//1~100까지 의 합
public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			
			sum=sum+i;//sum+=i;
			 System.out.println("sum"+sum+",i="+i);
		}
	
		
		sum=0;// 값을 변경
		for(int i =0;i<=100;i+=2)// 1357
		{
			sum+=i;
		}
		
		System.out.println("=======최종 짝수결과값=====");
		System.out.println("1~100까지의 짝수 합:"+sum);*/
		
		
		int sum=0;
		for(int i=2; i<=100;i+=2)
		{
			sum+=i;
			
		}
		System.out.println(sum);
		
		
		
	}
}