public record Book(double price, String author) { // no getter and setter
    // it is history, data, in the past, not for edit

    // 1. getter -> price(), author()
    // 2. One constructor only -all-arg constructor
    // 3. attributes are private
    // 4. equals(), hasCode();

    @Override
    public String toString(){
        return this.author + " 's book is sold at $" +this.price;
    }


    
}
