package sorting;

import java.io.IOException;
import java.util.Arrays;

public class CoutingSort {
    static int[] activityNotifications(int[] expenditure) {
        int last = 9;
        int[] count = new int[last];
        for (int i = 0; i < expenditure.length; i++) {
            count[expenditure[i]]++;

        }
        for (int j = 1; j < last; j++) {
            count[j] += count[j - 1];

        }
        int[] sortedArray = new int[expenditure.length];

        for (int k = expenditure.length - 1; k >= 0; k--) {
            sortedArray[--count[expenditure[k]]] = expenditure[k];
        }

        return sortedArray;


    }


    public static void main(String[] args) throws IOException {
        int[] result = CoutingSort.activityNotifications(new int[]{1, 2, 6, 4, 4});
        System.out.println(Arrays.stream(result).toArray());
        for (int i : result
        ) {
            System.out.println(i);

        }
    }
}
