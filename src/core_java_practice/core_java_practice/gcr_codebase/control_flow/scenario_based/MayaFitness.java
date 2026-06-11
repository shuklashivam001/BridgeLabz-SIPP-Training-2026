package core_java_practice.core_java_practice.gcr_codebase.control_flow.scenario_based;

import java.net.StandardSocketOptions;
import java.util.*;

public class MayaFitness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Taking User height and weight
        System.out.print("Enter your height : ");
        double height = scan.nextDouble();
        System.out.print("Enter your weight : ");
        double weight = scan.nextDouble();

        //Calculating BMI
        double bmi = weight / (height * height);

        //Checking category
        if(bmi < 18.5) System.out.println("Underweight");
        else if(bmi >= 18.5 && bmi < 25) System.out.println("Normal");
        else System.out.println("Overweight");
    }
}
