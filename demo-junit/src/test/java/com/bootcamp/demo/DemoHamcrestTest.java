package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.Test;
import java.util.List;

public class DemoHamcrestTest {

    @Test
    void test(){
        assertThat(1+2,is(equalTo(3)));
        assertThat(1+2,is(not(equalTo(4))));
        assertThat(App.subtract(2,1),is(equalTo(1)));


        // Comparison   
        assertThat(App.sum(40,2),allOf(
            //is(greaterThan(41)),
            greaterThan(41),
            //is(greaterThanOrEqualTo(42)),
            greaterThanOrEqualTo(42),
            //is(lessThan(43)),
            lessThan(43),
            //is(lessThanOrEqualTo(42)),
            lessThanOrEqualTo(42),
            equalTo(42)
            ));

        // String
        assertThat("hello",containsString("hell"));
        assertThat("hello",not(containsString("elll")));
        assertThat("hello",endsWith("o"));
        assertThat("Hello",startsWith("H"));
        assertThat("Hello",is(not(emptyString())));

    }
    @Test
    void testList(){
        List<String> strings = List.of("abc","def","ghi");
        assertThat(strings, hasSize(3));
        assertThat(strings, contains("abc","def","ghi")); //contains all
        assertThat(strings, containsInAnyOrder("abc","ghi","def")); //contains all
        assertThat(strings,not(containsInAnyOrder("ghi","def")));
        assertThat(strings,hasItem("abc"));
        assertThat(strings,is(not(empty())));
    }

    @Test
    void testArray(){
        String[] arr = new String[] {"apple","banna","organe"};
        assertThat(arr,arrayContaining("apple","banna","organe"));
        assertThat(arr,arrayContainingInAnyOrder("banna","organe","apple"));
        assertThat(arr,is(not(arrayContainingInAnyOrder("banna","organe"))));
        assertThat(arr,arrayWithSize(3));
    }

    @Test
    void testPolymorphism(){
        Number number = Long.valueOf(3);
        assertThat(number,is(instanceOf(Long.class)));
        assertThat(number,is(instanceOf(Number.class)));
        assertThat(number,is(instanceOf(Object.class)));
        Animal cat = new Cat();
        assertThat(cat,is(instanceOf(Animal.class)));
        assertThat(Cat.class,typeCompatibleWith(Animal.class));
        
    }


    public static void main(String[] args) {
        
    }
}
