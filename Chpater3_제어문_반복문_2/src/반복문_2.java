//while =반복횟수가 없는 경우에 주로 사용(무한루프)
public class 반복문_2 {
	
   public static void main(String[] args) {
	   
	   
	   int sum =0, even=0,odd=0;
	   
	   int i =1;
	   while(i<=1000)
	   {
		   sum+=i;
		   if(i%2==0)
	          even+=i;
		   else
			   odd+=i;
		   i++;
	   }
	   System.out.println("1~100까지의 총합:"+sum);
	   System.out.println("1~100까지의 짝수합:"+even);
	   System.out.println("1~100까지의 홀수의 합:"+odd);
	   
	   
   }

}
