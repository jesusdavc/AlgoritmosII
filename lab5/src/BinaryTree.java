public class BinaryTree {
    private Node root;

    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            this.insert(this.root, data);
        }
    }

    private void insert(Node padre, int data) {
        if (data > padre.getData()) {
            if (padre.getRight() == null) {
                padre.setRight(new Node(data));
            } else {
                this.insert(padre.getRight(), data);
            }
        } else {
            if (padre.getLeft() == null) {
                padre.setLeft(new Node(data));
            } else {
                this.insert(padre.getLeft(), data);
            }
        }
    }


    private void postOrder(Node n) {
        if (n != null) {
            postOrder(n.getLeft());
            postOrder(n.getRight());
            n.printData();
        }
    }

    public void postOrder() {
        this.postOrder(this.root);
    }
}
