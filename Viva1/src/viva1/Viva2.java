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
public class Viva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,a,b,d;
        String c,e,p = null;
        Random f =new Random();
        x=11;
        a=x/100;
        if (a==1){
            c="hundred and";}
        else if (a==2){
            c="two hundred and";}
        else if (a==3){
            c="three hundred and";}
        else if (a==4){
            c="four hundred and";}
        else if (a==5){
            c="five hundred and";}
        else if (a==6){
            c="six hundred and";}
        else if (a==7){
            c="seven hundred and";}
        else if (a==8){
            c="eigth hundred and";}
        else if (a==9){
            c="nine hundred and";}
        else
            c="";
        
        d=x%100;
        if (d>=90){
            e="Ninety-";}
        else if (d>=80){
            e="Eighty-";}
        else if (d>=70){
            e="Seventy-";}
        else if (d>=60){
            e="Sixty-";}
        else if (d>=50){
            e="Fifty-";}
        else if (d>=40){
            e="Forty-";}
        else if (d>=30){
            e="Thirty-";}
        else if (d>=20){
            e="Twenty-";}
        else if (d==10){
            e="ten";}
        else if (d==11){
            e="eleven";}
        else if (d==12){
            e="twelve";}
        else if (d==13){
            e="thirteen";}
        else if (d==14){
            e="fourteen";}
        else if (d==15){
            e="fifteen";}
        else if (d==16){
            e="sixteen";}
        else if (d==17){
            e="seventeen";}
        else if (d==18){
            e="eighteen";}
        else if (d==19){
            e="nineteen";}
        else{
            e="";}
        {
        b=x%10;
        if (x%100>10 && x%100<20){
            p="";}
        else
        if (b==1){
            p="one";}
        else if (b==2){
            p="two";}
        else if (b==3){
            p="three";}
        else if (b==4){
            p="four";}
        else if (b==5){
            p="five";}
        else if (b==6){
            p="six";}
        else if (b==7){
            p="seven";}
        else if (b==8){
            p="eight";}
        else if (b==9){
            p="nine";}
        else {
            p="";}
    }
        
     System.out.print (x+"is"+" "+c+" "+e+""+p);   }
}


