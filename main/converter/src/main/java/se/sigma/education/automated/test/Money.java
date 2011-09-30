package se.sigma.education.automated.test;

public class Money {
    private String currency;
    private Long amount;

    public Money(Long amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money money) {
        long conversionFactor = Converter.getConversionFactor(money.currency);
        amount = amount + (money.amount * conversionFactor);

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != null) {
            if (!amount.equals(money.amount)) return false;
        } else {
            if (money.amount != null) return false;
        }
        if (currency != null) {
            if (!currency.equals(money.currency)) return false;
        } else {
            if (money.currency != null) return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
