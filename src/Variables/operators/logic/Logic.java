package Variables.operators.logic;

public class Logic {
    public static void main(String[] args) {

        int a = 10, b = 3;

        boolean aIsGreaterB = a > b;
        boolean aIsEqualB = a == b;

        boolean logicalAND = aIsGreaterB && aIsEqualB; // false
        boolean logicalOR = aIsGreaterB || aIsEqualB; // true

        System.out.println("The result of expression 10>3 AND 10==3 is : "+logicalAND);
        System.out.println("The result of expression 10>3 OR 10==3 is : "+logicalOR);

    }
}
