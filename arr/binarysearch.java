import java.util.*;

public class binarysearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparisons 
            if(numbers[mid] == key) {  //found
                return mid;
            }
            if(numbers[mid] < key){  //right
                start = mid + 1;
            }
            else {
                end = mid - 1;      //left
            }
        }
        return -1;

    }
    public static void main(String args[]){
      int numbers[] = {2, 4, 6, 8, 10, 12, 14};
      int key = 12;
      int index = binarySearch(numbers, key); // Corrected the method call
      System.out.println("Index for key is: " + index); // Added this line to print the result
    }
      
}
