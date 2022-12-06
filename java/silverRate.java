
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class silverRate {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a line segment length:");
        double u = scanner.nextInt();
        double b = u/2+(Math.pow(2, 5));
        double a = 0;
        a =   (b-u);
         System.out.println("Silver rate:" + a + "," + b);
     }
}
