
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class goldTrigon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a short side lenghts:");
        double x = scanner.nextDouble();
        double b = ((x*(1+Math.sqrt(5)))/2);
        System.out.println("Trigons side lengths of triangle:" + x + ", " + b + ", "  + b);
     
    }
}
