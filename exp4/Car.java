class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 2023);
        Car car2 = new Car("Ford", "Mustang", 2022);
        Car car3 = new Car("BMW", "X5", 2024);
        Car car4 = new Car("Audi", "A4", 2025);
        Car car5 = new Car("Toyota", "Corolla", 2021);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
        car5.displayDetails();
    }
}
