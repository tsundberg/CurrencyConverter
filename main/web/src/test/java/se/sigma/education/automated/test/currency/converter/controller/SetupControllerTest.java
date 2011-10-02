package se.sigma.education.automated.test.currency.converter.controller;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SetupControllerTest {
    @Test
    public void setupConverter() {
        SetupController setup = new SetupController();
        Model model = new ExtendedModelMap();
        String expectedLandingPageName = "conversionRates";

        String expectedCurrency = "EURO";
        Double expectedConversionFactor = 9.24;
        String actualLandingPageName = setup.setConversionRate(expectedCurrency, expectedConversionFactor, model);

        assertThat(actualLandingPageName, is(expectedLandingPageName));

        assertTrue("Should contain the expected currency " + expectedCurrency, model.containsAttribute(expectedCurrency));
        Map<String, Object> objectMap = model.asMap();
        Object actualFactor = objectMap.get(expectedCurrency);
        Double actualConversionFactor = (Double) actualFactor;
        assertThat(actualConversionFactor, is(expectedConversionFactor));
    }
}
