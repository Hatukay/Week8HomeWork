
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class eX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int N = scanner.nextInt();
        System.out.println("Please enter an number:");
        float x = scanner.nextFloat();
        float T = 1 , F = 1;
        for (int i = 1; i < N; i++) {
            F *= i;
            T+= Math.pow(x, i)/F;
            System.out.println("e to the power of x value:" + T);
            
        }
    }
}
