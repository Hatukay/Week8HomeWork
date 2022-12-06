
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class squareTriangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int n = scanner.nextInt();
        int k0 = 0;
        int k1 = 1;
        
        for (int i = 1; i <= n-1;i++ ) {
           int k2 = 34*k1-k0+2;
            System.out.println(k2);
            k0=k1;
            k1=k2;
            
        }
    }
}
