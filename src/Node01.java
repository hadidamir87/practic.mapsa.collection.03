public class Node01 {
    private Node01 next;
    private int data;

    public Node01() {
    }

    public Node01(Node01 next, int data) {
        this.next = next;
        this.data = data;
    }

    public Node01 getNext() {
        return next;
    }

    public void setNext(Node01 next) {
        this.next = next;
    }
    public void appendToTail(int d){
     Node01 node = new Node01(next , d);
     next = node;
    }

    @Override
    public String toString() {
        return "Node01{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
