public class Prime {
    public static void main(String[] args) {
        int n = 9;
        int count = 2;
        int isPrime = 1;

        while (count < n) {
            if (n % count == 0) {
                isPrime = 0;
            }
            count = count + 1;
        }

        if (isPrime == 1) {
            System.out.println("prime"); // Print "prime" if no divisors were found
        } else {
            System.out.println("not prime"); // Print "not prime" if a divisor was found
        }
    }
}