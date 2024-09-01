package Linkedlist;

public class Node {
    private Node next;
    private String value;

    //demonstrate
    // perform like List of String
    public Node(Node node, String value){
        this.next = node;
        this.value= value;
    }

    public Node(String value){
        this.value = value;
    }

    public Node next(Node node){
        this.next = node;
        return node;
    }

    public String getValue(){
        return this.value;
    }


    public static void main(String[] args) {
        Node node = new Node("A");
        Node node2 = node.next(new Node("B"));
        node2.next(new Node("C"));

        Node head = node;
        while (head != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }

    public Node getNext() {
        return next;
    }
}
