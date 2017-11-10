package tree;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 * O(n log n). Требуется O(n) дополнительной памяти
 * 1. Построение двоичного дерева.
 * 2. Сборка результирующего массива путём обхода узлов в необходимом порядке следования ключей.
 * See TreeSet
 */
public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    /*
    * Determine with help of data(comparable field where to put node)
    *  See TreeMap for more stable code
    */
    public void insert(Node node) {
        if (node.getData() < this.data) {
            if (left != null) {
                left.insert(node);
            } else {
                left = node;
            }
        } else if (right != null) {
            right.insert(node);
        } else {
            right = node;
        }
    }

    public void traverse(TreePrinter visitor) {
        //find left most node
        if (left != null)
            left.traverse(visitor);
        //start printing from it
        visitor.visit(this);
        if (right != null)
            right.traverse(visitor);
    }

    public Node getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.insert(new Node(3));
        node.insert(new Node(6));
        node.insert(new Node(2));
        node.insert(new Node(1));
        //traverse from root node
        node.traverse(new TreePrinterImpl());
    }
}
