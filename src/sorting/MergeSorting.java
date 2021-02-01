package sorting;

public class MergeSorting {
    void merge(int arr[], int beg, int end) {
        int mid = (beg + end) / 2;
        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];


        int i = 0, j = 0,counter=0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
                counter = counter+mid-i;
                System.out.println("counter: "+counter);
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, end);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 1, 2 };
        MergeSorting ob = new MergeSorting();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}