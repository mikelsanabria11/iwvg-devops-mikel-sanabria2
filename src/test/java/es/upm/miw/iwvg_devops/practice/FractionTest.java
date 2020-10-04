package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FractionTest {
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
    void testIsNotProper() {
        fraction = new Fraction(3, 2);
        assertEquals(false, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        fraction = new Fraction(3, 2);
        assertEquals(true, fraction.isImproper());
    }

    @Test
    void testIsNotImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction equivalentFraction = new Fraction(4,10);
        assertEquals(true, fraction.isEquivalent(equivalentFraction));
    }

    @Test
    void testIsNotEquivalent() {
        Fraction notEquivalentFraction = new Fraction(3,5);
        assertEquals(false, fraction.isEquivalent(notEquivalentFraction));
    }

    @Test
    void testAdd() {
        Fraction fractionToAdd = new Fraction(4,10);
        Fraction result = fraction.add(fractionToAdd);
        assertEquals(40, result.getNumerator());
        assertEquals(50, result.getDenominator());
    }

    @Test
    void testAddDenominatorZero() {
        Fraction fractionToAdd = new Fraction(4,0);
        Fraction result = fraction.add(fractionToAdd);
        assertNull(result);
    }

    @Test
    void testAddDenominatorEqual() {
        Fraction fractionToAdd = new Fraction(4,5);
        Fraction result = fraction.add(fractionToAdd);
        assertEquals(6, result.getNumerator());
        assertEquals(5, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fractionToMultiply = new Fraction(4,10);
        Fraction result = fraction.multiply(fractionToMultiply);
        assertEquals(8, result.getNumerator());
        assertEquals(50, result.getDenominator());
    }

    @Test
    void testMultiplyDenominatorZero() {
        Fraction fractionToMultiply = new Fraction(4,0);
        Fraction result = fraction.multiply(fractionToMultiply);
        assertNull(result);
    }

    @Test
    void testDivide() {
        Fraction fractionToDivide = new Fraction(4,10);
        Fraction result = fraction.divide(fractionToDivide);
        assertEquals(20, result.getNumerator());
        assertEquals(20, result.getDenominator());
    }

    @Test
    void testDivideDenominatorZero() {
        Fraction fractionToDivide = new Fraction(4,0);
        Fraction result = fraction.divide(fractionToDivide);
        assertEquals(0, result.getNumerator());
        assertEquals(0, result.getDenominator());
    }
}
