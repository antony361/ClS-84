import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideA, sideB, sideC;
        char answer;
        do {
            System.out.println("Enter your 3 sides for your triangle separated by spaces: ");
            sideA = input.nextInt();
            sideB = input.nextInt();
            sideC = input.nextInt();
            if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB)
                System.out.println("Your triangle is possible");
            else
                System.out.println("Your triangle is impossible!!");
            System.out.println("Would you like to enter new numbers?");
            answer = input.next().charAt(0);
        }while(answer == 'y' || answer == 'Y');
    }
}
