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
public class OddOrEvenWithSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        switch(n%2){
        case 0:
        System.out.println("EVEN");
        break;
        default:
        System.out.println("ODD");
        }
     }
 }
