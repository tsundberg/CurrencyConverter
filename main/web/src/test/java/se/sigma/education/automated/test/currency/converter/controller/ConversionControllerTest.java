package se.sigma.education.automated.test.currency.converter.controller;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.util.Map;

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
        Model model = new ExtendedModelMap();
        String actualLandingPage = conversionController.convert(amount, euro, model);

        String expectedLandingPage = "conversionResult";
        assertThat(actualLandingPage, is(expectedLandingPage));

        Integer expectedValue = amount * euroConversionFactor;
        Map<String, Object> map = model.asMap();
        Integer actualValue = (Integer) map.get("result");
        assertThat(actualValue, is(expectedValue));
    }

}
