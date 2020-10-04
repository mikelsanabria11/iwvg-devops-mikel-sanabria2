package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchesTest {

    @Test
    void testFindFractionAdditionByUser1() {
        assertEquals(3, new Searches().findFractionAdditionByUserId("1").getNumerator());
        assertEquals(1, new Searches().findFractionAdditionByUserId("1").getDenominator());
    }

    @Test
    void testFindFractionAdditionByUser2() {
        assertEquals(218, new Searches().findFractionAdditionByUserId("2").getNumerator());
        assertEquals(60, new Searches().findFractionAdditionByUserId("2").getDenominator());
    }

    @Test
    void testFindFractionAdditionByUser3() {
        assertEquals(-288, new Searches().findFractionAdditionByUserId("3").getNumerator());
        assertEquals(-240, new Searches().findFractionAdditionByUserId("3").getDenominator());
    }

    @Test
    void testFindFractionAdditionByUser4() {
        assertEquals(16, new Searches().findFractionAdditionByUserId("4").getNumerator());
        assertEquals(8, new Searches().findFractionAdditionByUserId("4").getDenominator());
    }

    @Test
    void testFindFractionAdditionByUser5() {
        assertEquals(0, new Searches().findFractionAdditionByUserId("5").getNumerator());
        assertEquals(-6, new Searches().findFractionAdditionByUserId("5").getDenominator());
    }

    @Test
    void testFindFractionAdditionByUser6() {
        assertNull(new Searches().findFractionAdditionByUserId("6"));
    }

    @Test
    void testFindDecimalFractionByUserNameOscar() {
        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), new Searches().findDecimalFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserNameAna() {
        assertEquals(List.of(2.0, -0.2, 0.5, 1.3), new Searches().findDecimalFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserNamePaula() {
        assertEquals(List.of(1.0, 1.0, Double.NaN, Double.NaN, 1.0), new Searches().findDecimalFractionByUserName("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserNameAntonio() {
        assertEquals(List.of(0.0, 0.0, 0.0), new Searches().findDecimalFractionByUserName("Antonio")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionDivisionByUser1() {
        assertEquals(0, new Searches().findFractionDivisionByUserId("1").getNumerator());
        assertEquals(2, new Searches().findFractionDivisionByUserId("1").getDenominator());
    }

    @Test
    void testFindFractionDivisionByUser2() {
        assertEquals(120, new Searches().findFractionDivisionByUserId("2").getNumerator());
        assertEquals(-8, new Searches().findFractionDivisionByUserId("2").getDenominator());
    }

    @Test
    void testFindFractionDivisionByUser3() {
        assertEquals(-48, new Searches().findFractionDivisionByUserId("3").getNumerator());
        assertEquals(60, new Searches().findFractionDivisionByUserId("3").getDenominator());
    }

    @Test
    void testFindFractionDivisionByUser4() {
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getNumerator());
        assertEquals(8, new Searches().findFractionDivisionByUserId("4").getDenominator());
    }

    @Test
    void testFindFractionDivisionByUser5() {
        //assertNull(new Searches().findFractionDivisionByUserId("5"));
        assertEquals(0, new Searches().findFractionDivisionByUserId("5").getNumerator());
        assertEquals(0, new Searches().findFractionDivisionByUserId("5").getDenominator());
    }

    @Test
    void testFindFractionDivisionByUser6() {
        assertEquals(0, new Searches().findFractionDivisionByUserId("6").getNumerator());
        assertEquals(0, new Searches().findFractionDivisionByUserId("6").getDenominator());
    }

}
