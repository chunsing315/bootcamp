import java.util.Arrays;

public class Box {

  // static variable (belongs to class)
  private static String prefix = "apple";

  private String name;

  // instance variable
  private String[] strings;

  public Box() {
    this.strings = new String[0];
  }

  public void setName(String name) {
    this.name = Box.prefix.concat("-").concat(name);
  }

  public String getName() {
    return this.name;
  }

  public String[] getStrings() {
    return this.strings;
  }

  public void setString(int index, String s) {
    this.strings[index] = s;
  }

  public void addString(String s) {
    String[] arr = new String[this.strings.length + 1];
    for (int i = 0; i < this.strings.length; i++) {
      arr[i] = this.strings[i];
    }
    arr[arr.length - 1] = s;
    this.strings = arr;
  }

  public void deleteString(String s) {
    // revise the arr length
    // remove corresponding Strings
  }

  public String toString() {
    return "Box(" //
        + "strings=" + Arrays.toString(this.strings) //
        + ")";
  }

  public static void main(String[] args) {
    Box box = new Box();
    box.addString("hello");
    box.addString("hello");
    System.out.println(Arrays.toString(box.getStrings()));
    System.out.println(box); // Box(strings=[hello, hello])

    box.setString(1, "world");
    System.out.println(box); // Box(strings=[hello, world])

    box.addString("xyz");
    System.out.println(box); // Box(strings=[hello, world, xyz])

    System.out.println(Box.prefix); // apple

    Box box2 = new Box();
    box2.setName("vincent");
    System.out.println(box2.getName());

  }
}
