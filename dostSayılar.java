
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class dostSayılar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        System.out.println("Please enter a number:");
        int b = scanner.nextInt();
        int ta = 0;
        int tb = 0;
        for (int i = 1; i <= a-1; i++) {
            if (a%i==0) {
                ta+=i;
            }
        }
        for (int i = 1; i <= b-1; i++) {
             if (a%i==0) {
                tb+=i;
            }
        }
        if (ta==b&&tb==a) {
            System.out.println("Dost sayılar");
        }
        else
            System.out.println("Dost sayılar degil");
}
}