/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva1;

import java.util.Random;

/**
 *
 * @author Study
 */
public class Viva4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Round 1
        Random r = new Random();
        int num1,num2,num3,num4,num5,num6,player1,player2;
        num1=r.nextInt(6)+1;
        num2=r.nextInt(6)+1;
        System.out.println("Round 1");
        System.out.printf("Player1: %d  Player2 : %d\n",num1,num2);
        // Round 2
        num3=r.nextInt(6)+1;
        num4=r.nextInt(6)+1;
        System.out.println("Round 2");
        System.out.printf("Player1: %d  Player2: %d\n",num3,num4);
        // Extra Round
        num5=r.nextInt(6)+1;
        
        player1=num1+num3;
        player2=num2+num4;
        
        if (num1%2==0 && num3%2==0)
            player1+=5;
        else if (num2%2==0 && num4%2==0)
            player2+=5;
        else if (num1==6 && num3==6)
            player1-=5;
        else if (num2==6 && num4==6)
            player2-=5;
        else if (num1==3 && num3==3){
            player1+=num5;
        System.out.println("Extra Round");
        System.out.printf("Player1: %d",num5);}
        else if (num2==3 && num4==3){
            player2+=num5;
        System.out.println("Extra Round");
        System.out.printf("Player2: %d\n",num5);}
        
        if (player1>player2){
            System.out.println("Player1 win");}
            else if(player1<player2){
                System.out.println("Player2 win");}
            else if (player1==player2){
                System.out.println("Draw");}
                    
            
    }
    
}
