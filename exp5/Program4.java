import java.util.Scanner;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Press Clutch to start");
        System.out.println("Press the push Start/Stop button");
        System.out.println("Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Press Brake to stop the car");
        System.out.println("Press Push Start/Stop button");
        System.out.println("Engine Stopped");
    }
}

public class Program4 {
    public static void main(String[] args) {
        String make, model;
        int year;

        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter Details of Car:- ");          

            System.out.print("Enter Company Name: ");
            make = inp.nextLine();

            System.out.print("Enter Model: ");
            model = inp.nextLine();

            System.out.print("Enter Year: ");
            year = inp.nextInt();

            Car objCar = new Car(make, model, year);
            objCar.serviceInfo();
            objCar.startEngine();
            objCar.stopEngine();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the correct details.");
        } finally {
            inp.close();  
        }
    }
}
