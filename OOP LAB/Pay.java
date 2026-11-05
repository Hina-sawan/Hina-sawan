/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pay;

/**
 *
 * @author HINA SAWAN 79049
 */

interface PaymentGateway {
    void makePayment(double amount);
}
class CreditCardPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing $" + amount + " payment via Credit Card.");
    }
}
class PayPalPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing $" + amount + " payment via PayPal.");
    }
}
class UPIPayment implements PaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing $" + amount + " payment via UPI.");
    }
}
public class Pay {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        PaymentGateway p2 = new PayPalPayment();
        PaymentGateway p3 = new UPIPayment();
        p1.makePayment(150.00);
        p2.makePayment(75.50);
        p3.makePayment(200.00);
    }
}