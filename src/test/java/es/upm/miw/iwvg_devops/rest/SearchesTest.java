package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }
    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Antonio"), new Searches().findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }
    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(List.of("Blanco","López"), new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }
    @Test
    void testFindDecimalImproperFractionByUserName() {
        assertEquals(List.of(-0.2), new Searches().findDecimalImproperFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }
    @Test
    void testFindHighestFraction() {
        assertEquals(List.of(), new Searches().findDecimalImproperFractionByUserName()
                .collect(Collectors.toList()));
    }


}
