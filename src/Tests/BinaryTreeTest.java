package Tests;

import homework2.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTest {
    private TreeSet<Integer> treeSet;
    private BinaryTree<Integer> binaryTree;
    private int randomInt;

    BinaryTreeTest() {
        treeSet = new TreeSet<>();
        binaryTree = new BinaryTree<>();
        int size = new Random().nextInt(100);
        for (int i = 0; i < size; i++) {
            randomInt = new Random().nextInt(300);
            treeSet.add(randomInt);
            binaryTree.add(randomInt);
        }
    }

    @Test
    void tailSet() {
        int randomToElementInt = new Random().nextInt(randomInt);
        System.out.println(randomToElementInt);
        BinaryTree<Integer> newBinaryTreeTail = (BinaryTree<Integer>) binaryTree.headSet(randomToElementInt);
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.addAll(newBinaryTreeTail); // Hidden test for BinaryTreeIterator forEach
        assertEquals(treeSet.headSet(randomToElementInt), newTreeSet);
    }

}