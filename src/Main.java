public class Main {
    public static void main(String[] args) {
        Node01 node = new Node01(10);
        Node01 node2 = new Node01(2);
        Node01 node01= new Node01();
        node.appendToTail(1);
        node.appendToTail(2);
        node.appendToTail(3);
        node.appendToTail(4);
        node.appendToTail(5);
        node2.appendToTail(12);
     //   System.out.println(node);
//        System.out.println(node2);
        System.out.println(node01.remove(node01,null));
        //   System.out.println(node.remove(node, 3));
        //   System.out.println(node);
    }
}