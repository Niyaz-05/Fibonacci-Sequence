import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        int[] dp = {0, 1};
        for (int i = 2; i <= n; i++) dp[i % 2] = dp[0] + dp[1];
        return dp[n % 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n to get nth Fibonacci number: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fib(n));
        scanner.close();
    }
}
