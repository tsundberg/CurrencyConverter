package se.sigma.education.automated.test.currency.converter.controller;

import org.springframework.ui.Model;

public class SetupController {
    public String setConversionRate(String currencySymbol, Double conversionFactor, Model model) {

        model.addAttribute(currencySymbol, conversionFactor);

        return "conversionRates";
    }
}
