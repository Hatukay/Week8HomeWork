
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class binom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a x value:");
        int x = scanner.nextInt();
        System.out.println("Please enter a n value:");
        int n = scanner.nextInt();
        double result = Math.pow((1 + x/n),n);
        System.out.println("Result: " + result);
                
    }
}
