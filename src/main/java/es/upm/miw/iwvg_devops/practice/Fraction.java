package es.upm.miw.iwvg_devops.practice;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public boolean isProper() {
        return this.getNumerator() < this.getDenominator();
    }

    public boolean isImproper() {
        return !this.isProper();
    }

    public boolean isEquivalent(Fraction fraction) {
        return this.decimal() == fraction.decimal();
    }

    public Fraction add(Fraction fraction) {
        int l_numerator;
        int l_denominator;
        Fraction result = new Fraction();

        assert this.getDenominator() != 0 && fraction.getDenominator() != 0;

        if (this.getDenominator() == fraction.getDenominator()) {
            l_numerator = this.getNumerator() + fraction.getNumerator();
            l_denominator = this.getDenominator();
        } else {
            l_numerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
            l_denominator = this.getDenominator() * fraction.getDenominator();
        }
        result.setNumerator(l_numerator);
        result.setDenominator(l_denominator);

        return result;
    }

    public Fraction multiply(Fraction fraction) {
        assert this.getDenominator() != 0 && fraction.getDenominator() != 0;

        return new Fraction(this.getNumerator() * fraction.getNumerator(),
                this.getDenominator() * fraction.getDenominator());
    }

    public Fraction divide(Fraction fraction) {
        assert this.getDenominator() != 0 && fraction.getDenominator() != 0;

        return new Fraction(this.getNumerator() * fraction.getDenominator(),
                this.getDenominator() * fraction.getNumerator());
    }

}
