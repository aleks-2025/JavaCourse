package Variables.operators;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 3;
        // оператор присваивания  =
        //b = a;

        // арифметические операторы

        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        a++; //инкремент (+1)
        a--; //декремент (-1)

        //a=a*4
        a += 4;
        b -= 2; // b-2
        a *= 4;
        b /= 3;

        //операции сравнения

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;


    }
}
