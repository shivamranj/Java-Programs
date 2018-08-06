/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.*;
public class BufferReader {
    
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=Integer.parseInt(br.readLine());
String s=br.readLine();
char ch=(char)br.read();

System.out.println(i);
System.out.println(ch);
System.out.println(s);
}

    
}
