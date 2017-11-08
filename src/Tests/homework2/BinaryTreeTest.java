package Tests.homework2;

import java.util.*;

import homework2.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

class BinaryTreeTest {
    private List<Integer> list;
    private List<Integer> list1;
    private List<Integer> listForTrueRemove;
    private List<Integer> listForFalseRemove;
    private BinaryTree<Integer> binaryTree;
    private BinaryTree<Integer> emptyTree;

    BinaryTreeTest() {
        list = Arrays.asList(250, 90, 1, 62, 85, 73, 329, 252, 101, 100, 200);
        list1 = Arrays.asList(500, 12, 23, 321, 414, 4124, 214241, 100);
        listForTrueRemove = Arrays.asList(15000, 0, 12412, 22, 100, 4);
        listForFalseRemove = Arrays.asList(15001, 11, 22,12412);
        binaryTree = new BinaryTree<>();
        emptyTree = new BinaryTree<>();
        binaryTree.addAll(list);
    }


    @Test
    void remove() {
        for (Integer a : list) binaryTree.remove(a);
        assertEquals(binaryTree, emptyTree);
        for (Integer b: list1) binaryTree.remove(b); // remove from empty binaryTree
        assertEquals(binaryTree, emptyTree);
        binaryTree.addAll(Arrays.asList(100,244,12412, 1, 22, 2, 4,124,521, 0, 15000));
        for (Integer c : listForTrueRemove) assertTrue(binaryTree.remove(c));
        for (Integer d :listForFalseRemove) assertFalse(binaryTree.remove(d));
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>();
        binaryTree1.addAll(Arrays.asList(244, 1, 2,124,521));
        assertEquals(binaryTree1,binaryTree);
    }


}