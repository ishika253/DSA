import java.util.*;

public class butterflypattern{

    public static void butterflypattern(int n){
        // 1 st half
        // outer loop
        for(int i=1; i<n; i++){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces- 2 * (n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
        // 2 nd half 
        //outer loop
        for(int i=n; i>=1; i--){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces- 2 * (n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
    public static void main(String args[]){
        butterflypattern(4);
    }
}