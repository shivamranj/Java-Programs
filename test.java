/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


class Author
{
private
String name,email;
char gender;
public
Author(String name1,String email1,char g)
{
name=name1;
email=email1;
gender=g;

}
String getName()
{
return name;
}
String getEmail()
{
return email;
}
void setEmail(String em)
{
email=em;
}
char getGender()
{
return gender;
}
public String toString()
{
String s;
s=name+email+gender;
return s;
}
}

class Book
{
private
String name;
Author author;
double price;
int qty=0;

Book(String na,Author auth,double pri)
{
    super();
name=na;
author=auth;
price=pri;
}
Book(String na,Author auth,double pri,int q)
{
name=na;
author=auth;
price=pri;
qty=q;
}
String getName()
{
return name;
}
Author getAuthor()
{
return author;
}
double getPrice()
{
return price;
}
void setPrice(double pr)
{
price=pr;
}
int getQty()
{
return qty;
}
int setQty(int qi)
{
qty=qi;
return qi;
}
/*
String toString()
{
String si;
si=name+author.name+author.email+author.gender+qty;
return si;
}
*/
}

class Test
{
public static void main(String args[])
{
Author a=new Author("shivam","shivamranjan",'m');
String n=a.getName();
System.out.println(n);
String em=a.getEmail();
System.out.println(em);
a.setEmail("ghvgyv");
char c=a.getGender();
System.out.println(c);

Book b=new Book("captain america",a,35.00);
Book b2=new Book("captain america",a,35.00,2);
String n1=b.getName();
System.out.println(n1);
Author bi=b.getAuthor();
System.out.println(bi);
b.setPrice(65);
int bii=b.getQty();
System.out.println(bii);
String si1=b.toString();
System.out.println(si1);


}
}

