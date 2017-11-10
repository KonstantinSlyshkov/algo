package tree;

/**
 * Created by Kostiantyn_Slyshkov on 8/13/2017.
 */
public class TreePrinterImpl implements TreePrinter {
    public void visit(Node node) {
        System.out.println(node.getData());
    }
}
