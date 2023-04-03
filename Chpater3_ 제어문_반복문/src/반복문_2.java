//1~100까지 의 합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1;i<=100;i++)
		{
			
			sum=sum+i;//sum+=i;
			 System.out.println("sum"+sum+",i="+i);
		}
		System.out.println("=======최종 결과값=====");
		System.out.println("1~100까지의 합:"+sum);
		
		sum=0;// 값을 변경
		for(int i =0;i<=100;i+=2)// 1357
		{
			sum+=i;
		}
		
		System.out.println("=======최종 짝수결과값=====");
		System.out.println("1~100까지의 짝수 합:"+sum);
		
		
		
		sum=0;// 값을 변경
		for(int i =3;i<=100;i+=3)// 1357
		{
			sum+=i;
		}
		
		System.out.println("=======최종 3의배수 합결과값=====");
		System.out.println("1~100까지의 3의배수 합:"+sum);
		
		
		
		
	}

}
