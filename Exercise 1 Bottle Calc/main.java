import java.util.*;

public class main 
{
	public static void main(String[] args) 
	{
		int numBottles, boxes, unpacked, boxLimit = 20;

		double boxCost = 2.99, totalCost;

		char answer;

		Scanner input = new Scanner(System.in);
		do
		{
			do
			{
				System.out.println("How many bottles do you need packed?");
				numBottles = input.nextInt();
				if ( numBottles < 0)
					System.out.println("Negative numbers not allowed. Please try again");
			}while(numBottles < 0);

			if (20 <= numBottles)
			{
				boxes = numBottles / 20;
				unpacked = (numBottles - (boxLimit * boxes));
				totalCost = boxes * boxCost;
				System.out.printf("Total Boxes: %d \n", boxes);
				System.out.printf("Unpacked Bottles: %d \n", unpacked);
				System.out.printf("Your total: %.2f \n", totalCost);
			}
			else if (0 == numBottles)
				System.out.println("You... You don't have any bottles...");
			else
			{
				System.out.println("You will not need any boxes");
				System.out.printf("There's only %d just carry them...\n", numBottles);
			}
			System.out.println("Would you like to calculate another amount?");
			answer = input.next().charAt(0);
		}while (answer == 'y' || answer == 'Y');
	}
}