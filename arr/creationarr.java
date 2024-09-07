import java.util.*;

public class creationarr {

    public static void main(String args[]){
        int marks[] = new int[100];

        Scanner sc= new Scanner(System.in);

        //int phy;
        //phy=sc.nextInt();

        //length of an array
        System.out.println("length of array = " +marks.length);

        marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt(); //maths
        marks[2] = sc.nextInt(); //chem

        System.out.println("phy :" + marks[0]);
        System.out.println("maths :" + marks[1]);
        System.out.println("chem :" + marks[2]);

        //update
        marks[2] = 100;  //marks[2] = marks[2] + 1;
        System.out.println("math :" +marks[2]);

        //percentage
        int percentage = (marks[0]+ marks[1]+ marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
    
}