
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class mukemmelSayı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a upper limit:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            double a = Math.pow(2, i);
            double b = Math.pow(2, i+1);
            if (b%i!=0) {
                System.out.println(a*b); 
            }
        }
}
}