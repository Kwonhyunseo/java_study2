import java.util.Arrays;
import java.util.Scanner;

public class 메소드만들기 {

    public static void main(String[] args) {
        int[] com = generateRandomNumbers();
        Scanner scan = new Scanner(System.in);

        while (true) {
            int input = getUserInput(scan);

            int[] user = splitNumber(input);
            if (!isValidInput(user)) {
                continue;
            }

            int[] result = compareNumbers(com, user);
            printResult(input, result[0], result[1]);

            if (result[0] == 3) {
                System.out.println("Game over!");
                break;
            }
        }
    }

    private static int[] generateRandomNumbers() {
        int[] com = new int[3];
        for (int i = 0; i < 3; i++) {
            com[i] = (int) (Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                    break;
                }
            }
        }
        return com;
    }

    private static int getUserInput(Scanner scan) {
        System.out.print("세자리 정수 입력: ");
        int input = scan.nextInt();
        return input;
    }

    private static int[] splitNumber(int number) {
        int[] digits = new int[3];
        digits[0] = number / 100;
        digits[1] = (number % 100) / 10;
        digits[2] = number % 10;
        return digits;
    }

    private static boolean isValidInput(int[] user) {
        if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
            System.out.println("같은 숫자는 사용이 불가능합니다!!");
            return false;
        }
        if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
            System.out.println("0을 입력할 수 없습니다.");
            return false;
        }
        return true;
    }

    private static int[] compareNumbers(int[] com, int[] user) {
        int s = 0, b = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (com[i] == user[j]) {
                    if (i == j)
                        s++;
                    else
                        b++;
                }
            }
        }
        return new int[] { s, b };
    }

    private static void printResult(int input, int s, int b) {
        System.out.printf("Input : %d, Result : %dS-%dB\n", input, s, b);
    }
}