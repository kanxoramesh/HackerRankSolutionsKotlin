package binaryTree;

import java.sql.Struct;

public class IsBinary {
    boolean checkBST(Node root) {

        if (root != null) {
            if (root.right.data < root.data || root.left.data < root.data) {
                return false;
            }

            int parent = root.data;
            boolean min = checkLeftNode(root.left, parent);
            boolean max = checkRightNode(root.right, parent);

            return min && max;
        }
        return false;

    }


    boolean checkLeftNode(Node root, int parentData) {
        if (root == null)
            return true;

        if (root.right == null || root.left == null)
            return (root.data < parentData);

        return checkRightNode(root.right, root.data) && checkLeftNode(root.left, root.data);


    }

    boolean checkRightNode(Node root, int parentData) {
        if (root == null)
            return true;

        if (root.right == null || root.left == null)
            return (root.data > parentData);

        return checkRightNode(root.right, root.data) && checkLeftNode(root.left, root.data);


    }
}


