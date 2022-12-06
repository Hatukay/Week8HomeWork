
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class chenPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            i+=2;
            if (n%i==0) {
                System.out.println("This number isn't a Chen prime number.");
               
            }
        else  {
        System.out.println("This number is a Chen prime number.");
}
}
}
}