
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class sqrt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a divisor number:");
        int n = scanner.nextInt();
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t = 2+1/t;
            
        }
        System.out.println("Square root two value:" + (1+1/t));
    }
}
