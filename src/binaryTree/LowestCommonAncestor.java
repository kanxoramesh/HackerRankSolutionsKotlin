package binaryTree;

import java.util.*;
import java.io.*;


class Check {


    public static Node lca(Node root, int v1, int v2) {

        return getLCA(root, v1, v2);

    }

    public static Node getLCA(Node root, int v1, int v2) {

        int min;
        int max;

        if (v1 > v2) {
            min = v2;
            max = v1;
        } else {
            min = v1;
            max = v2;
        }
        if (min < root.data && max < root.data)
            return getLCA(root.left, min, max);
        else if (min > root.data)
            return getLCA(root.right, min, max);
        else
            return root;


    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }
}