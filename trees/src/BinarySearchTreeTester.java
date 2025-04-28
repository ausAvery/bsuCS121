public class BinarySearchTreeTester {
    public static void main(String[] args) {
        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();

        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(20);
        tree.addNode(30);
        tree.addNode(75);
        tree.addNode(70);
        tree.addNode(80);

        System.out.println("preorder traversal: ");
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("\ninorder traversal: ");
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("\npostorder traversal: ");
        tree.postOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("\n" + tree.findNode(75));
        System.out.println(tree.findNode(85));
        System.out.println();

        System.out.println(tree.removeNode(25));
        System.out.println("\nNew inorder traversal:");
        tree.inOrderTraverse(tree.getRoot());
    }
}
