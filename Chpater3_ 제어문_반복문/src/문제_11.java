import java.util.Scanner;
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		
		System.out.println("1부터" + num+ " 까지 합 : " + sum);
		
		
		
	}

}
