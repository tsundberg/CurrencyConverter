package se.sigma.education.automated.test;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<String, Long> conversionTable = new HashMap<String, Long>();

    public void setConversionFactor(String currency, Long lmu) {
        conversionTable.put(currency, lmu);
    }

    public static long getConversionFactor(String currency) {
        return conversionTable.get(currency);
    }
}
