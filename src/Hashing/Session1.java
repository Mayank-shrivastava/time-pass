package Hashing;

import java.util.*;

// 1, 100

public class Session1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt(), secondNumber = scn.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i != 2 && i % 2 == 0)
                continue;
            if (isPrime(i) && isSumOfDigitIsPrime(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
        scn.close();
    }

    public static boolean isSumOfDigitIsPrime(int n) {
        int copyOfN = n;
        int sum = 0;
        while (copyOfN != 0) {
            sum = sum + (copyOfN % 10);
            copyOfN /= 10;
        }
        return isPrime(sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

// 1, 10
//