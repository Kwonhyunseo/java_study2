// 4.  두 정수를 나눗셈 결과를 구해주는 메소드 구현 

public class 문제_4 {
static double method4 (int a, int b)
{
	return a/(double)b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double d=method4(10,3);
       System.out.printf("%.2f\n",d);
	}

}
