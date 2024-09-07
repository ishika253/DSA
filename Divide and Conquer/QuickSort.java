import java.util.*;

public class QuickSort{

    public static void QuickSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        // identifying pivot element i.e last element
        int pidx = partition(arr,si,ei);
        QuickSort(arr,si,pidx-1); // left part
        QuickSort(arr,pidx+1,ei); // right part


    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swap pivot element with element at i+1
        i++;
        //swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return i;


    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
       int arr[] = {6,3,9,8,2,5};
       QuickSort(arr,0,arr.length-1);
       printArr(arr);
    }
}