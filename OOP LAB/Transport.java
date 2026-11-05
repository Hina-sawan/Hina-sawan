/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transport;

/**
 *
 * @author HINA SAWAN 79049
 */
abstract class TransportVehicle {
    abstract void move();
    void fuelType() {
        System.out.println("Uses fuel or electricity.");
    }
}
class Train extends TransportVehicle {
    @Override
    void move() {
        System.out.println("Train runs on tracks.");
    }
}
class Airplane extends TransportVehicle {
    @Override
    void move() {
        System.out.println("Airplane flies in the sky.");
    }
}
public class Transport {
    public static void main(String[] args) {
        TransportVehicle t1 = new Train();
        TransportVehicle t2 = new Airplane();
        t1.fuelType();
        t1.move();
        t2.fuelType();
        t2.move();
    }
}