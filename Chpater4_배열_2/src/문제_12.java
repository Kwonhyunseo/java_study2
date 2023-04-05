import java.util.Arrays;
import java.util.Scanner;
public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

	/*	int[] arr = new int[10];
		int i, max;

		for( i=0; i<arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}

		max = arr[0];

		for( i=1; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}

		System.out.print(max);
	}
}*/
		
		int[] arr= new int[10]
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=(int)(Math.random()*100)+1;
				}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		for(int i : arr)
		{
			if(max<i)
				max=i;
		}
		System.out.println("최댓값:" +max);
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		