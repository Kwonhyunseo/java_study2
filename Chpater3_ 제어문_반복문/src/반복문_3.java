//3의 배수의 합 , 갯수 확인 (1~100)
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,count=0;
		for(int i=5;i<=100;i+=5)
		{
			if(i%5==0)
			{
				sum+=i;//합계
				count++; //갯수확인
			}
		}
		System.out.println("======결과값======");
		System.out.println("1~100까지 5의 배수의 합 : " +sum);
		System.out.println("1~100까지 5의 배수의 갯수:" +count);
		int sum2=0,count2=0;
		for(int i=7;i<=100;i+=7)
		{
			if(i%7==0)
			{
				sum2+=i;//합계
				count2++; //갯수확인
			}
		}
		System.out.println("======결과값======");
		System.out.println("1~100까지 7의 배수의 합 : " +sum2);
		System.out.println("1~100까지 7의 배수의 갯수:" +count2);
	}

}
