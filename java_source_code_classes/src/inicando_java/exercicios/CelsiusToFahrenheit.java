package java_source_code_classes.src.inicando_java.exercicios;

public class CelsiusToFahrenheit {
 public static void main(String[] args) {
  int temperatura = 32;
  double converted = (temperatura * 1.8) + 32;

  int integerConverted = (int) (temperatura * 1.8) + 32;
  System.out.println("Converted Fahrenheit: " + converted);
  System.out.println("Converted without decimals: " + integerConverted);
 }
}