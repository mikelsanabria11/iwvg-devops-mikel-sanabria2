package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Test;

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

}