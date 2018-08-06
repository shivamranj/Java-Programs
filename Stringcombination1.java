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
public class Stringcombination1 {
    
public static void main(String args[])
{
int count=0,cout=0;
char arr[]=new char[100];
char x[]="abkdefghcigkl".toCharArray();
for(int i=0;i<x.length;i++)
{
    if(x[i]=='0')
{
    
i++;
continue;
}
    else
    {
if(count==0)
{
cout++;
}
count++;

arr[count]=x[i];

for(int j=i+1;j<x.length;j++)
{
if(x[i]==x[j])
{
count++;
arr[count]=x[j];
x[j]='0';
}
}
}
}

for(int i=0;i<arr.length;i++)
{
    
System.out.print(arr[i]);
}


}

    
}
