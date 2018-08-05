
package javaapplication3;


public class pemutation {
    public static void main(String args[])
    {
        int count=1,cout=1,sum=1;
         StringBuilder s1=new  StringBuilder("xyxx");
        int l=s1.length();
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    s1.setCharAt(i,'\0');
                    count++;
                    
                }
            }
        }
        System.out.println(count);
        for(int i=1;i<=l;i++)
    {
        cout=cout*i;
    }
    if(count==0)
    {
   System.out.println(cout);
    }
    else
    {
        
    for(int i=1;i<=count;i++)
    {
        sum=sum*i;
    }
    
    System.out.println(cout/sum);
    }
    }
    
}
