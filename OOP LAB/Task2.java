/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

/**
 *
 * @author HINA SAWAN 79049
 */
class Engine {
    public void start() {
        System.out.println("Engine started smoothly. Vroom vroom!");
    }
}
class Car {
    private String model;
    private Engine engine; 
    public Car(String model) {
        this.model = model;
        this.engine = new Engine(); // Engine created inside Car constructor
        System.out.println(model + " manufactured with its engine.");
    }
    public void drive() {
        System.out.println(model + " is ready to move.");
        engine.start();
    }
}
public class Task2 {
    public static void main(String[] args) {
        Car myCar = new Car("Honda Civic");
        myCar.drive();
    }
}
