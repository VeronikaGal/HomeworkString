package com.galeeva.homework;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int sum = sum(getFigures(value));
        System.out.println(sum);
    }

    public static int[] getFigures(String value) {
        int index = 0;
        String s = new String();
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                s += (value.charAt(i));
                index++;
            }
        }
        char[] chars1 = s.toCharArray();
        int[] ints = new int[index];
        for (int i = 0; i < chars1.length; i++) {
            ints[i] = Character.getNumericValue(chars1[i]);
        }
        return ints;
    }

    public static int sum(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }
}

