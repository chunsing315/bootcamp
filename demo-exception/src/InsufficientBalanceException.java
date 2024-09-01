public class InsufficientBalanceException extends BusinessException{
    public InsufficientBalanceException(){
        super(ErrorCode.INSUFF_BAL);
    }
}
