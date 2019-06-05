# Basics about Arrays
Array declaration for all data types and list(list objects)


------------------------------------------------------------------------------------------------------------------------------

# Most Basic types of array declaration:

type var-name [10];

OR

type[10] var-name; 


(Generally second type of declaration is preffered)

------------------------------------------------------------------------------------------------------------------------------

# Initializing an array


int[] intArray = new int[10] 

OR

int[] intArray = {0,1,2,3,4,5,6,7,8,9}


------------------------------------------------------------------------------------------------------------------------------

# Most common methods to find the size or length of an array

arr.length -> for calculating the size of a data type array.

arr.length() -> for calculating the size of a String array. 

arr.size() -> for calculating the size of an object array(Ex. List array as it stores only objects)


------------------------------------------------------------------------------------------------------------------------------

# Searching Algorithms

## Linear search algorithm

```
    
    public static int  linearSearch(int[] arr, int searchElement){
    
        int array[] = arr;
        int sElement = searchElement; 
        
        for(int i=0; i<array.length; i++){
            if(array[i]==sElement)
                return i; 
        }
        
        
        return -1;
    }
    
```

---------------------------------------------------------------------------------------------
