package es.upm.miw.iwvg_devops;

import java.util.List;
import java.util.stream.Collector;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;
    private Fraction fraction;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(List<Fraction> fractions1) {
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

    public Fraction add(Fraction fraction) {
        int num= fraction.getNumerator();
        int den= fraction.getDenominator();
        int newNumerator=numerator*den + denominator*num;
        int newDenominator=denominator*den;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;

    }
    public Fraction multiply (Fraction fraction) {
        int num= fraction.getNumerator();
        int den= fraction.getDenominator();
        int newNumerator=numerator*num;
        int newDenominator=numerator*den;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;
    }
    public Fraction divide(Fraction fraction) {
        int num= fraction.getNumerator();
        int den= fraction.getDenominator();
        int newNumerator=numerator*den;
        int newDenominator=numerator*num;
        Fraction result = new Fraction(newNumerator,newDenominator);
        return result;

    }


    public boolean isProper(int numerator, int denominator) {
        return  numerator > denominator;
    }
    public boolean isImproper(int numerator, int denominator) {
        return  numerator < denominator;
    }
    public boolean isEquivalent(int numerator, int denominator) {
        return  numerator == denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }


}
