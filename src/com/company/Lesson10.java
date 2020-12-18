package com.company;

import com.company.less9.bookshelf.Book;
import com.company.less9.bookshelf.BookType;

public class Lesson10 {

    public static void main(String[] args) {
//        simpleStrings();
//        stringComparison();
//        printAlphabet();
        stringBuilderAndStringBuffer();
    }

    private static void simpleStrings() {
        char c = 't';
        String str = "Hello";
        str = str.concat(" world");
        System.out.println(str);
        boolean b = true;
        final Book book = new Book("War and peace", "Tolstoy", BookType.SCIENCE);
        String valueOfBoolean = String.valueOf(book);
        System.out.println(valueOfBoolean);
        char c1 = str.toCharArray()[0];
        System.out.println(str.charAt(0));
        String city1 = "Minsk";
        String city2 = "miNsK1";
        boolean isEquals = city1.equalsIgnoreCase(city2);
        System.out.println(isEquals);
        System.out.println(city2.toLowerCase());
        System.out.println(city2.toUpperCase());
        System.out.println(System.getProperty("user.language"));
        char symbol = '\u0130';
        Integer integer = Integer.valueOf(symbol);
        System.out.println(integer);
        System.out.println(city1.length());
        String city3 = " Minsk is beautiful\n";
        System.out.println(city3);
        System.out.println(city3.length());
        String city4 = city3.trim();
        System.out.println(city4);
        System.out.println(city4.length());
        String replacedString = city4.replaceAll("i", "I");
        System.out.println(replacedString);
        String names = "  Alena,Alice,alina,albina,Anastasya,ALLA,ArinA  ";
        String[] arrayOfNames = names.trim().split(",");
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        String strB = "z";
        strB = "gf";
        String strC = "А";
        System.out.println(strB.compareTo(strC));
        String country = "Belarus";
        int firstMatch = country.indexOf("r");
        System.out.println(firstMatch);
        boolean isStartsWith = country.endsWith("Bel");
        System.out.println(isStartsWith);
        String subString = country.substring(3);
        System.out.println(subString);
    }

    private static void stringComparison() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String(s3);

        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2));
        System.out.println(s3 + "==" + s4 + " : " + (s3 == s4));
        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3));
        System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3));
    }

    private static void printAlphabet() {
        char startSymbol = 'A';
        char endSymbol = 'z';
        int startIndex = startSymbol;
        int endIndex = endSymbol;
        for (int i = startIndex; i <= endIndex; i++) {
            String value = String.valueOf((char) i);
            System.out.println(value);
        }
    }

    private static void stringBuilderAndStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder(120);
        stringBuilder.trimToSize();
        System.out.println("Строка -> " + stringBuilder);
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println("Размер -> " + stringBuilder.capacity());
        stringBuilder.append("Java");
        System.out.println("Строка -> " + stringBuilder);
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println("Размер -> " + stringBuilder.capacity());
        String s = stringBuilder.toString();
        stringBuilder.append("Internationalization");
        System.out.println("Строка -> " + stringBuilder);
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println("Размер -> " + stringBuilder.capacity());
        System.out.println(stringBuilder.reverse());
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("Internationalization");
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println("Размер -> " + stringBuilder.capacity());
        System.out.println("trim to size");
        stringBuilder.trimToSize();
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println("Размер -> " + stringBuilder.capacity());
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            str += "1";
        }
        // 4222
        System.out.println(str);
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(3800/8);
        System.out.println(stringBuilder);
        System.out.println("Длина -> " + stringBuilder.length());
        System.out.println(stringBuilder);
        System.out.println("Длина -> " + stringBuilder.length());

        String s1 = "Apple\n" +
                "Pie\n" +
                "Carrot\n";
    }

}
