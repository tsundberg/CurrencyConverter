package se.sigma.education.automated.test.currency.converter.controller;

import org.springframework.ui.Model;
import se.sigma.education.automated.test.Converter;

public class ConversionController {
    public String convert(Integer amount, String from, Model model) {
        Integer conversionFactor = Converter.getConversionFactor(from);

        String conversionResult = "result";
        Integer convertedValue = amount * conversionFactor;
        model.addAttribute(conversionResult, convertedValue);

        return "conversionResult";
    }
}
