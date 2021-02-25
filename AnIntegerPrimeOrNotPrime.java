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
public class AnIntegerPrimeOrNotPrime {
    public static void main(String[] args){
        int flag=1;
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        
        if(in==0 || in==1){
            System.out.println(in + " is not a Prime Number.");
        }
        else{
            for(int i=2; i<=in/2; i++){
            if(in%i==0){
                flag=0;
                break;
            }
           }
            
            if(flag==1){
            System.out.println(in + " is a Prime Number.");
            }
            else{
            System.out.println(in + " is not a Prime Number.");
            } 
        }    
    }   
}
