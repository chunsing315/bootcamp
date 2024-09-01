public class Demo {
    public static void main(String[] args) {
        //Bank bank = new Bank();

        //Account account = new Account(); //account is not in the static, but in the bank.java
        /// Nested static class
        Bank.Account account = new Bank.Account(); //innerclass, static class is inside of another class. you use Bank to call Account.  But you didn't use Bank Object.

        // Inner class (non-static)
        Box box = new Box();
        Box.Ball ball = box.new Ball();
        System.out.println(ball.getCap());
        box.add(ball);
        System.out.println(box.getBalls().size());
        //new Box().new Ball();
    }
}
