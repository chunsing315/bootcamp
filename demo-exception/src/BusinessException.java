public class BusinessException extends Exception{
    private int code;

    public int getErrorCode(){
        return this.code;
    }
    /* public BusinessException(int errorCode, String message){
        super (message);
        this.errorCode = errorCode; 
    } */

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public String codewithMessage(){
        return "Error: "+ this.code + " - " + this.getMessage();
    }


}
