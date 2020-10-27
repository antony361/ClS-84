import javax.sound.midi.Soundbank;

public class Car {
    private String _Make;
    private String _Model;
    private int _Year;
    private double _Price;

    public Car(String make, String model, int year, double price) {
        _Make = make;
        _Model = model;
        _Year = year;
        _Price = price;
    }

    public String get_Make() {
        return _Make;
    }

    public String get_Model() {
        return _Model;
    }

    public int get_Year() {
        return _Year;
    }

    public double get_Price() {
        return _Price;
    }

    public void set_Make(String Make) {
        _Make = Make;
    }

    public void set_Model(String Model) {
        _Model = Model;
    }

    public void set_Year(int Year) {
        _Year = Year;
    }

    public void set_Price(double Price) {
        _Price = Price;
    }

    public String toString() {
        return _Make + " " + _Model + " " + Integer.toString(_Year) + " " + Double.toString(_Price);
    }
}
