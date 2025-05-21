package String;

public class StringDemo {
    public static void main(String[] args) {

        String strName = "Viktor";
        String strLastname = new String("Nautilus");
        System.out.println(strName + " " + strLastname);

        //equals  сравнение строк

        String firstString = "Hello";
        var secondString = "hello";
        System.out.println("Is two strings equals : " + firstString.equals(secondString));
        System.out.println("Is two strings equals (ignoreCase) : " + firstString.equalsIgnoreCase(secondString)); //игнорирование регистра
        System.out.println();

        // получение размера строки

        System.out.println("The length of strLastname = "+strLastname.length());

        // получение подстроки

        String greeting = "Hello, World!";
        String substring= greeting.substring(7);
        System.out.println(substring);

        String substring2= greeting.substring(greeting.indexOf("o"),greeting.indexOf("d"));
        System.out.println(substring2);

        String substring3= greeting.substring(greeting.indexOf("o"),11);
        System.out.println(substring3);

    }
}
