package Variables;

public class Variables {
    public static void main(String[] args) {
        // byte -128....127 (0...255)
        byte byteNumber = 127;
        System.out.println("The byte is : " + byteNumber);

        // short  -32768 ... 32767 (0...65535)
        short shortNumber = 32767;
        System.out.println("The short is : " + shortNumber);

        // int   -2147483648 ... 2147483647 (0... 4294967296)
        int intNumber = -2147483648;
        System.out.println("The int is : " + intNumber);

        //long  -9223372036854775808 ... 9223372036854775807 (0 ... 18446744073709551616)
        long longNumber = 9_223_372_036_854_775_807L;
        System.out.println("The long is : " + longNumber);
        System.out.println();

        // float  от 1.4e-45 до 3.4e+38
        float floatNumber = 3.145F;
        System.out.println("The float is : " + floatNumber);

        // double   от 4.9e-324 до 1.8e+308
        double doubleNumber = 34.1234567;
        System.out.println("The double is : " + doubleNumber);



        char charSymbol = 'A';
        System.out.println();
        System.out.println("The char is : " + charSymbol);

        boolean booleanVariable = true;
        System.out.println();
        System.out.println("The boolean is : " + booleanVariable);

        var variableNumber = 100L;
        System.out.println();
        System.out.println("The variable is : " + variableNumber);

        int first, second;
        first = 1;
        second = 2;

        // casting

        short varForCasting = byteNumber;
        System.out.println("After casting : " + varForCasting);

        int newVarCasting = varForCasting;
        System.out.println("After casting newVarCasting: " + newVarCasting);

        int newVariable = 6_000_012;
        byte newVarCast = (byte) newVariable;
        System.out.println("After casting int to byte : " + newVarCast);

        double doubleVar = 23.3456;
        int intVar = (int) doubleVar;
        System.out.println("After casting double to int : " + intVar);




    }
}