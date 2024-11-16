import java.util.Arrays;

public class ArrayList1 {

  private Integer[] integers;

  public ArrayList1() {
    this.integers = new Integer[0];
  }

  public void add(Integer i) {
    Integer[] arr = new Integer[this.integers.length + 1];
    int idx = 0;
    for (Integer x : this.integers) {
      arr[idx++] = x;
    }
    arr[idx] = i;
    this.integers = arr;
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  public int size() {
    return this.integers.length;
  }

  public void remove(int index) {
    Integer[] arr = new Integer[this.integers.length - 1];
    int idx = 0;
    for (int i = 0; i < this.integers.length; i++) {
      if (i != index) {
        arr[idx++] = this.integers[i];
      }
    }
    this.integers = arr;
  }

  public Integer[] getIntegers() {
    return this.integers;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.integers);
  }

  public static void main(String[] args) {
    ArrayList1 list = new ArrayList1();
    list.add(10);
    list.add(2);
    list.add(-4);
    for (Integer x : list.getIntegers()) {
      System.out.println(x);
    }
    System.out.println(list); // [10, 2, -4]

    list.add(100);
    System.out.println(list); // [10, 2, -4, 100]

    list.remove(1);
    System.out.println(list); // [10, -4, 100]
  }
}
