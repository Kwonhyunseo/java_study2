import java.util.Scanner;
public class 문제_9 {

	public static void main(String[] args) {
		
		/*
		
		int[] arr= {5,10,9,3,2};
		for(int i : arr)
		{
			System.out.print(i+ " ");
		}
		// TODO Auto-generated method stub

	}

}
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 5개 입력: ");
		int[] arr=new int [5];
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		arr[3]=scan.nextInt();
		arr[4]=scan.nextInt();
		for(int i : arr)
		{
			System.out.print(i+"  ");
			
		}
	}
}
		