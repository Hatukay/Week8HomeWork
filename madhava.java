
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class madhava {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int n = scanner.nextInt();
        double t = 0;
         for (int k = 0; k <= n-1; k++) {
             t = t + Math.pow(-1, k)/((2*k+1)*Math.pow(3, k));
         }
         System.out.println("PI Value:" + Math.sqrt(12)*t);
}
}