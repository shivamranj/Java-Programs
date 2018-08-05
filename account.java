/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
public class account {
    int bal=500;
    void credit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount to be credited");
        int a=s.nextInt();
    
            bal=bal+a;
        
    }
    void debit()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn");
        int a=s.nextInt();
    if(bal-a<500){
        System.out.println("transaction failed");    
        
    }
    else
    {
        bal=bal-a;
         System.out.println("transaction sucees"); 
    }
    }
    void display()
    {
        System.out.println(bal); 
    }
    public static void main(String args[]  
    )
    {
        account a=new account();
        a.credit();
        a.debit();
        a.display();
        
    }
    
}
