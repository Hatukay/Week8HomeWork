
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class negaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int n = scanner.nextInt();
        int f1 = 1;
        int f2 = -1;
        for (int i = 1; i <= n-2; i++) {
           int f3 = f2-f1;
            System.out.println(f3);
            f1=f2;
            f2=f3;
              
        }
    }
}
