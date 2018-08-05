
package javaapplication3;


public class ReverseString {
    public static void main(String args[])
    {
        String s="This is java class";
        String s1="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                
              s1=s1+' ';
              count++;
            }
            else
            {
                if(count!=0)
                {
                    s1=s.charAt(i)+s1;
                    s1=s1+s.charAt(i);
                }
                else{
             s1=s.charAt(i)+s1;
             System.out.println(s1);
            }
        }
        
        
        System.out.println(s1);
    }
    
}
}