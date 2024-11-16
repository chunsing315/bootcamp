public class PrimitiveDemo {
  public static void main(String[] args) {
    int x = 10; // left hand side x -> variable, right hand side 10 -> int value
    // compiler check if 10 can be assigned to x

    long l = x; // long range is higher than int type (promotion/ upcast)
    short s = (short) x; // short range is lower than int type (downcast -> explicit casting)
    // As a developer, you decided to adopt the risk of precision loss
    // compiler does not concern the value assigned to x during compile time
    // instead, it concerns the "range" of type only

    // ascii
    int y = 100;
    char c = (char) y; // downcasting
    int z = c;

    // default value
    long l2; // Declaration
    // System.out.println(l2); // You cannot use a variable without initialization

    long l3 = 7L;
    float f = 0.3f; // we need to use f after 0.3, because 0.3 is a double value by default
    byte b = 9; // Java still allow int value assigned to byte & short type.
    double d2 = 9.3d; // 9.3 is also OKAY.
    
    

  }
}
