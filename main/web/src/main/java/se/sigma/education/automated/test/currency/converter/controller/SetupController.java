package se.sigma.education.automated.test.currency.converter.controller;

import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import se.sigma.education.automated.test.Converter;

public class SetupController {

    public void setConversionRate(String currencySymbol, Integer conversionFactor) {
        Model model = new ExtendedModelMap();
        setConversionRate(currencySymbol, conversionFactor, model);
    }

    public String setConversionRate(String currencySymbol, Integer conversionFactor, Model model) {
        Converter.setConversionFactor(currencySymbol, conversionFactor);
        model.addAttribute(currencySymbol, conversionFactor);

        return "conversionRates";
    }
}
