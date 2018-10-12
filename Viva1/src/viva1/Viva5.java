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
public class Viva5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d,e,f;
        double x,y;
        Scanner s=new Scanner(System.in);
        
        System.out.print("");
        String line1=s.nextLine();
        a=(int)line1.charAt(0);
        b=(int)line1.charAt(3);
        c=(int)line1.charAt(6);
        
        System.out.print("");
        String line2=s.nextLine();
        d=(int)line2.charAt(0);
        e=(int)line2.charAt(3);
        f=(int)line2.charAt(6);
        
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        if ((a*d-b*c)==0){
            System.out.println("This equation have no solution");}
            else 
            System.out.printf("x= %.2f \t y= %.2f  ",x,y);
    
}
}
