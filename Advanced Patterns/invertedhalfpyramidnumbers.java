import java.util.*;

public class invertedhalfpyramidnumbers {



    public static void inverted_half_pyramid_withnumbers(int n){
       //outer loop
       for(int i=1; i<=n; i++) {
           //inner loop
            for(int j=1; j<=n-i+1; j++) {
              System.out.print(j+" ");
            }
            System.out.println();
      
        }
    }

    public static void main(String args[]) {
        inverted_half_pyramid_withnumbers(5);
    }
}