public class App {
    public static void main(String[] args) throws Exception {
        Integer[] integers = new Integer[] {2,-4,10};
        int sum = 0;
        for (Intger i : integers){
            sum += i;
        }
        System.out.println(sum);
    }
}
