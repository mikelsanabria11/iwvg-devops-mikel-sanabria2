package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 5);
    }

    @Test
    void testFraction() {
        Assertions.assertEquals(2, fraction.getNumerator());
        Assertions.assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testFractionGeneric() {
        fraction = new Fraction();
        Assertions.assertEquals(1, fraction.getNumerator());
        Assertions.assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        Assertions.assertEquals(0.4, fraction.decimal());
    }
}
