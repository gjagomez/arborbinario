package util;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {

    /**
     * @param values arreglo de valores (nullables).
     * @return nodo raíz del árbol.
     */
    public TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }
}
