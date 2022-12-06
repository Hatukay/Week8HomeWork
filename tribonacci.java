
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter terms of number:");
        int n = scanner.nextInt();
        int t1 =1;
        int t2 =1;
        int t3 =2;
        System.out.println("T1: " + t1 + "T2: " + t2 + "T3: " + t3);
        for (int i = 1; i <= n-3; i++) {
            int t4 = t1+t2+t3;
            System.out.println("T4:" + t4);
            t1=t2;
            t2=t3;
            t3=t4;
        }
}
}