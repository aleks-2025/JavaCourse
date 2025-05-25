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

        System.out.println("The length of strLastname = " + strLastname.length());

        // получение подстроки

        String greeting = "Hello, World!";
        String substring = greeting.substring(8);
        System.out.println(substring);

        String substring2 = greeting.substring(greeting.indexOf("o"), greeting.indexOf("d"));
        System.out.println(substring2);

        String substring3 = greeting.substring(greeting.indexOf("o"), 11);
        System.out.println(substring3);

        // проверка наличия подстроки

        System.out.println("Строка содержит \"World\" : " + greeting.contains("World"));
        System.out.println("Строка содержит \"world\" : " + greeting.contains("world"));

        String greetingWithUpperCase = greeting.toUpperCase();
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println(greetingWithLowerCase);
        System.out.println(greetingWithUpperCase);

        System.out.println("Строка содержит \"WORLD\" : " + greetingWithLowerCase.contains("WORLD"));
        System.out.println();

        // удаление пробелов (trim)

        var login = "    Nautilus-22    ";
        System.out.println("login : " + login);
        String loginAfterTrim = login.trim();
        System.out.println("loginAfterTrim : " + loginAfterTrim);

        // замена символа replace()

        var loginAfterReplace = login.trim().replace("-", "__");
        System.out.println("loginAfterReplace : " + loginAfterReplace);
        System.out.println();
        StringBuilder sb = new StringBuilder("   Hello, ");
        sb.append("Viktor");
        sb.append(" ");
        sb.append("Nautilus!");
        System.out.println(sb);


    }
}
