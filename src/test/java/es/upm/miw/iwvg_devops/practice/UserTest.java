package es.upm.miw.iwvg_devops.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class UserTest {
    private User user;
    private List<Fraction> fractions;
    private Fraction fraction = new Fraction();

    @BeforeEach
    void before() {
        fractions = new ArrayList<>();
        fractions.add(fraction);
        user = new User("001", "Mikel", "Sanabria", fractions);
    }

    @Test
    void testUser() {
        Assertions.assertEquals("001", user.getId());
        Assertions.assertEquals("Mikel", user.getName());
        Assertions.assertEquals("Sanabria", user.getFamilyName());
        Assertions.assertEquals(fractions, user.getFractions());
    }

    @Test
    void testUserGeneric() {
        user = new User();
        Assertions.assertNull(user.getId());
        Assertions.assertNull(user.getName());
        Assertions.assertNull(user.getFamilyName());
        Assertions.assertEquals(0, user.getFractions().size());
    }

    @Test
    void testAddFraction() {
        user.addFraction(fraction);
        Assertions.assertEquals(2, user.getFractions().size());
    }

    @Test
    void testFullName() {
        Assertions.assertEquals("Mikel Sanabria", user.fullName());
    }

    @Test
    void testInitials() {
        Assertions.assertEquals("M.", user.initials());
    }
}
