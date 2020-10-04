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
        if(denominator != 0) {
            double div = (double) numerator / denominator;
            return Math.round(div * 10.0) / 10.0;
        }
        return Double.NaN;
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
        int lNumerator;
        int lDenominator;
        Fraction result = null;

        if (this.getDenominator() != 0 && fraction.getDenominator() != 0) {
            result = new Fraction();
            if (this.getDenominator() == fraction.getDenominator()) {
                lNumerator = this.getNumerator() + fraction.getNumerator();
                lDenominator = this.getDenominator();
            } else {
                lNumerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
                lDenominator = this.getDenominator() * fraction.getDenominator();
            }
            result.setNumerator(lNumerator);
            result.setDenominator(lDenominator);
        }

        return result;
    }

    public Fraction multiply(Fraction fraction) {
        if (this.getDenominator() != 0 && fraction.getDenominator() != 0) {
            return new Fraction(this.getNumerator() * fraction.getNumerator(),
                    this.getDenominator() * fraction.getDenominator());
        } else {
            return null;
        }
    }

    public Fraction divide(Fraction fraction) {
        if (this.getDenominator() != 0 && fraction.getDenominator() != 0) {
            return new Fraction(this.getNumerator() * fraction.getDenominator(),
                    this.getDenominator() * fraction.getNumerator());
        } else {
            return null;
        }
    }

}
