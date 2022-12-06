
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class leyland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = scanner.nextInt();
        System.out.println("Please enter a number:");
        int y = scanner.nextInt();
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                System.out.println(Math.pow(i, j)+Math.pow(j, i));
            }
        }
}
}