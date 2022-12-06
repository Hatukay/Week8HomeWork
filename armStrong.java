/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hatukay
 */
public class armStrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; ) {
            for (int j = 0; j <= 9; ) {
                for (int k = 0; k <= 9; ) {
                   double s= 100*i+10*j+k;
                    if (s==Math.pow(i, 3)+Math.pow(k, 3)) {
                        System.out.println(s);
                    }
                    break;
                }
            }
        }
    }
}
