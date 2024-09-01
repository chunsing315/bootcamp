public class DemoStringBuilder {
    public static void main(String[] args) {
        String x = "hello";

        StringBuilder sb = new StringBuilder("hello"); // "new StringBuilder()" ->constructer. fast performance
        Cat cat = new Cat();

        sb.append(" world");
        System.out.println(sb);

        sb.replace(1,2,"xxxxxx");
        System.out.println(sb.toString());

        System.out.println(sb.insert(4,"happy"));
    }
}
