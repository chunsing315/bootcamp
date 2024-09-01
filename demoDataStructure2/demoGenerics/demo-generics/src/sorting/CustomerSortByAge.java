package sorting;

import java.util.Comparator;

public class CustomerSortByAge implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getAge()>c2.getAge()){
            return -1; //-1 represents c1 object, 1 represent c2 object
        } if (c1.getAge()<c2.getAge()){
            return 1;
        }; return -1;
    }
}
