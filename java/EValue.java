
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class EValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        double total = 0;
        for (int k = 0; k <= n; k++) {
           int temp = 2*k+1;
           double  fakt = 1; 
            for (int j = 1; j < temp; j++) {
                
              fakt *= j;
            }
               total += (double)(temp)/fakt;
        }
        System.out.println(total);
    }
}
