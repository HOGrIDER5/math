/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java .util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner (System.in);
        
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2};
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        for (int i = 0; i<=5; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=5; i= i + 1)
        {
            total = total + marks[i];
        }
        
        average = total/6;
        
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
