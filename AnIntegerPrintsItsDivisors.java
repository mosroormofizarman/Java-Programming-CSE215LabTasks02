/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE215LabTasks02;

/**
 *
 * @author ArMan
 */
import java.util.Scanner;
public class AnIntegerPrintsItsDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.printf("Divisors of " + n + " are 1" );
        for (int i = 2; i<n; i++) {
            if (n % i == 0) {
                System.out.print(", " + i );
            }
        }
        System.out.printf(".");
    }   
}
