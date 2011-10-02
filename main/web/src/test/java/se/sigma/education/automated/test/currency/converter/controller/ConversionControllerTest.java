package se.sigma.education.automated.test.currency.converter.controller;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConversionControllerTest {

    @Test
    public void convert() {
        SetupController setupController = new SetupController();
        String euro = "EURO";
        Integer euroConversionFactor = 8;
        setupController.setConversionRate(euro, euroConversionFactor);

        ConversionController conversionController = new ConversionController();
        Integer amount = 10;
        Integer actualValue = conversionController.convert(amount, euro);

        Integer expectedValue = amount * euroConversionFactor;
        assertThat(actualValue, is(expectedValue));
    }

}
