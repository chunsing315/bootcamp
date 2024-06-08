public class TestCat {
    public static void main(String[] args) {
        String name = "John";
        Cat c1 = new Cat(); // "new Cat()" > produce a Cat object in the memory; you don't know where, but you have a code for the address
        //c1 => object reference, variable(); pointer to point to memory. e.g. 0x123asfhw123iowhfix
        c1.setAge(10);
        System.out.println(c1.getAge());

        System.out.println(c1.getAge());
        
        Cat c2 = new Cat();
        c2.setAge(7);
        c2.setName("Otter");
        System.out.println(c2.getAge());
        System.out.println(c2.describe());

        int[] integers = {1,2,3};
        Bag abc = new Bag(integers);
        





        Book b1 = new Book();
        b1.setISBN("1234567890");
        System.out.println(b1.getISBN());

        
    }
    
}

