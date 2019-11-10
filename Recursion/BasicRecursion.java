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

Output:

END OF RECURSION
Function printValues executed completly with n = 1
Function printValues executed completly with n = 2
Function printValues executed completly with n = 3
Function printValues executed completly with n = 4
Function printValues executed completly with n = 5
Function printValues executed completly with n = 6
Function printValues executed completly with n = 7
Function printValues executed completly with n = 8
Function printValues executed completly with n = 9
Function printValues executed completly with n = 10

*/
