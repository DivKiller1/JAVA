
abstract class Solid {
    @SuppressWarnings("unused")
    abstract double calculateVolume();
}

class Cuboid extends Solid {

    private final double length;
    private final double width;
    private final double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    double calculateVolume() {                   //overridding hai
        return length * width * height;
    }
}

class Sphere extends Solid {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);        //overridind hai
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5, 3, 4); 
        Sphere sphere = new Sphere(6); 

        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }
}
