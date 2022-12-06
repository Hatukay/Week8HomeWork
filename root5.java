
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class root5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a division number:");
        int N = scanner.nextInt();
        int t = 1; 
        for (int i = 1; i < N;i++ ) {
            t = 4+1/t;
        }
        System.out.println(2+1/t);
    }
}