
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class johnWalls {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a terms of number:");
        int N = scanner.nextInt();
        int c = 1;
         for (int k = 1; k <= N; k++) {
             int c1 = 4*k*k;
             c = c*c1/(c1-1);
  }
         System.out.println("PI number:" + 2*c);
     }
}