/*
 *Paul Knuckey
 *Project: BMI Calculator
 *Date : 6/21/2021
 */
package bmi;
import java.util.Scanner;


/**
 *
 * @author Paul Knuckey
 */
public class BMI {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set up bmi and acanner for input
    double bmi_cal;
    Scanner scan = new Scanner(System.in);
    
        //print program name and collect height and weight
        System.out.println("BMI Calculator");
        System.out.print("Enter Height in Inches: ");
        double height = scan.nextInt();
        System.out.print("Enter Weight in Pounds: ");
        double weight = scan.nextInt();
        
        //perform BMI calcuations and round number to 2 decemil places
        bmi_cal = (weight * 703) / Math.pow(height, 2);    
        double bmi_round = Math.round(bmi_cal*100.0)/100.0;
        
       
        //output BMI
        System.out.println("Your BMI is : " + bmi_round);
        
        //Determain wich claification the user would fall into
        if (bmi_round < 18.5){
            System.out.println("Your Claification is Underweight.");
        }
            if (bmi_round <= 24.9)
                {
                    System.out.println("Your Clasifiication is Healthy range.");
                        
                }
            else {
                System.out.println("Your Clasification is Overweight.");
            }
    }
}

    

