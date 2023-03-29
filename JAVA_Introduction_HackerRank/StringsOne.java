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

    public static void startEnd(){
        /*
         * Sample Input
         * 
         * Helloworld
         * 3 7
         * 
         * Sample Output
         * 
         * lowo
         */
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start,end));
    }
    // solution
    public void stringFormatting(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
             System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }
}





 

