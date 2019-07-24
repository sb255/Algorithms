/*Finding the nth term in a fibonaci series using Recursion!*/

public class FibonacciRecursion{
    
    public static int Fibonacci(int n){
        
        if(n==0)
            return 0; 
        
        if(n==1)
            return 1;
        
        
        return Fibonacci(n-1) + Fibonacci(n-2); 
            
    }
        
    public static void main(String[] args){
            
        System.out.println(Fibonacci(7));
            
    }
        
}
