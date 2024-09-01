import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private String address;

    public Bank() {
        this.accounts = new LinkedList<>();
    }

    public void add(Account account) {
        accounts.add(account);
    }

    public static class Account { // what if private? the outside cannot access this inner class
        private static int number = 0;
        private int acctNo;

        public Account() {
            this.acctNo = ++number;
        }
    }

    public void print() {
        // this.address;
         //you cannot access the outer class instance variable in static
         // because Account and Bank are in Parent relationship, i.e. not extends
        // nested class
    }

}
