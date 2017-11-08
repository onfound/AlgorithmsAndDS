package homework2;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.*;

@SuppressWarnings("WeakerAccess")

public class BinaryTree<T extends Comparable<T>> extends AbstractSet<T> implements SortedSet<T> {

    private static class Node<T> {
        final T value;

        Node<T> left = null;

        Node<T> right = null;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> root = null;

    private int size = 0;

    @Override
    public boolean add(T t) {
        Node<T> closest = find(t);
        int comparison = closest == null ? -1 : t.compareTo(closest.value);
        if (comparison == 0) {
            return false;
        }
        Node<T> newNode = new Node<>(t);
        if (closest == null) {
            root = newNode;
        } else if (comparison < 0) {
            assert closest.left == null;
            closest.left = newNode;
        } else {
            assert closest.right == null;
            closest.right = newNode;
        }
        size++;
        return true;
    }

    boolean checkInvariant() {
        return root == null || checkInvariant(root);
    }

    private boolean checkInvariant(Node<T> node) {
        Node<T> left = node.left;
        if (left != null && (left.value.compareTo(node.value) >= 0 || !checkInvariant(left))) return false;
        Node<T> right = node.right;
        return right == null || right.value.compareTo(node.value) > 0 && checkInvariant(right);
    }

    @Override
    public boolean remove(Object o) {
        return searchRemoveNode(root, (T) o, root);
    }

    private boolean searchRemoveNode(Node<T> node, T value, Node<T> parent) {
        if (node == null) return false;
        int comparison = value.compareTo(node.value);
        if (comparison == 0) return removeNode(parent, node, value);
        else parent = node;
        if (comparison < 0) return searchRemoveNode(node.left, value, parent);
        else return searchRemoveNode(node.right, value, parent);
    }

    private boolean removeNode(Node<T> parent, Node<T> node, T value) {
        if (parent == node){
            if (node.left == null && node.right != null) root = node.right;
            else if (node.left != null && node.right == null) root = node.left;
            else if (node.left == null) root = null;
            else {
                root = node.right;
                Node<T> current = node.right;
                while (current.left != null) current = current.left;
                current.left = parent.left;
            }
        }
        else
        if (parent.right == null && parent.left == null) root = null;
        else if (parent.left != null && parent.left.value.compareTo(value) == 0) {
            if (node.left == null && node.right != null) parent.left = node.right;
            else if (node.left != null && node.right == null) parent.left = node.left;
            else if (node.left == null) parent.left = null;
            else {
                parent.left = node.right;
                Node<T> current = node.right;
                while (current.left != null) current = current.left;
                current.left = node.left;
            }
        } else {
            if (node.left == null && node.right != null) parent.right = node.right;
            else if (node.left != null && node.right == null) parent.right = node.left;
            else if (node.left == null) parent.right = null;
            else {
                parent.left = node.left;
                Node<T> current = node.left;
                while (current.right != null) current = current.right;
                current.right = node.right;
            }
        }
        size--;
        return true;
    }


    @Override
    public boolean contains(Object o) {
        @SuppressWarnings("unchecked")
        T t = (T) o;
        Node<T> closest = find(t);
        return closest != null && t.compareTo(closest.value) == 0;
    }

    private Node<T> find(T value) {
        if (root == null) return null;
        return find(root, value);
    }

    private Node<T> find(Node<T> start, T value) {
        int comparison = value.compareTo(start.value);
        if (comparison == 0) {
            return start;
        } else if (comparison < 0) {
            if (start.left == null) return start;
            return find(start.left, value);
        } else {
            if (start.right == null) return start;
            return find(start.right, value);
        }
    }

    public class BinaryTreeIterator implements Iterator<T> {

        private Node<T> current = null;
        private int count;
        private int iteratorCounter;

        private BinaryTreeIterator() {
            iteratorCounter = size;
            count = size;
        }

        private void binaryTreeIter(Node<T> node) {
            if (node.left != null) binaryTreeIter(node.left);
            if (count == iteratorCounter) current = node;
            count--;
            if (node.right != null) binaryTreeIter(node.right);
        }

        private void findNext() {
            count = size;
            if (hasNext()) {
                binaryTreeIter(root);
                iteratorCounter--;
            } else current = null;
        }

        @Override
        public boolean hasNext() {
            return iteratorCounter > 0;
        }

        @Override
        public T next() {
            findNext();
            if (current == null) throw new NoSuchElementException();
            return current.value;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new BinaryTreeIterator();
    }

    @Override
    public int size() {
        return size;
    }


    @Nullable
    @Override
    public Comparator<? super T> comparator() {
        return null;
    }

    @NotNull
    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public SortedSet<T> headSet(T toElement) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    @Override
    public SortedSet<T> tailSet(T fromElement) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T first() {
        if (root == null) throw new NoSuchElementException();
        Node<T> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    @Override
    public T last() {
        if (root == null) throw new NoSuchElementException();
        Node<T> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }
}
