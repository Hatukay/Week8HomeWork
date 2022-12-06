
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class ln2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int N = scanner.nextInt();
        int t = 0;
        for (int k = 0; k <= N-1; k++) {
            t = t+1/((2*k+1)*(2*k+2));
        System.out.println("Ln(2) value:" + k);
        }
    }
}
