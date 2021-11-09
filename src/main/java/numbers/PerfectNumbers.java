package numbers;

public class PerfectNumbers {

    boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        for ( int i = 1; i < ((number / 2) + 1); i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
}