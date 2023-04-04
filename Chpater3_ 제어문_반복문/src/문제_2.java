import java.util.Scanner;
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = scan.nextInt();
		if(num%3==0)
			System.out.println("3의 배수입니다.");
		else 
			System.out.println("3의 배수가 아닙니다.");
		*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력");
		int num=scan.nextInt();
		if(num%3==0)
			System.out.println(num+"는 3의 배수입니다.");
		else
			System.out.println(num+"는 3의 배수가 아빕니다.");
		
	}
					

}
