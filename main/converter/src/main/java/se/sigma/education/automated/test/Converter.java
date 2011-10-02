package se.sigma.education.automated.test;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<String, Integer> conversionTable = new HashMap<String, Integer>();

    public static Integer getConversionFactor(String currencySymbol) {
        return conversionTable.get(currencySymbol);
    }

    public static void setConversionFactor(String currencySymbol, Integer conversionFactor) {
        conversionTable.put(currencySymbol, conversionFactor);
    }

    public static Integer convert(String from, Integer amount) {
        Integer conversionFactor = getConversionFactor(from);
        return amount * conversionFactor;
    }
}
