public class Array {
    public static void main(String[] args) throws Exception {
        Integer[] integers = new Integer[] {2,-4,10};
        int sum = 0;
        for (Integer i : integers){
            sum += i;
        }
        System.out.println(sum);

        // ArrayList
        sum = 0;
        ArrayList<Integer> integers2 = new ArrayList<Integer>(); // call constructor of ArrayList.class
        integers2.add(2);
        integers2.add(-4);
        integers2.add(10);
        for (Integer i : integers2){
            sum += i;
        }
        System.out.println(sum);
}
}

