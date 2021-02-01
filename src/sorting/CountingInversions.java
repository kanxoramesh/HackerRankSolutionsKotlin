package sorting;

import java.util.Arrays;

public class CountingInversions {

    static long countInversions(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        return mergeSort(arr, begin, end);


        //  System.out.println(counter);

       /* System.out.println("Array items: ");

        for (int item : array
        ) {
            System.out.print(item);


        }*/
    }


    public static long mergeSort(int[] array, int begin, int end) {
        long count = 0;
        if (begin >= end) {
            return 0;
        }
        int middle = (begin + end) / 2;
        count += mergeSort(array, begin, middle);
        count += mergeSort(array, middle + 1, end);
        count += mergeChild(array, begin, end);
        return count;
    }

    public static long mergeChild(int[] array, int begin, int end) {

        int middle = (begin + end) / 2;

        int leftStart = begin;
        int leftEnd = middle;
        int rightStart = middle + 1;
        int rightEnd = end;
        int tempPos = 0;
        long counter = 0;
        int temp[] = new int[end - begin + 1];

        while (leftStart <= leftEnd && rightStart <= rightEnd) {
            if (array[leftStart] <= array[rightStart]) {
                temp[tempPos] = array[leftStart];
                leftStart++;

            } else {
                temp[tempPos] = array[rightStart];
                rightStart++;
                counter = counter + middle + 1 - leftStart;

            }
            tempPos++;

        }


        if (leftStart > leftEnd) {
            while (rightStart <= rightEnd) {
                temp[tempPos] = array[rightStart];
                tempPos++;
                rightStart++;

            }
        } else
            while (leftStart <= leftEnd) {

                temp[tempPos] = array[leftStart];
                tempPos++;
                leftStart++;

            }

        int p = 0;
        int arp = begin;
        while (p < temp.length) {
            array[arp] = temp[p];
            arp++;
            p++;
        }

        return counter;


    }

    public static void main(String[] args) {

        CountingInversions.countInversions(new int[]{2, 4, 1});
    }
}
