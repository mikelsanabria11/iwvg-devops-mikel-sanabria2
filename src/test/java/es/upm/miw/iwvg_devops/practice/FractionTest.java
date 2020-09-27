package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 5);
    }

    @Test
    void testFraction() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testFractionGeneric() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.4, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction equivalentFraction = new Fraction(4,10);
        assertEquals(true, fraction.isEquivalent(equivalentFraction));
    }

    @Test
    void testAdd() {
        Fraction fractionToAdd = new Fraction(4,10);
        Fraction result = fraction.add(fractionToAdd);
        assertEquals(40, result.getNumerator());
        assertEquals(50, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fractionToMultiply = new Fraction(4,10);
        Fraction result = fraction.multiply(fractionToMultiply);
        assertEquals(8, result.getNumerator());
        assertEquals(50, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fractionToDivide = new Fraction(4,10);
        Fraction result = fraction.divide(fractionToDivide);
        assertEquals(20, result.getNumerator());
        assertEquals(20, result.getDenominator());
    }
}
