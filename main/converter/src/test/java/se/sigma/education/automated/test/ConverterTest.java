package se.sigma.education.automated.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void addSekToEuro() {
        Converter converter = new Converter();
        Long euroToSek = 9l;
        converter.setConversionFactor("EURO", euroToSek);

        long hundredSek = 100l;
        Money sek = new Money(hundredSek, "SEK");
        long tenEuro = 10l;
        Money euro = new Money(tenEuro, "EURO");
        long hundredNinetySeka = 190l;
        Money expected = new Money(hundredNinetySeka, "SEK");

        Money actual = sek.add(euro);

        assertThat(actual, is(expected));
    }
}
