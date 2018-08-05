/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
class random
{
public static void main(String args[])
{
Random r=new Random();
int q=r.nextInt(26)+1;
char ch;
q=q+64;
ch=(char)q;
System.out.println(ch);
if(ch=='A' || ch=='B' || ch=='C')
System.out.println("2");

if(ch=='D' || ch=='E' || ch=='F')

System.out.println("3");

if(ch=='G' || ch=='H' || ch=='I')

System.out.println("6");

if(ch=='J' ||ch== 'K' || ch=='L')

System.out.println("7");

if(ch=='M' || ch=='N' || ch=='O')

System.out.println("8");
}
}
