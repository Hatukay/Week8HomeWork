
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class oreSayisi {
    public class triangularNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        int s = 0;
        int t = 0;
        for (int i = 1; i <=a; i++) {
            if (a%i==0) {
                s+=1;
                t=t+1/i;
            }
           // if (int ho;) {
                
            }
        }
    }
  }
