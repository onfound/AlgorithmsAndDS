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
    private List<Integer> list2;
    private List<Integer> listForTrueRemove;
    private List<Integer> listForFalseRemove;
    private BinaryTree<Integer> binaryTree;
    private BinaryTree<Integer> binaryTree2;
    private BinaryTree<Integer> binaryTreeExpected2;
    private BinaryTree<Integer> binaryTree3;
    private BinaryTree<Integer> binaryTree4;
    private BinaryTree<Integer> binaryTree5;
    private BinaryTree<Integer> binaryTreeExpected3;
    private BinaryTree<Integer> binaryTreeExpected4;
    private BinaryTree<Integer> binaryTreeExpected5;
    private BinaryTree<Integer> emptyTree;

    BinaryTreeTest() {
        list = Arrays.asList(250, 90, 1, 62, 85, 73, 329, 252, 101, 100, 200);
        list1 = Arrays.asList(500, 12, 23, 321, 414, 4124, 214241, 100);
        list2 = Arrays.asList(13, 98, 30, 86, 27, 62, 9, 52, 99, 86, 78, 51, 5, 85, 54, 60, 69, 23, 35, 68);
        listForTrueRemove = Arrays.asList(15000, 0, 12412, 22, 100, 4);
        listForFalseRemove = Arrays.asList(15001, 11, 22, 12412);

        binaryTree = new BinaryTree<>();
        emptyTree = new BinaryTree<>();
        binaryTree2 = new BinaryTree<>();
        binaryTreeExpected2 = new BinaryTree<>();
        binaryTree3 = new BinaryTree<>();
        binaryTree4 = new BinaryTree<>();
        binaryTree5 = new BinaryTree<>();
        binaryTreeExpected3 = new BinaryTree<>();
        binaryTreeExpected4 = new BinaryTree<>();
        binaryTreeExpected5 = new BinaryTree<>();

        binaryTree.addAll(list);
    }


    @Test
    void remove() {
        for (Integer a : list) binaryTree.remove(a);
        assertEquals(binaryTree, emptyTree);

        for (Integer b : list1) binaryTree.remove(b); // remove from empty binaryTree
        assertEquals(binaryTree, emptyTree);

        binaryTree.addAll(Arrays.asList(100, 244, 12412, 1, 22, 2, 4, 124, 521, 0, 15000));
        for (Integer c : listForTrueRemove) assertTrue(binaryTree.remove(c));
        for (Integer d : listForFalseRemove) assertFalse(binaryTree.remove(d));

        BinaryTree<Integer> binaryTreeExpected = new BinaryTree<>();
        binaryTreeExpected.addAll(Arrays.asList(244, 1, 2, 124, 521));
        assertEquals(binaryTreeExpected, binaryTree);

        binaryTreeExpected2.addAll(Arrays.asList(13, 30, 86, 27, 62, 9, 52, 99, 86, 78, 51, 5, 85, 54, 60, 69, 23, 35, 68));
        binaryTree2.addAll(list2);
        binaryTree2.remove(98);
        assertEquals(binaryTreeExpected2, binaryTree2);

        binaryTree3.addAll(Arrays.asList(100, 80, 75, 62, 90, 95, 96));
        binaryTree4.addAll(Arrays.asList(100, 80, 75, 62, 90, 95, 96, 89, 88, 87, 86));
        binaryTree5.addAll(Arrays.asList(80, 75, 62, 90, 95, 96, 89, 88, 87, 82, 85, 84, 83));
        binaryTreeExpected3.addAll(Arrays.asList(100, 75, 62, 90, 95, 96));
        binaryTreeExpected4.addAll(Arrays.asList(100, 75, 62, 90, 95, 96, 89, 88, 87, 86));
        binaryTreeExpected5.addAll(Arrays.asList(75, 62, 90, 95, 96, 89, 88, 87, 82, 85, 84, 83));
        assertTrue(binaryTree3.remove(80));
        assertTrue(binaryTree4.remove(80));
        assertTrue(binaryTree5.remove(80));
        assertEquals(binaryTreeExpected3, binaryTree3);
        assertEquals(binaryTreeExpected4, binaryTree4);
        assertEquals(binaryTreeExpected5, binaryTree5);

    }


}