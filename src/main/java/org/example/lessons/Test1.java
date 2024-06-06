package org.example.lessons;

public class Test1 {
    public static void main(String[] args) {
        // 14: Найдите строку в массиве, содержащую наибольшее количество гласных.
        String[] str = {"Dima", "Dina", "Inna", "Anutka", "Afanasiy"};
        String letters = "aeiouyAEIOUY";
        int maxVowels = 0;
        String maxVowelsString = "";

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int k = 0; k < str[i].length(); k++) {
                if (letters.contains(String.valueOf(str[i].charAt(k)))) {
                    count++;
                }
            }
            if (count > maxVowels) {
                maxVowels = count;
                maxVowelsString = str[i];
            }
        }

        System.out.println("Строка с наибольшим количеством гласных: " + maxVowelsString);
        System.out.println("Количество гласных: " + maxVowels);
    }
}
