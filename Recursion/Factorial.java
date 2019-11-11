//-- JAVA PROGRAM TO FIND THE VALUE OF A FACTORIAL USING RECURSION  

public class Factorial{
    
    public static int factorial(int a){
        
        //-- BASE CASE
        if(a==2)
            return 2; 
       
        else
            return a*factorial(a-1); 
        
    }

    public static void main(String[] args){
    
        System.out.println(factorial(6));
        
    }
    
}

