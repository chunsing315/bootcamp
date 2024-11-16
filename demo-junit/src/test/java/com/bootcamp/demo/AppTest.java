package com.bootcamp.demo;

// static import
// after "import static" you can call Assertions.asserAll without "Assertions."
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringReader;
import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.bootcamp.demo.App;

public class AppTest {
    
    // @ParameterizedTest
    // @CsvSource

    // @Test
    // public void testSum() {
    //     assertEquals(5, App.sum(3, 2));
    //     assertEquals(0, App.sum(-2, 2));
    //     assertEquals(0, App.sum(0, 0));
    //     assertEquals(2_000_000_000, App.sum(1_000_000_000, 1_000_000_000));
    //     assertNotEquals(6, App.sum(2, 3));

    //     // test edge cases
    // }
    @DisplayName("Test App.subtract")
    @Test
    public void testSubtract() {
       Assertions.assertEquals(1, App.subtract(2, 1));
        assertEquals(5, App.subtract(7, 2));
    }
    @DisplayName("Test App.comboine")
    @Test
    // x >= 10 && y >= 3
    public void testCombine() {
        assertEquals(7, App.combine(10, 3)); // TT
        assertEquals(12, App.combine(9, 3)); // FT
        assertEquals(12, App.combine(10, 2)); // TF
        assertEquals(11, App.combine(9, 2)); // FF

        assertEquals(8, App.combine(11, 3)); // !!! meaningless, because it is TT => dup line:29
        // we are not testing testSubtract
    }

    @Test
    void testAssert() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        assertNotSame(s1, s2);
        String s3 = s2;
        assertSame(s3, s2);
        String s4 = null;
        assertNull(s4);
        assertNotNull(s3);
    }

    @Test
    void testThrow() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });
        assertDoesNotThrow(() -> {
            App.divide(10, 1);
        });
    }

    @Test
    void testArray() {
        int[] arr1 = new int[] { 1, 2, 3 };
        int[] arr2 = new int[] { 1, 2, 3 };
        int[] arr3 = new int[] { 3, 2, 1 };
        assertArrayEquals(arr1, arr2); // check both order and element
        assertNotEquals(arr2, arr3);
    }

    @Test
    void testAssertAll() {
        assertAll(
                () -> assertTrue(App.sum(3, 2) == 5),
                () -> assertTrue(App.sum(3, 3) == 6),
                () -> assertTrue(App.sum(5, 2) == 7),
                () -> assertEquals(App.sum(5, 2), 7));
    }
    //Non-functional requirement
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(2), ()->{
            Thread.sleep(1);
            // for(int i = 0; i<10; i++){
            //     App.sum(1,i);
            // }
        });
    }
}
