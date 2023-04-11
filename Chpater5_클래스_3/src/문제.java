import java.util.Scanner;
public class 문제 {
    // 첫 번째 메소드: Integer.toBinaryString() 메소드 사용
    public static void convertToBinary1(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal " + decimal + " in binary: " + binary);
    }

    // 두 번째 메소드: 2로 나누기 반복하여 이진수 구하기
    public static void convertToBinary2(int decimal) {
        int quotient = decimal;
        String binary = "";

        while (quotient != 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            binary = remainder + binary;
        }

        System.out.println("Decimal " + decimal + " in binary: " + binary);
    }

    // 세 번째 메소드: 비트 연산자를 사용하여 이진수 구하기
    public static void convertToBinary3(int decimal) {
        String binary = "";

        for (int i = 31; i >= 0; i--) {
            int bit = (decimal >> i) & 1;
            binary += bit;
        }

        System.out.println("Decimal " + decimal + " in binary: " + binary);
    }

    // 메인 메소드: 사용자로부터 정수를 입력받아 이진수로 변환하는 메소드 호출
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        convertToBinary1(decimal);
        convertToBinary2(decimal);
        convertToBinary3(decimal);

        scanner.close();
    }
}