import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the values whose combination you want to find ");
        System.out.print(" n: ");
        int n = input.nextInt(), nFactorial = 1, rFactorial = 1, xFactorial = 1;
        System.out.print(" r: ");
        int r = input.nextInt();
        int x = n-r;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        for (int j = 1; j <= r; j++) {
            rFactorial *= j;
        }
        for (int z = 1; z <= x; z++) {
            xFactorial *= z;
        }
        int result = nFactorial / (rFactorial * xFactorial);
        System.out.print("C"+ "(" + n + "," + r + ")" + " = " + result);

    }
}