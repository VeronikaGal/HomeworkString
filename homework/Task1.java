package com.galeeva.homework;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */
public class Task1 {

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        StringBuilder result = remove(value);
        System.out.println(result);
    }

    public static StringBuilder remove(String value) {
        String replace = value.toUpperCase().replace(" ", "");
        StringBuilder sb = new StringBuilder(replace);
        for (int i = 1; i < sb.length(); i++) {
            String s = String.valueOf(sb.charAt(i - 1));
            while (sb.indexOf(s, i) != -1) {
                sb.deleteCharAt(sb.indexOf(s, i));
            }
        }
        return sb;
    }
}




