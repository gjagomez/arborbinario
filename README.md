# :clipboard: Documentación del Proyecto - Árbol de Sumas de Rutas

## :memo: Descripción del Proyecto
Este proyecto tiene como objetivo encontrar todas las rutas en un árbol binario desde la raíz hasta las hojas donde la suma de los valores de los nodos sea igual a un valor objetivo.

## :package: Clases del Proyecto

### :file_folder: Clase TreeNode
La clase `TreeNode` representa un nodo en el árbol binario. Tiene tres atributos:
- :bookmark_tabs: `val`: valor del nodo.
- :left_right_arrow: `left`: referencia al nodo izquierdo.
- :left_right_arrow: `right`: referencia al nodo derecho.

**Métodos:**
- :gear: `Constructor TreeNode(int val)`: inicializa el nodo con el valor dado.

### :building_construction: Clase TreeBuilder
La clase `TreeBuilder` se encarga de construir un árbol binario a partir de un arreglo de valores.

**Métodos:**
- :hammer_and_wrench: `buildTree(Integer[] values)`: crea el árbol binario usando el arreglo de valores. El método utiliza una cola para enlazar los nodos de forma secuencial, creando los nodos izquierdo y derecho según sea necesario.

### :mag: Clase PathSumFinder
La clase `PathSumFinder` tiene la responsabilidad de encontrar todas las rutas en el árbol donde la suma de los valores de los nodos sea igual al valor objetivo.

**Métodos:**
- :search: `findPaths(TreeNode root, int targetSum)`: recibe el nodo raíz y el valor objetivo. Devuelve una lista de listas con las rutas que cumplen con la condición.
- :recycle: `findPathsRecursive(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result)`: Método auxiliar que realiza la búsqueda recursiva de las rutas.

## :floppy_disk: Ejemplo de Uso
El arreglo de valores se convierte en un árbol binario y luego se buscan las rutas cuya suma sea igual a un valor objetivo.

**Código:**

```java
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
