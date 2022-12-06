
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class fermat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter terms of number:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n-1; i++) {
            System.out.println(Math.pow(2, Math.pow(2, i)+1));
        }
        }
}
