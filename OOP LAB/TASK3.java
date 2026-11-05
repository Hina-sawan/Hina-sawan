/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;

/**
 *
 * @author HINA SAWAN 79049
 */
class Fee {
    double calculate(double tuition) {
        return tuition;
    }
    double calculate(double tuition, double percent) {
        return tuition - (tuition * (percent / 100.0));
    }
}
class ScholarshipFee extends Fee {
    @Override
    double calculate(double tuition) {
        return tuition - (tuition * 0.20);
    }
}
public class TASK3 {
    public static void main(String[] args) {
        double baseTuition = 50000;
        Fee regularFee = new Fee();
        System.out.println("Regular Fee (No args): " + regularFee.calculate(baseTuition));
        System.out.println("Regular Fee (Custom 10% discount): " + regularFee.calculate(baseTuition, 10));
        Fee scholarshipFee = new ScholarshipFee();
        System.out.println("Scholarship Fee (Default 20% off): " + scholarshipFee.calculate(baseTuition));
        System.out.println("Scholarship Fee (Custom 30% off): " + scholarshipFee.calculate(baseTuition, 30));
    }
}
