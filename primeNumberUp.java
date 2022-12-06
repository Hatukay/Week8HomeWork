
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class primeNumberUp {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a upper limit:");
        int x = scanner.nextInt();
         for (int i = 2; i <= x; i++) {
             int s = 0;
             for (int j = 1; j <= i; j++) {
                 if (i%j==0) {
                     s += 1;
                 }
                 }
             if (s==2) {
                     System.out.print(i + ",");
             }
         }
     
     }
}
