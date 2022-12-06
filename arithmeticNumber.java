
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class arithmeticNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        int t = 0, s = 0;
        for (int i = 1; i <= a; i++) {
            if (a %i ==0) {
                t += i;
                s += 1;
            }
            if (t % s == 0) {
                System.out.println("This is an arithmetic number.");
            }
            else System.out.println("This is not an arithmetic number.");
            break;
        }
    }
}
