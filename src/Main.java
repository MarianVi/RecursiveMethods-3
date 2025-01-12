import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO
        int numar1 = scanner.nextInt();
        int numar2 = scanner.nextInt();
        System.out.println(multiplyWithSumR(numar1, numar2));
    }

    public static int multiplyWithSumR(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b > 0) {
            return a + multiplyWithSumR(a, b - 1);
        }

        return -a + multiplyWithSumR(a, b + 1);
    }
}