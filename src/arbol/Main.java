package arbol;

import model.TreeNode;
import service.PathSumFinder;
import util.TreeBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    	 Integer[] values = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
         int targetSum = 22;

         TreeBuilder builder = new TreeBuilder();
         TreeNode root = builder.buildTree(values);

         PathSumFinder finder = new PathSumFinder();
         List<List<Integer>> paths = finder.findPaths(root, targetSum);

         System.out.println("Rutas con suma igual a " + targetSum + ":");
         for (List<Integer> path : paths) {
             System.out.println(path);
         }
    }
}