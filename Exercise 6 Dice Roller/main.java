import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int number, roll1, roll2, roll3, roll4, roll5, roll6;

        roll1 = roll2 = roll3 = roll4 = roll5 = roll6 = 0;

        System.out.println("How many times would you like to roll the die? ");
        number = in.nextInt();

        for (int i = 0; i < number; i++){
            int randomNumber = generator.nextInt(6) + 1;
            switch (randomNumber)
            {
                case 1:{
                    roll1++;
                    break;
                }
                case 2:{
                    roll2++;
                    break;
                }
                case 3:{
                    roll3++;
                    break;
                }
                case 4:{
                    roll4++;
                    break;
                }
                case 5:{
                    roll5++;
                    break;
                }
                case 6:{
                    roll6++;
                    break;
                }
            }
        }
        System.out.println("Your roll statistics: ");
        System.out.println("1: " + roll1);
        System.out.println("2: " + roll2);
        System.out.println("3: " + roll3);
        System.out.println("4: " + roll4);
        System.out.println("5: " + roll5);
        System.out.println("6: " + roll6);

        // kinda ugly but what ever

    }
}