import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {10,20,30,40,50};
      //1. 배열의 크기를 출력
      //2. 3번째가 값을 300
      //3. 5번쨰을 출력
      
      System.out.println("배열의크기 : " + arr.length);
      
      arr[2]=300;
      System.out.println(Arrays.toString(arr));
      System.out.println("5번쨰 값 : "+arr[4]);
      
	}

}
