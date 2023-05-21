package sk.stuba.fei.uim.oop;

public class Main {

    static void Checknumber(int num)
    {
        if (num > 10) {
            System.out.println("1");
        } else if (num == 10) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Number is divisible, hence not prime
            }
        }

        return true;  // Number is prime
    }

    public static void main(String[] args) {
        Checknumber(15);
        System.out.println(isPrime(11));
    }
}

