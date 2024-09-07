import java.util.*;
import java.util.ArrayList;

public class reverseArrayList{



 public static void main(String args[]){
      ArrayList<Integer>list = new ArrayList<>();
    
       list.add(1); //O(1)
       list.add(2); //O(1)
       list.add(3); //O(1)
       list.add(4); //O(1)
       list.add(5); //O(1)

      //reverse an arraylist
      for(int i=list.size()-1; i>=0; i--){
          System.out.println(list.get(i) + " ");
        }
      System.out.println();
    }
}


