public class LifeScience<T,U> {
    private T t;
    private U u;
    
    public LifeScience() {
    }

    public LifeScience(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public static void main(String[] args) {
        LifeScience<String,Integer> customers = new LifeScience<>();
        customers.setU(1);
        customers.setT("Biology");
        // T can be same as U
        LifeScience<String,String> strings = new LifeScience<>();
        strings.setU("Chemistry");
        strings.setT("Confidence");
    }

        
}
