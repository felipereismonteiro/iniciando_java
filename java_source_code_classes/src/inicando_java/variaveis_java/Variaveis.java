package java_source_code_classes.src.inicando_java.variaveis_java;

public class Variaveis {
 public static void main(String[] args) {
  final byte byteValue = 1; // -128, 127
  final short shortValue = 2; // -32.768, 32.767
  final int intValue = 4; // -2.147.483.648, 2.147.483.647
  final long longValue = 8; // -9.223.372.036.854.775.808, 9.223.372.036.854.775.807

  final float floatValue = 4; // -3,4028E + 38, 3,4028E + 38
  final double doubleValue = 8; // -1,7976E + 308, 1,7976E + 308

  final String stringValue = "valor"; // char[] varios bytes
  final char charValue = 'c'; // char 1 byte

  final boolean booleanValue = true; // true || false

  String textBlocks = """
    Using this
    i can
    jump
    line
    """; // we can use this to concat + typeof number

  System.out.println();
 }
}