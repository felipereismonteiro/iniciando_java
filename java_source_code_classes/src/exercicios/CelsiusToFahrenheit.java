package exercicios;

public class CelsiusToFahrenheit {
 public static void main(String[] args) {
  int temperatura = 32;
  double converted = (temperatura * 1.8) + 32;

  int integerConverted = (int) (temperatura * 1.8) + 32;
  System.out.println("Converted Fahrenheit: " + converted);
  System.out.println("Converted without decimals: " + integerConverted);
 }
}