public class StringHelper {

  private String str; // attribute

  public StringHelper(String str) {
    this.str = str;
  }

  public int length() {
    return str.length();
  }

  // instance method
  public StringHelper setCharAt(int index, char ch) {
    String s = new String("");
    for (int i = 0; i < this.str.length(); i++) {
      if (i == index)
        s += ch;
      else
        s += this.str.charAt(i);
    }
    this.str = s; // revise the string object inside StringHelper Object
    return this;
  }

  public String toString() {
    return this.str;
  }

  public StringHelper append(String s) {
    this.str += s;
    return this;
  }

  public String substring(int startIdx, int endIdx) {
    String s = "";
    for (int i = startIdx; i < endIdx; i++) {
      s += this.str.charAt(i);
    }
    // this.str = s;
    return s;
  }

  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setCharAt(3, 'a');
    System.out.println(sh.toString()); // helao

    sh.append("world");
    System.out.println(sh.toString()); // helaoworld

    // chain method call
    sh.append("!!!").append(" I'm Vincent.").setCharAt(10, '#').append("!!!!");
    System.out.println(sh.toString()); // helaoworld#!! I'm Vincent.

    "hello".charAt(1); // nothing

    System.out.println(sh.substring(2, 5)); // lao

  }
}
