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
public class Viva3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sales,commission = 0;
        Scanner volume=new Scanner (System.in);
        System.out.println("insert your sales volume: ");
        sales=volume.nextDouble();
        
        if (sales>1000)
            commission=(sales-1000)*0.125+(1000*0.1)+(500*0.075)+(100*0.05);
        else if (sales>500 && sales<=1000)
            commission=(sales-500)*0.1+(500*0.075)+(100*0.05);
        else if (sales>100 && sales<=500)
            commission=(sales-100)*0.075+(100*0.05);
        else if (sales<=100)
            commission=(sales*0.05);
        
        System.out.println("The commission is: "+ commission);
        
        
        
            
    }
    
}
