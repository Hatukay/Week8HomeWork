
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class linrSegmentGold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ab lide segment lenght:");
        double ab = scanner.nextDouble();
        double cb = 2 * ab/1 + Math.sqrt(5);
        double ac = cb - ab;
        System.out.println("AC lenght:" + ac + "CB lenght:" + cb);
    }
}
