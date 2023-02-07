public class Node01 {
    private Node01 next;
    private Integer data;

    public Node01() {
    }

    public Node01(int data) {
        //     this.next = null;
        this.data = data;
    }
    public void appendToTail(int d) {

        Node01 temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node01 node01New = new Node01(d);
        temp.next = node01New;
    }

    public void print(){
Node01 temp = this;
        System.out.println(this.next);
        System.out.println(temp.next.next);
        System.out.println(this);
    }
    public Node01 remove(Node01 headNode, Integer d) {
        Node01 temp = this;
        if (temp.data==null)

      if(temp.data==d){
          return null;
      }
      while (temp.next!=null) {
          if (temp.next.data == d) {
              temp.next = temp.next.next;
              break;
          }
          temp = temp.next;
      }
        return headNode;
}

    @Override
    public String toString() {
        return "Node01{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
//    @Override
//    public String toString() {
//        String res="";
//        Node01 temp = this;
//        while (temp!=null){
//            res = res + " " + temp.data +"\n";
//            temp= temp.next;
//        }
//        return res;}
}