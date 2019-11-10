//-- A BASIC RECURSIVE FUNCTION TO PRINT THE VALUES

public class BasicRecursion{

    public static void printValues(int n){
        
        if(n!=0){
            printValues(n-1);
            System.out.println("Function printValues executed completly with n = "+n);
        }
        
        else{
            //END OF THE RECURSION 
            System.out.println("END OF RECURSION");
        }
        
    }
    public static void main(String args[]){
        printValues(10);
    }
}

/*

Recursion stack of the function printValues will be:
f(f(f(f(f(f(f(f(f(f(f(0)))))))))))

*/
