package linkedlist;

// ArrayList<String>, String[]
public class Node {
  private String value;
  private Node next;

  public Node(String value) {
    this.value = value;
  }

  public Node(String value, Node node) {
    this.value = value;
    this.next = node;
  }

  public Node next(Node node) { // setter
    this.next = node;
    return node;
  }

  public Node getNext() {
    return this.next;
  }

  public String getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Node node = new Node("A");
    Node node2 = node.next(new Node("B"));
    node2.next(new Node("C"));

    Node head = node; // backup head
    while (head != null) {
      System.out.println(head.getValue());
      head = head.getNext();
    }

  }
}
