package linkedList;

// Java program to merge k sorted arrays of size n each
public class MergeKSortedLists {

    /* Takes two lists sorted in increasing order, and merge
    their nodes together to make one big sorted list. Below
    function takes O(Log n) extra space for recursive calls,
    but it can be easily modified to work with same time and
    O(1) extra space */
    public static Node SortedMerge(Node a, Node b) {

        Node temp;
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.data >= b.data) {
            temp = b;

            temp.next = SortedMerge(a, b.next);

        } else {
            temp = a;
            temp.next = SortedMerge(a.next, b);

        }
        return temp;

    }

    // The main function that takes an array of lists
    // arr[0..last] and generates the sorted output
    public static Node mergeKLists(Node arr[], int last) {
      /*
      //other method
      if (last == 0) {
            return arr[0];
        }

        for (int i = 1; i <=last; i++) {
            arr[0] = SortedMerge(arr[0], arr[i]);
        }*/
        int lastIndex = last;
        while (lastIndex != 0) { //k
            int i = 0, j = lastIndex;
            while (i < j) { //logk

                arr[i] = SortedMerge(arr[i], arr[j]); //n
                i++;
                j--;

            }
            lastIndex = j;

        }
        return arr[0];


    }

    /* Function to print nodes in a given linked list */
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        int k = 3; // Number of linked lists
        int n = 4; // Number of elements in each list

        // an array of pointers storing the head nodes
        // of the linked lists
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        // Merge all lists
        Node head = mergeKLists(arr, k - 1);
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
// This code is contributed by Gaurav Tiwari
