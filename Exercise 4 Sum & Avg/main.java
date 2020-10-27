import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer, count;

        do {
            do {
                System.out.println("Please choose an option:");
                System.out.println("1) Calculate with fixed amount of numbers");
                System.out.println("2) Calculate with varying amount of numbers");
                System.out.println("3) Exit");
                answer = input.nextInt();
            }while(answer <= 0 || answer > 3);
            if(answer == 1) {
                int number_total;
                double total = 0.0;
                System.out.println("How many numbers would you like to enter?");
                number_total = input.nextInt();
                System.out.println("Please enter your number (if more than one separate by space):");
                for(count = 0; count < number_total; count++)
                    total += input.nextDouble();
                System.out.printf("The average of your " + number_total + " numbers is: %.2f\n ", total / number_total);
            }

            else if(answer == 2) {
                int number_total = 0;
                double total = 0.0;
                int number_input;
                System.out.println("Enter all the numbers you'd like to find the average (if more than one separate by spaces): ");
                do {
                    number_input = input.nextInt();
                    total += number_input;
                    number_total++;
                }while(number_input != -99);
                number_total--;
                total += 99;
                System.out.printf("The average of your " + number_total + " numbers is: %.2f\n ", total / number_total);
            }
            else {
                break;
            }

        }while(true);

    }
}
