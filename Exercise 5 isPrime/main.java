import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Please enter an integer to check how many prime numbers are in between 2 and the number: ");

        number = in.nextInt();

        System.out.println("The prime numbers from 2 to " + number + " are: ");

        for (int i = 2; i <= number; i++){
            boolean isPrime = isPrime(i);
            if (isPrime){
                System.out.printf(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        int remainder;
        remainder = number % 2;
        if (remainder == 0){
            return false;
        }

        return true;
    }
}