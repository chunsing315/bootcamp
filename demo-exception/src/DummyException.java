public class DummyException extends BusinessException{
    public DummyException(){
        super(ErrorCode.INSUFF_BAL);
    }    
}
