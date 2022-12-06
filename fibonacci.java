
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a fibonacci number:");
        int fb = scanner .nextInt();
        int x = (int) ((1+ Math.pow(5, 5))/2);
        int fb2 = (fb/x);
        int fb3 = (fb*x);
        System.out.println("Previous Fibonacci number: " + fb2 + " Next Fibonacci number: " + fb3);
    }
}
