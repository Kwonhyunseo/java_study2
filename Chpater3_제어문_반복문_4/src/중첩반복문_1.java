//2차 for
/*
 *  중첩
 *  
 *  조건문
 *  if()
 *  {
 *   if()
 *   {
 *   }
 *  }
 *  
 *  switch
 *  {
 *  
 *  case값:
 *  switch()
 *  {
 *  }
 *  
 *  }
 *  
 *  for(4)    ==========>줄수
 *  {
 *  
 *    for(5) ===========>출력 갯수
 *    {
 *  
 *     }
 *  
 *  }
 *  
 *  1 2 3 4 5
 *  6 7 8 9 10
 *  11 12 13 14 15
 *  16 17 18 19 20
 * 
 * 
 * A B C
 * D E F
 * G H I
 * J K L
 * M N O
 * 
 * for(초기값;조건식;증가식)======>줄수
 * {
 * ----------------------------------
 *       1    2    4
 *  for(초기값;조건식;조건식)=====>실체출력물
 *  {        ㅣ  
 *     반복 수행문장 3
 *  
 *  }
 *  =========> 2번에서 false ==> 1차 for문 증가식으로 이동
 *  -----------------------------------
 *  다음 줄로 내려준다.
 *  }
 *  
 *  
 *   
 * 
 */
public class 중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	char c='A';
		for(int i=1;i<=5;i++)//줄만 생성
		{
			
			for(int j=1;j<=3;j++)
			{
				
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
*/
		
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++) {
				System.out.println("i="+i+",j="+j);
			}
		}*/
		
		System.out.println("=======구구단==========");
		for(int i=1;i<=9;i++)
		{
			for(int j =2; j<=9;j++)
			{
				System.out.printf("%d*%d=%2d\t",j,i,j*i);
				{
					System.out.println();
				}
			}
		}
		
		
		
		
	}

}
