public class Kata {
 public static void main(String... feyi) {
        System.out.println("isEven(10): " + isEven(10));
        System.out.println("isPrimeNumber(7): " + isPrimeNumber(7));
        System.out.println("subtract(10, 7): " + subtract(10, 7));
        System.out.println("divide(10, 2): " + divide(10, 2));
        System.out.println("factorOf(10): " + factorOf(10));
        System.out.println("isSquare(25): " + isSquare(25));
        System.out.println("isPalindrome(54145): " + isPalindrome(54145));
        System.out.println("factorialOf(5): " + factorialOf(5));
        System.out.println("squareOf(5): " + squareOf(5));
    }


    // 1
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 2
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 3
    public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    // 4
    public static float divide(int a, int b) {
        if (b == 0) return 0;
        return (float) a / b;
    }

    // 5
    public static int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        return count;
    }

    // 6
    public static boolean isSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    // 7
  public static boolean isPalindrome(int number) {
   int original = number;
   int reversed = 0;
    
     while (number != 0) {
        int digit = number % 10;        
       reversed = reversed * 10 + digit;
        number = number / 10;            
    }

    return original == reversed;
 }
    // 8
    public static long factorialOf(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // 9
    public static long squareOf(int number) {
        return (long) number * number;
    }

   
    }

