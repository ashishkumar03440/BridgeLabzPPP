public class TypeConversion {
    public static void main(String[] args) {
        // Implicit conversion (widening)
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Implicit conversion from int to double: " + doubleValue);

        // Explicit conversion (narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue;
        System.out.println("Explicit conversion from double to int: " + anotherIntValue);
        // String to int conversion
        String numberString = "123";
        int stringToInt = Integer.parseInt(numberString);
        System.out.println("String to int conversion: " + stringToInt);
        // int to String conversion
        int anotherNumber = 456;
        String intToString = Integer.toString(anotherNumber);
        System.out.println("int to String conversion: " + intToString);
    }
    
}
