/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

import java.util.Scanner;

/**
 *
 * @author jword
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cast the 5 as a double
        //double test = (double) 5 / 9 * 40;
        //System.out.println(test);
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello! What calculator would you like to use?");
        System.out.println("\t1. Gas Mileage\n\t2. Temperature Converter\n\t3. Quadratic Formula\n\t4. Tip Calculator\n\t5. Wage Calculator");
        String option = kb.nextLine();
        if (option.equals("1")) {
            System.out.println("Please enter number of gallons used:");
            int gallons = kb.nextInt();
            System.out.println("Please enter number of miles traveled:");
            int miles = kb.nextInt();
            double answer = calculateGasMileage(gallons, miles); 
            System.out.println(answer);
        }
        else if (option.equals("2")) {
            System.out.println("Please enter temperature");
            int temp = kb.nextInt();
            System.out.println("Is the temperature in Celsius?");
            boolean isCelsius = kb.nextBoolean();
            double answer = convertTemperature(temp, isCelsius);
            System.out.println(answer);
        }
    }
    //Methods
    public static double calculateGasMileage(int gallons, int miles) {
        double gasMileage = (double) miles / gallons;
        return gasMileage;
    }
    
    public static double convertTemperature(int temp, boolean isCelsius) {
        double newTemp; //declared not initialized
        if (isCelsius) {
            newTemp = (double) 9 / 5 * temp + 32;
        }
        else {
            newTemp = (double) (temp - 32) * 5 / 9;
        }
        return newTemp;
    }
}
