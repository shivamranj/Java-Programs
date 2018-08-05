
package javaapplication3;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s=" Hello";
        String s1="HELLO world";
       System.out.println( s.concat(s+s1));
       System.out.println( s.charAt(2));
       System.out.println( s.toLowerCase());
       System.out.println( s.toUpperCase());
       System.out.println( s.lastIndexOf('l'));
       System.out.println( s.trim());
       System.out.println( s.compareTo(s1));
       System.out.println( s.equals(s1));
       System.out.println( s.length());
    }
    
}
