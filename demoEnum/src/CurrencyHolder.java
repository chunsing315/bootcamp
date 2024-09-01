public class CurrencyHolder {
    private final String currency;
    private final  int DBValue;
//Contruct
    public CurrencyHolder(String currency, int DBValue){
        this.currency = currency;
        this.DBValue = DBValue;
    }

    

        //
    // 1) cannot guarantee there is only one HKD in memory.
    public static void main(String[] args) {
        CurrencyHolder new CurrencyHolder("HKD",1);
        CurrencyHolder new CurrencyHolder("HKD",1);

    // 2) not an okay parameter, String is not a good idea to represent a parameter that with finite number of object.


    }

    // enum.class define a finite number of values, so tat compiler can validate the parametier.
    // (type safe: compiler time ensure the scope of values)
    public boolean isHKD(){
        return "HKD".equals(this.currency);

    }



    public String getCurrency() {
        return currency;
    }/



    public int getDBValue() {
        return DBValue;
    }
}
