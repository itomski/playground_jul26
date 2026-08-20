package de.lubowiecki.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MacherTest {

    @BeforeAll
    public static void setupAll() {
        // Wird einmalig vor allen Tests ausgeführt
        System.out.println("setupAll");
    }

    private Macher macher;

    @BeforeEach
    public void setup() {
        // Wird vor jedem Test ausgeführt
        macher = new Macher();
        System.out.println("setup");
    }

    @RepeatedTest(10)
    @DisplayName("Zufallszahl zwischen 1 und 100")
    void machWas() {
        int rand = macher.machWas();
        assertTrue(rand > 0);
        assertTrue(rand < 100);
    }

    @Test
    @DisplayName("Addition von 10 und 15")
    void testMachWas() {
        int a = 10;
        int b = 15;
        int result = macher.machWas(a, b);
        int expected = 25;
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @DisplayName("Verschiedene Additionen")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void testMachWas2(int b) {
        int a = 10;
        int result = macher.machWas(a, b);
        int expected = 10 + b;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Addition von 15 und 18")
    void testMachWas_15Plus18() {
        int a = 15;
        int b = 18;
        int result = macher.machWas(a, b);
        int expected = 33;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("10.0 geteilt durch 5.0")
    void machWasAnderes() {
        double a = 10.0;
        double b = 5.0;
        double result = macher.machWasAnderes(a, b);
        double expected = 2.0;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Devision durch 0.0")
    void machWasAnderes2() {
        double a = 10.0;
        double b = 0.0;
        Assertions.assertThrows(ArithmeticException.class, () -> {
            macher.machWasAnderes(a, b);
        });
    }

    @AfterEach
    public void tearDown() {
        // Wird nach jedem Test ausgeführt
        System.out.println("tearDown");
    }

    @AfterAll
    public static void tearDownAll() {
        // Wird einmalig nach allen Tests ausgeführt
        System.out.println("tearDownAll");
    }
}