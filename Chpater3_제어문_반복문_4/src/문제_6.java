import java.util.Scanner;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int start=scan.nextInt();
		int end=0;
		while(true)
		{

			System.out.println("두번졔 정수 입력:");
			end=scan.nextInt();
			if(end<start)
			{
				System.out.println("첫번쩨 정수보다 큰수여야 합니다.");
				continue;
				
			}
			break;

		}
		int gop=1;
		for(int i= start; i<=end;i++)
		{
			
		}
		System.out.println()
		
	}

}
