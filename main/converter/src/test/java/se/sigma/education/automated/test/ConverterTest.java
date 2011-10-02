package se.sigma.education.automated.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void addSekToEuro() {
        Integer euroToSek = 9;
        Converter.setConversionFactor("EURO", euroToSek);

        Integer hundredSek = 100;
        Money sek = new Money(hundredSek, "SEK");
        Integer tenEuro = 10;
        Money euro = new Money(tenEuro, "EURO");
        Integer hundredNinetySeka = 190;
        Money expected = new Money(hundredNinetySeka, "SEK");

        Money actual = sek.add(euro);

        assertThat(actual, is(expected));
    }
}
