package Basicsunderjava;
import java.util.*;

class MultiArray {
    public static void main(String[] args)
    {
  
        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };
  
        // Sorting the array in descending order
        Arrays.sort(array,Collections.reverseOrder());
  
        // Printing the elements
        for(int arr: array)
        System.out.print(arr);
    }
}