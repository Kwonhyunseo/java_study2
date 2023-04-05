import java.util.Arrays;
import java.util.Scanner;
public class 문제_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	/*	int arr[] = new int[10];
		int sum = 0;
		double ave = 0;
		System.out.print("랜덤한 정수들: ");
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++)
			sum += arr[i];
		ave = sum / 10.0;
		
		System.out.println("평균은 " + ave);
		scanner.close();		
	}
}*/
		
		int[] arr= new int[10];
		for(int i =0; i< arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		for(int i:arr)
		{
			
			total+=i;
		}
		
		System.out.printf("평균:%.2f",(total/10.0));
		
	}
}









