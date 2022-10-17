# we know about Static Block and Exceptions
```java
      static block: know about the static block 
                    flow and how to intilization and declaration
                    when will excute static block
     
     Exception : how use throws and throw keyWords in java
                 decleare userDefined Exeception and use
                 try and catch block's
                 flow of the try catch and finally block....
```

# Today Question is 
```java
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive

```
# my Answer is wrong but its pass all the test cases in HackerRank website

```java
import java.io.*;
import java.util.*;

public class Solution {
    
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


```