package JAVA_Introduction_HackerRank;


import java.io.*;
import java.util.*;
public class StringsOne {
    
}


 class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        int alen = A.length();
        int blen = B.length();
        System.out.println(alen+blen);
      //  A.charAt(0).toUpperCase();
       // (alen<blen) ? (System.out.println("No")) : System.out.println("yes");
        if (alen<blen){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(A.compareTo(B)>0?"Yes":"No");

     //   System.out.println(A+" "+B);
     System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
  
}



