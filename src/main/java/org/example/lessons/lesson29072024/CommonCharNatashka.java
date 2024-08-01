package org.example.lessons.lesson29072024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CommonCharNatashka {

        public static void main(String[] args) {
            String[] stringArr = {"cuk", "lu", "couolii", "alku", "callu", "culoo"};

            List<String> newList = Arrays.stream(stringArr)
                    .sorted(Comparator.comparingInt(String::length))
                    .toList();

            System.out.println(newList);

            HashSet<Character> commonCharsList = new HashSet<>();
            int minLengthSize = newList.get(0).length();


            for (int i = 0; i < minLengthSize; i++) {
                boolean isContains = true;
                char currentChar = newList.get(0).charAt(i);

                for (int j = 1; j < newList.size(); j++) {
                    if (newList.get(j).indexOf(currentChar) == -1) {
                        isContains = false;
                        break;
                    }
                }
                if (isContains) commonCharsList.add(currentChar);
            }

            System.out.println(commonCharsList);
        }
    }

