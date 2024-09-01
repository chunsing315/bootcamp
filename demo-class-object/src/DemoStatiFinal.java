import java.lang.Math;

public class DemoStatiFinal {
  private static String name;
  private int age;
    private final double salary = 0.0d;
    private static final String logo = "defualt";
    private static final String LOGO_STRING = "Default"; //Cap latter and snakecase

    //final is a java keyword. Compliredr  would check all final variable hsa ben intizialed.

    public static void main(String[] args) {
        DemoStatiFinal dsf = new DemoStatiFinal();
        dsf.age = 10;;
        DemoStatiFinal dsf2 = new DemoStatiFinal();
        dsf.age = 20;
        double i = Math.PI;


    }

}
