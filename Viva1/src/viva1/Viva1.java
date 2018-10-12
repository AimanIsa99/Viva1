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
public class Viva1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner (System.in);
        int x,y,z;
        char operand1,operand2;
        double ans;
        ans=0;
        System.out.println("enter three integer number: ");
        x=a.nextInt();
        y=a.nextInt();
        z=a.nextInt();
        // operand system
        System.out.print("enter two operand: ");
        operand1=a.next().charAt(0);
        operand2=a.next().charAt(1);
        //operating system
        if (operand1 == '*')
        {
            if (operand2 == '*')
            {
                ans = x * y * z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '/')
            {
                ans = x * y / z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '%')
            {
                ans = x * y % z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '+')
            {
                ans = x * y + z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '-')
            {
                ans = x * y - z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            } 
        }
            if (operand1 == '/')
        {
            if (operand2 == '*')
            {
                ans = x / y * z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '/')
            {
                ans = x / y / z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '%')
            {
                ans = x / y % z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '+')
            {
                ans = x / y + z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '-')
            {
                ans = x / y - z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }             
        }
            if (operand1 == '%')
        {
            if (operand2 == '*')
            {
                ans = x % y * z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '/')
            {
                ans = x % y / z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '%')
            {
                ans = x % y % z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '+')
            {
                ans = x % y + z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '-')
            {
                ans = x % y - z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }             
        }
            if (operand1 == '+')
        {
            if (operand2 == '*')
            {
                ans = x + y * z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '/')
            {
                ans = x + y / z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '%')
            {
                ans = x + y % z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '+')
            {
                ans = x + y + z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '-')
            {
                ans = x - y - z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }             
        }
            if (operand1 == '-')
        {
            if (operand2 == '*')
            {
                ans = x - y * z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '/')
            {
                ans = x - y / z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '%')
            {
                ans = x - y % z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '+')
            {
                ans = x - y + z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }
            else if (operand2 == '-')
            {
                ans = x - y - z;
                System.out.printf("%d %c %d %c %d = %.2f\n", x, operand1, y, operand2, z, ans);
            }             
        }
            else
                System.out.println("error");
        }
    
}
