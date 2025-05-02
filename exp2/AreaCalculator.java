class AreaCalculator {

    double area(double length, double width) {
        return length * width;
    }

    double area(double side) {
        return side * side;
    }

    double area(float radius) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Rectangle: " + calc.area(10, 5));
        System.out.println("Area of Square: " + calc.area(4));
        System.out.println("Area of Circle: " + calc.area(7f));
        System.out.println("Area of Triangle: " + calc.area(6, 8, true));
    }
}
