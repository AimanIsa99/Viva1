/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva1;

import java.util.Scanner;

/**
 *
 * @author Study
 */
public class Viva6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1,x2,x3,y1,y2,y3;
        double  a1,a2,a3,a4;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter x1,y1 of rectangle: ");
        x1=a.nextInt();
        y1=a.nextInt();
        System.out.println("Enter x2,y2 of rectangle: ");
        x2=a.nextInt();
        y2=a.nextInt();
        System.out.println("Enter x3,y3 of Point X");
        x3=a.nextInt();
        y3=a.nextInt();
        //diagonal
        a1=Math.sqrt(Math.pow(x2,2)+Math.pow(y1,2));
        a2=Math.sqrt(Math.pow(x3,2)+Math.pow(y3,2));
        //compare
        if (a2>a1)
            System.out.println("point X is outside rectangle");
        else if (a1>=a2)
            System.out.println("point X is inside rectangle");
            
            
        
      
        
    }
    
}
