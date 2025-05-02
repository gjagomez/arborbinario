package service;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Metodo para encontrar todas las rutas desde la raíz a una hoja
 * donde la suma de los valores sea igual al objetivo.
 */
public class PathSumFinder {

    /**
     * Encuentra todas las rutas que suman el valor objetivo.
     *
     * @param root      Nodo raíz del árbol.
     * @param targetSum Suma objetivo.
     * @return Lista de rutas que cumplen la condición.
     */
    public List<List<Integer>> findPaths(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPathsRecursive(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void findPathsRecursive(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) return;

        currentPath.add(node.val);

        // Es hoja
        if (node.left == null && node.right == null && remainingSum == node.val) {
            result.add(new ArrayList<>(currentPath));
        } else {
            findPathsRecursive(node.left, remainingSum - node.val, currentPath, result);
            findPathsRecursive(node.right, remainingSum - node.val, currentPath, result);
        }

        currentPath.remove(currentPath.size() - 1); // backtracking
    }
}