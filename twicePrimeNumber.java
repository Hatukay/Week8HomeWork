
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class twicePrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a upper limit:");
        int n = scanner.nextInt();
int s = 0;
        for (int i = 3; i <= n; i++) {
            int k = 0;
            for (int j = 2; j <= i-1; j++) {
                if (i%j==0) {
                    k +=1;
                }
                if (k==0) {
                  //  s+=1;
                    s=i;
                }
            }
        }
        for (int i = 1; i <= s-1; i++) {
            
        }
    }
}