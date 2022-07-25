class Node {
    private int data;
    private Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void printData() {
        System.out.println(this.getData());
    }
}
