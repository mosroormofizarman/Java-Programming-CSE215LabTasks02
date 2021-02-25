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
public class PrintsTheMultiplicationTableFrom1To5 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            int r = 1;
            while(r <= 10){
                System.out.println(i + "*" + r + "=" + (i*r));
                r++;
            }
            System.out.println("");
            i++;
        }
    }
}
