/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class fibonacciZeroToNinetynine {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int s = i+j;
                if (s==1 || s==2 || s==3 || s==5 || s==8 || s==13) {
                    break;//burası
                }
            }
        }
    }
}
