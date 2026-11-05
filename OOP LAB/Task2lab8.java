/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2lab8;
/**
 *
 * @author HINA SAWAN 79049
 */
class Ride {
    double calculateFare(int km) {
        return km * 25.0; // Default rate
    }
}
class Bike extends Ride {
    @Override
    double calculateFare(int km) {
        return km * 20.0;
    }
}
class Car extends Ride {
    @Override
    double calculateFare(int km) {
        return km * 40.0;
    }
}
class Rickshaw extends Ride {
    @Override
    double calculateFare(int km) {
        return km * 30.0;
    }
}
public class Task2lab8 {
    public static void main(String[] args) {
        Ride[] rides = { new Bike(), new Car(), new Rickshaw() };
        int distance = 10;

        for (Ride r : rides) {
            System.out.println("Fare for " + distance + " km: Rs. " + r.calculateFare(distance));
        }
    }
}
