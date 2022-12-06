
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class heterometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of terms:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + (i+1) + (i*(i+1)));
        }
    }
}
