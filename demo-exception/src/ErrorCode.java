public enum ErrorCode {
    INSUFF_BAL(-99,"Withdrawal AMT > A/C Balance"),//
    ;
    
    private int code;
    private String message;

    private ErrorCode(int code,String message){
        this.code = code;
        this.message= message;
    }

    public String getMessage(){
        return this.message;
    }
    public int getCode(){
        return this.code;
    }
}
