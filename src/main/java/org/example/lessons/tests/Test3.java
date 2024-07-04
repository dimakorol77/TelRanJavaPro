package org.example.lessons.tests;

public class Test3 {
    public static void main(String[] args) {
        //проерить строку на уникальные значения
        String s = "Aaabbcdakdlsalk";
        System.out.println(new Test3().uniqueCharsChecker(s));
    }




    public boolean uniqueCharsChecker (String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (s.indexOf(currentChar) != s.lastIndexOf(currentChar)) {
                return false; // Если текущий символ встречается более одного раза
            }
        }

        return true;
    }
}

