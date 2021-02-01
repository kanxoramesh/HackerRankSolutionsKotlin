package dynamic_programming;

public class MaxNonAdjacentArray {

    static int maxSubsetSum(int[] arr) {
       int inc=arr[0];
       int exc=0;

       for(int i=1;i<arr.length;i++){
           int temp = inc;
           inc=exc+arr[i];
           exc=Math.max(exc,temp);

       }
       return Math.max(exc,inc);


    }

}
