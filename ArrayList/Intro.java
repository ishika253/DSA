import java.util.ArrayList;
import java.util.*;


public class Intro{

    public static void Intro(int n){

    } 

    public static void main(String args[]){
        // Java Collection Framework
        // ClassName objectName = new ClassName();
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        

        //operations
        // to add element
        list.add(1); //O(1)
        list.add(2); //O(1)
        list.add(3); //O(1)
        list.add(4); //O(1)
        list.add(5); //O(1)

        list.add(1,9); // inserted 9 at index 1 and will shift all elements to right so TC: O(n)
        System.out.println(list);

        // to get the element(GET operation)
        int element = list.get(2);
        System.out.println(element);

        // remove the element(delete operation)
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(2, 10);
        System.out.println(list);

        // contains element
        boolean b = list.contains(10);
        System.out.println(b);

        // size of ArrayList
        System.out.println(list.size());

        // print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();


        

        
    }
}