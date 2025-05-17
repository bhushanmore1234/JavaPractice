package JavaPractice.Collection;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        /*
        Notes :
        1.Arrays.binarySearch : This will work in array which is in sorted form
        2.Arrays.binarySearch : This will sort array
        */

        int[] a = {1,2,3,4,5};
        int index = Arrays.binarySearch(a,4);
        System.out.println("The index for element 4 is : "+index);

        Integer[] num = {2,4,5,1,6,7,3};
        for(int i :num)
        {
            System.out.print(i+" ");
        }
        Arrays.sort(num);
        System.out.println(" ");
        System.out.println("Sorted new array : ");
        for(int i :num)
        {
            System.out.print(i+" ");
        }
    }
}
