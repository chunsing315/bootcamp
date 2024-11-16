public class StringBox {
  private String value;
  private Integer integer;

  public StringBox() {

  }
  public StringBox(String value) {
    this.value = value;
  }

  public void setInteger(Integer value) {
    // this.value = String.valueOf(value);
    this.integer = value;
  }

  public Integer getInteger() {
    return this.integer;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static void main(String[] args) {
    StringBox box = new StringBox("abc");
    System.out.println(box.getValue()); // abc

    StringBox box2 = new StringBox();
    box2.setInteger(1);
  }
}
