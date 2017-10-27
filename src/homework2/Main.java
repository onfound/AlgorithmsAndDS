package homework2;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.addAll(Arrays.asList(250,90,73,85,1,100,62,200,101,329,252));
        binaryTree.forEach(System.out::println);
    }
}
