import java.util.Random;

public class Main {
    
    // Method to find the first prime number between a and b
    public static int findPrimeNumberBetween(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 0;
    }
    
    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j * j <= number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method to get a random number between a and b (inclusive)
    public static int getNumberBetween(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(b - a + 1) + a;
    }
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sumOfPrimes = 0L;
        
        for (int i = 0; i < 1000000; i++) {
            int random1 = getNumberBetween(1000, 5000);
            int random2 = getNumberBetween(5001, 10000);
            sumOfPrimes += findPrimeNumberBetween(random1, random2);
        }
        
        long endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) / 1000.0;
        
        System.out.printf("Duration to now: %.2f seconds\n", duration);
        System.out.printf("Sum of primes: %d\n", sumOfPrimes);
    }
}
