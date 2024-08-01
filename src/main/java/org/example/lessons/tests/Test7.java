package org.example.lessons.tests;




public class Test7 {
    //Верните количество гласных в данной строке.
    //
    //Для этой задачи мы будем считать гласными буквы a, e, i, o, u (но не y).
    //
    //Входная строка будет состоять только из строчных букв и/или пробелов.
    public static void main(String[] args) {
        String s = "saaaa";
        System.out.println(getCount(s));
    }

    public static int getCount(String str) {
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count= count+ 1;
            }
        } return count;
    }

    }

