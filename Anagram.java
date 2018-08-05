/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Shivam
 */
public class Anagram {
    public static void main(String args[])
    {
    StringBuilder s1=new  StringBuilder("maryirk");
    
    StringBuilder s2=new  StringBuilder("rarmyil");
    int count=0;
    for(int i=0;i<s1.length();i++)
    {
        for(int j=0;j<s2.length();j++)
        {
            
           if(s1.charAt(i)==s2.charAt(j)) 
           {
               s1.setCharAt(i,'\0');
               s2.setCharAt(j,'\0');
               count++;
               break;
           }
            }
        }
    
    if(count==s1.length())
        
            System.out.println("anagram");
    else
       System.out.println("not");
    }
    
}
