class Vehicle {
    protected String color;
    protected int wheels;

    public Vehicle(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    public Car(String color) {
        super(color, 4);
    }

    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String color) {
        super(color, 2);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is pedaling.");
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        // Abstraction
        Vehicle vehicle = new Vehicle("Red", 4);
        vehicle.move();

        // Inheritance
        Car car = new Car("Blue");
        car.move();

        Bicycle bicycle = new Bicycle("Green");
        bicycle.move();

        // Polymorphism
        Vehicle[] vehicles = {vehicle, car, bicycle};
        for (Vehicle v : vehicles) {
            v.move();
        }

        // Encapsulation
        Car myCar = new Car("Black");
        myCar.color = "White"; // Modifying the color through a public getter/setter
        System.out.println(myCar.getColor());
    }
}
