
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class randomNumber {
    public static void main(String[] args) {
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);
        //Maksimum deger
      int RD = random.nextInt(100);
        
        while (true) {            
        System.out.println("Please enter your guess:");
        int guess = scanner.nextInt();
      
            if (RD > guess) {
                System.out.println("Please enter a bigger number:");  
            }
            else if (RD < guess) {
                System.out.println("Please enter a smaller number:");
            }
            else{
                System.out.println("Your guess is correct");
                break;
        }
           
    }
}
}