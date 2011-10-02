package se.sigma.education.automated.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void addSekToEuro() {
        Integer expected = 9;
        String currencySymbol = "EURO";
        Converter.setConversionFactor(currencySymbol, expected);

        Integer actual = Converter.getConversionFactor(currencySymbol);

        assertThat(actual, is(expected));
    }
}
