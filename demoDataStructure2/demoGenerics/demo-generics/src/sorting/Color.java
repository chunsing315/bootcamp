package sorting;

public enum Color {
    RED(1),WHITE(2),BLACK(3),;    
    private final int rank;

    Color(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }

}
