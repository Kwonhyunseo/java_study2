//16비트 => 0,1
import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		//저장 공간(0,1)
		int input=scan.nextInt();
		System.out.println(Integer.toBinaryString(input));
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==2)
				break;
			index--;
		}
		
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
		}
	}

}
