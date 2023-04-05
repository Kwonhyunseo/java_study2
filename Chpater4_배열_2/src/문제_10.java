import java.util.Scanner;
public class 문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		char[] arr = new char[10];
		int i;

		for( i=0; i<10; i++)
		{
			arr[i] = scn.next().charAt(0);
			System.out.print(arr[i]);
		}
	}
}