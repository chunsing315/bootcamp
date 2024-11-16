public class Demo {

  public static void main(String[] args) {
    // Bank bank = new Bank();

    // Nested static class
    Bank.Account account = new Bank.Account();
    System.out.println(account.getAcctNo()); // 1

    // Inner class (non-static)
    Box box = new Box();
    Box.Ball ball = box.new Ball();
    System.out.println(ball.getCapacity()); // 10
    box.add(ball);
    System.out.println(box.getBalls().size()); // 1

    int x = 3;

    if (x == 3) {
      // Anonymous Inner Class
      Swimable john = new Swimable() {
        @Override
        public void swim() {
          System.out.println("John is swimming ....");
        }
      };

      john.swim();
    } else {
      Swimable sally = new Swimable() {
        public String name = "Sally";

        public String getName() {
          return this.name;
        }

        @Override
        public void swim() {
          System.out.println("Sally is swimming ....");
        }
      };
      sally.swim();
      // sally.getName(); // Polymorphsim
    }



  }
}
