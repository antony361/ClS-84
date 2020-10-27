import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String model, make;
        int year = 0;
        double price;

        Scanner in = new Scanner(System.in);

        Car car = new Car(" ", " ", 0, 0.00);

        System.out.print("Enter the make, model, year and price of the car: \n");
        make = in.next();
        model = in.next();
        year = in.nextInt();
        price = in.nextDouble();

        car.set_Make(make);
        car.set_Model(model);
        car.set_Year(year);
        car.set_Price(price);

        System.out.println(car);
    }
}
