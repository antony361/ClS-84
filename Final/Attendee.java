import javax.swing.*;
import java.util.Scanner;

public class Attendee {
    private String _FirstName;
    private String _LastName;
    private int _Age;
    private int _SeatNumber;
    private double _Price;

    public Attendee(String _FirstName, String _LastName, int _Age, int _SeatNumber, double _Price) {
        this._FirstName = _FirstName;
        this._LastName = _LastName;
        this._Age = _Age;
        this._SeatNumber = _SeatNumber;
        this._Price = _Price;
    }

    public static void Remove_Attendee(int _SeatNumber, Attendee[] arr) {
        int total = Global.checkTotal(arr);
        if (!(Check_Availability(_SeatNumber, arr, total))) {

            int number = 0, count = 0;
            while (number != _SeatNumber) {
                number = arr[count].get_SeatNumber();
                count++;
            }
            System.out.println("We are removing " + arr[count - 1].get_FirstName() + " " + arr[count - 1].get_LastName() + " from the list");
            arr[count - 1] = null;
            for (int c = count; c < total ; c++) {
                arr[c - 1] = arr[c];
            }
            arr[total - 1] = null;
        }
        else
            System.out.println("There is nobody currently sitting here");
    }

    public static void Update_Attendee(int seat, Attendee[] arr) {
        Scanner input = new Scanner(System.in);
        int total = Global.checkTotal(arr);
        int Orignal_Seat = seat;
        if(!(Check_Availability(seat, arr, total))) {
            String first, last;
            int age;
            double price;
            int number = 0, count = 0;
            while (number != seat) {
                number = arr[count].get_SeatNumber();
                count++;
            }
            System.out.println("Hello " + Orignal_Seat + "hello");
            System.out.println("Enter the updated first name: ");
            first = input.next();
            arr[count - 1].set_FirstName(first);
            System.out.println("Enter the updated last name: ");
            last = input.next();
            arr[count - 1].set_LastName(last);
            System.out.println("Enter the updated age: ");
            age = input.nextInt();
            arr[count - 1].set_Age(age);
            System.out.println("Enter the updated seat: ");
            seat = input.nextInt();
            if (Orignal_Seat == seat)
                ;
            else if (Check_Availability(seat, arr, total))
                arr[count - 1].set_SeatNumber(seat);
            else
                Update_Attendee(Orignal_Seat, arr);
            System.out.println("Enter the updated price: ");
            price = input.nextDouble();
            arr[count - 1].set_Price(price);

        }
        else
            System.out.println("There is nobody sitting here.");
    }

    public static void Calculate_Revenue(Attendee[] arr) {
        int total = Global.checkTotal(arr);
        double sum = 0;
        for (int c = 0; c < total;c++) {
            sum += arr[c].get_Price();
        }
        System.out.println("\nYour total revenue: " + sum);
    }

    public static boolean Check_Availability(int seat, Attendee[] arr, int total) {
        for (int i = 0; i < total; i++) {
            if (seat == arr[i].get_SeatNumber()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {

        return "\nAttendee Info:\n" +
                "First Name: " + _FirstName +
                "\nLast Name: " + _LastName +
                "\nAge: " + _Age +
                "\nSeat Number: " + _SeatNumber +
                "\nPrice: " + _Price;

    }

    public String get_FirstName() {
        return _FirstName;
    }

    public void set_FirstName(String _FirstName) {
        this._FirstName = _FirstName;
    }

    public String get_LastName() {
        return _LastName;
    }

    public void set_LastName(String _LastName) {
        this._LastName = _LastName;
    }

    public int get_Age() {
        return _Age;
    }

    public void set_Age(int _Age) {
        this._Age = _Age;
    }

    public int get_SeatNumber() {
        return _SeatNumber;
    }

    public void set_SeatNumber(int _SeatNumber) {
        this._SeatNumber = _SeatNumber;
    }

    public double get_Price() {
        return _Price;
    }

    public void set_Price(double _Price) {
        this._Price = _Price;
    }
}