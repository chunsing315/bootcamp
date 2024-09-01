public class Account {
    private double balance;
    
    public Account(){
        this.balance = 0.0;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void debit(double amount) throws InsufficientBalanceException{ //this force the caller to try. or it gets compile error message.
        if (this.balance < amount)
            //checked exception
            //throw new BusinessException(ErrorCode.INSUFF_BAL); //encapsulation
            throw new InsufficientBalanceException();
            // throw new IllegalArgumentException();
        this.balance -= amount;
    }

    public void credit(double amount){
        this.balance += amount;
    }


    public static void main(String[] args) {
        Account ac = new Account();
        ac.credit(100);
        try{
            ac.debit(70);
            ac.debit(31);
        } catch (BusinessException e){ //we threw InsufficientBalanceException, but we can catch it with BusinessException because it is parent.
            //System.out.println(e.getErrorCode()+" - " + e.getMessage());
            System.out.println(e.codewithMessage());
        }finally {
            System.out.println("Transaction over. No matter the transaction is successful or not.");
        }

        System.out.println(ac.getBalance());
        ac.setBalance(1_300_000);
        System.out.println(ac.getBalance());
        try{
            ac.debit(1_400_000);
        } catch (BusinessException e){
            System.out.println(e.codewithMessage());
        } finally {
            System.out.println("Transaction over. No matter the transaction is successful or not.");
        }
        System.out.println(ac.getBalance());
    }
}