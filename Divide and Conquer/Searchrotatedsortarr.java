import java.util.*;

public class Searchrotatedsortarr{

    public static int Searchrotatedsortarr(int arr[], int tar, int si, int ei){
       if(si>ei){
        return -1;    // base case
    
       }
       // calculating mid
       int mid = si + (ei - si) / 2;

       // case found
       if(arr[mid] == tar){
           return mid;
        }

        // mid on L1
        if(arr[si]<=arr[mid]){
            // case a : left of mid
            if(arr[si] <= tar && tar <= arr[mid]){
                return Searchrotatedsortarr(arr, tar, si, mid-1);
            }
            else{ 
              // case b : right of mid
                return Searchrotatedsortarr(arr, tar, mid+1, ei);
            }
        }


        //mid on L2
        else{
          // case c : right of mid 
          if(arr[mid] <= tar && tar <= arr[ei]){
              return Searchrotatedsortarr(arr, tar, mid+1, ei);

            }
            else{
                // case d: left of mid
                return Searchrotatedsortarr(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // output -> 4
        int taridx = Searchrotatedsortarr(arr,target,0,arr.length-1);
        System.out.println(taridx);
    }
}