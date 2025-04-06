package app;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Converter Project - Miles <-> Kilometers");

        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
