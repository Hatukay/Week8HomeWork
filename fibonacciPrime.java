
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class fibonacciPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of terms:");
        int n = scanner.nextInt();
        int f1 = 1;     
        int f2 = 1;
        int s2 = 0;
        int f3 = f1+f2;
         f1 = f2;
         f2 = f3;
        int s1 = 0;
        for (int i = 2; i <= f3-1; i++) {
            if (f3 % i == 0) {
                s1 += 1;      
            }
          else if (s1==0) {
                s2 += 1;
                System.out.println(f3);
            }
          else if (s2<n) {
                break;
            }
        }
    }
}
