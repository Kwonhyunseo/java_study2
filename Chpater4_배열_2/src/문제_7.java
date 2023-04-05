import java.util.Arrays;
import java.util.Scanner;
public class 문제_7 {
		public static void main(String[] args) {

		/*	// 정수형 배열 선언
			int inputTen[] = new int[10];

			// 스캐너로 총 10개의 정수를 사용자로부터 입력 받기
			Scanner sc = new Scanner(System.in);
			System.out.print("10개의 정수를 입력하세요");

			for (int i = 0; i < inputTen.length; i++) {
				inputTen[i] = sc.nextInt();
			}

			//3의 배수만 출력
			int ck = 0;
			for(int i=0;i<inputTen.length;i++){
				if(inputTen[i]%3 == 0){
					System.out.println("3의 배수 :"+inputTen[i]);
				}else{
					ck++;
					if(ck ==10){
						System.out.println("해당사항 없음");
					}
				}
			}

		}//end of main()
	}
*/
			
			
			int[] arr=new int[10];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=(int)(Math.random()*100)+1;
				
			}
			System.out.println(Arrays.toString(arr));
			for(int i : arr)


			{
				if(i%3==0)
					System.out.print(i+"");
			}
			
			
		}
			
			
}			
			
			