import java.util.*;
import java.io.*;

/*
 * this is just copy past from hackerRank 
 * which question im solved that question taken backup and just pasting here 
 * and track my learning while go to the dataStructer and algo's
 */


class Solution{
    public static void main(String []argh)
    {


     
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                // byte
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                
                // short 2bytes 16Bit rate
                if(x>=-32768  && x<=32767)System.out.println("* short");
                // int 4Bytes   32Bit rate
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                // long
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}



