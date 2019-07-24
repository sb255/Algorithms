/* 
 *  Find whether the Number is Prime or Not
 *  Time complexity!!
 */

import java.util.*;


public class BigO{
        
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);  
        
        int x = sc.nextInt();
        
        sc.close();
        
        int count = 0; 
        
        if(x==1)
            System.out.println("The Number is a Prime Number");
        
        int xx = (int) Math.sqrt(x);
        
        for(int i=2; i<xx; i++){
        
            if(x%1==0)
                count--; 
            
        }
        
        if(count==0)
            System.out.print("The Number is a Prime Number");
        
        else
            System.out.print("The Number is not a Prime Number");
        
    }
        
}


/* 
   Input size is: N
	 
   Iteration made: square root of N times

   Time complexity will be: O(sqrt(N))

*/
