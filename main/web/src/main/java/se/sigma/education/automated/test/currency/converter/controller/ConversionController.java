package se.sigma.education.automated.test.currency.converter.controller;

import se.sigma.education.automated.test.Converter;

public class ConversionController {
    public Integer convert(Integer amount, String from) {
        Integer conversionFactor = Converter.getConversionFactor(from);
        return amount * conversionFactor;
    }
}
