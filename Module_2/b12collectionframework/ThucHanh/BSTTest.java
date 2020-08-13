package b12collectionframework.ThucHanh;

public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> treeBST = new BST<>();

        treeBST.insert(5);
        treeBST.insert(1);
        treeBST.insert(2);
        treeBST.insert(6);

        treeBST.insert(4);
        treeBST.insert(6);
        treeBST.insert(8);
        treeBST.insert(0);

        treeBST.printTree(treeBST.root);
        System.out.println("Size " + treeBST.size);

    }
}
