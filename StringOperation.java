package Pertemuan9dan10.ControlStatementProject;

import java.util.*;

public class StringOperation {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "Lisa";
        String string3 = ""; // null

        string3 = "How are you ".concat(string2);
        System.out.println("String3: " + string3);
        // get length
        System.out.println("Length: " + string3.length());
        System.out.println("Sub: " + string3.substring(0,5));
        System.out.println("Upper: " + string3.toUpperCase());

        String string4 = "How are you " + string2;
        System.out.println("String4: " + string4);
        System.out.println("String: " + (string1 += string2));
        System.out.println(string2.indexOf('a'));
        System.out.println(string2.charAt(2));

        String s1 = "abc";
        String s2 = "cde";
        System.out.println(s2.compareTo(s1));

        s1 = "abc";
        s2 = "ABC";
        System.out.println(s1.equals(s2));

    }
}