package Day3StaticBlockAndExceptions;


import java.util.*;



public class Solution {
    /*
     * follow the rules and regulations
     * static variables declare in global area
     * and initlization inside the static block
     * 
     */
    static{
       Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int B = scanner.nextInt();
        try{
            parallelogram(H,B);
        }
        catch(Exception e)
        {
            
        }
        scanner.close();
    }
    
    public static void parallelogram (int H, int B)throws Exception{
        if(H<=0 || B<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        // throw new Exception("Breadth and height must be positive");  
        else System.out.println(H*B);
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

