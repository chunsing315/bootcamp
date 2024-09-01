public enum Currency {
    //enum is unique.
    HKD ("HKD",1),//
    USD("USD",2),//
    JPY("YEN",3),//
    ;

        // instance variable
        private final String description;
        private final int DBValue;
    
        // Constructor
        private Currency (String description,int DBValue){
            this.description = description;
            this.DBValue = DBValue;
        }

    private String getDescription(){
        return this.description;
    }
    private int getDBValue(){
        return this.DBValue;
    }

    //2-> usd
    //3-> JPY
    public static Currency get (int DBValue){
        for (Currency curr : Currency.values()){
            if (DBValue == curr.getDBValue()) {
                return curr;
            } 
        }
        return null; //throw expection
    }
    
    
    public static int get(Currency currency){
        return currency.getDBValue();
    }

    public static String fullDescription (Currency currency){
        
        /* if (currency == Currency.HKD){
            return "Hong Kong Dollar is pegged with USD";
        } else if (currency == Currency.USD){
            return "USD is the most liquid currency";
        } else if (currency == Currency.JPY){
            return String.valueOf(currency.getDBValue())
        } */

        switch (currency){
            case HKD:
                return "HKD Pegged with USD.";
            case JPY:
                return "low to negative interest rate for 20 years";
            case USD:
                return "You cannot get anymore liquid";
            default:
                return null;
            }
    }

    @Override
    public String toString(){
        return "Currency" //
        + this.description//
        + this.DBValue;//
    }

    public static void main(String[] args) {
        
        Currency currency = Currency.HKD;
        if (currency == Currency.USD) {
            System.out.println("it is " + currency.getDescription());
        } else if (currency == Currency.HKD) {
            System.out.println("it is " + currency.getDescription());

        } else if (currency == Currency.JPY) {
            System.out.println("it is " + currency.getDescription());

        }

        


        System.out.println(currency); //"HKD"object toString. by default overriden
        //provided by ENUM.class
        System.out.println(currency.toString());//"HKD". Overriden 
        System.out.println(currency.name());//"HKD". Overriden 

        //2. values()
        for (Currency c : Currency.values()){  // loop through all values in Currency enum. like an enum array
            System.out.println(c.getDescription());
        }

        System.out.println((Currency.values().length)); //looks like an array, used like an array.

        System.out.println(Currency.HKD.hashCode()); // the same
        System.out.println(currency.hashCode()); // the same
        System.out.println(Currency.USD.hashCode());

        System.out.println(Currency.JPY.equals(currency));
        System.out.println(Currency.HKD.equals(currency)); //True

        System.out.println(currency.equals(Currency.HKD)); //not ok, because null pointer /* exception */. Use fixed value to .equals
        //currency = null; // SERIOUS ERROR!! don't use variable as the pointer in comparison!
        //System.out.println(currency.equals(Currency.HKD)); //not ok, because null pointer exception
        System.out.println(currency !=null && currency.equals(Currency.HKD)); //not ok, because null pointer exception. //
        //better to have the !=null && . if the front is false ,won't proceed

        System.out.println(Currency.get(3).getDescription());


        //enum advantage

        //3. valueOf() -> static method
        System.out.println(Currency.valueOf("HKD").name());// "HKD" --> Currency enum -> name() --> "HKD"
        //System.out.println(Currency.valueOf("GBP").name());// IllegalArgumentException
        System.out.println(fullDescription(currency));
        
    }
}