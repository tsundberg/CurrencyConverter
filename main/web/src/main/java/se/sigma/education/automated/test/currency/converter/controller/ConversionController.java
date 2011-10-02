package se.sigma.education.automated.test.currency.converter.controller;

import org.springframework.ui.Model;
import se.sigma.education.automated.test.Converter;

public class ConversionController {
    public String convert(Integer amount, String from, Model model) {
        Integer convertedValue = Converter.convert(from, amount);

        String conversionResult = "result";
        model.addAttribute(conversionResult, convertedValue);

        return "conversionResult";
    }
}
