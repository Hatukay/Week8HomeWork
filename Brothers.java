
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class Brothers {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int n = scanner.nextInt();
        int t = 1;
        int fakt = 1;
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= k; i++) {
            fakt *= 2*i+1;
            }
            t += (2*k+2)/fakt;
        }
        System.out.println("E number is:" + t);
    }
}
