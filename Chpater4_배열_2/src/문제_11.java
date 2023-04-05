import java.util.Arrays;
import java.util.Scanner;
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

	/*	int[] arr = new int[10];
		int i;

		for( i=0; i<10; i++)
		{
			arr[i] = scn.nextInt();
		}

		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
	}
}
	*/
		
		
		int[] arr= new int [10];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
        System.out.println("세번째 숫자 : " + arr[2]);
        System.out.println("다섯번째 숫자 : " + arr[5]);
        System.out.println("마지막 숫자 : " + arr[arr.length-1]);
	}
}