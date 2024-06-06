package org.example.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Listik {
    public static void main(String[] args) {
       List<Integer> list = List.of(1,2,3,4,5);
        System.out.println(reverseList(list));
    }


    public static List<Integer> reverseList(List<Integer> firstList) {
        List<Integer> startList = new ArrayList<>();
        List<Integer> endList = new ArrayList<>();
        List<Integer> ex = new ArrayList<>();



        if (firstList.size() % 2 == 0) {
            for (int i = 0; i < firstList.size() / 2; i++) {
                ex.add(i, firstList.get(i));
            //    startList.add(firstList.get(i));
            }
            for (int i = firstList.size()/2, j=0 ; i < firstList.size(); i++, j++) {
                ex.add(j, firstList.get(i));

              //  endList.add(firstList.get(i));
            }

        } else {
            for (int i = 0; i < firstList.size()/2; i++) {
                ex.add(i, firstList.get(i));

            }


            for (int i = firstList.size()/2+1, j=0; i < firstList.size(); i++,j++) {

                ex.add(j, firstList.get(i));
            }
            ex.add(firstList.size()/2, firstList.get(firstList.size()/2 ));
//
        }

        return ex;
    }
}


