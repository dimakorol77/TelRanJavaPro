//package org.example.lessons.lesson8;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class User11 {
//    // написать метод который принимает 2 числа, делит диапазон между ними на каждое из своих цифр
//    //если делится на каждое число без остатка - добавить в arraylist
//    public List<Integer> isDev(int firstNum, int secondNum) {
//        boolean flag;
//        for (int i = firstNum; i < secondNum; i++) {
//            String strNumber = String.valueOf(Math.abs(i));
//            flag = true;
//            for (int j = 0; j < strNumber.length(); j++) {
//                int elem = Integer.parseInt(String.valueOf(strNumber.charAt(j)));
//                if (elem == 0) {
//                    continue;
//                }
//
//                if (i % elem != 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//             //   list.add(i);
//            }
//        }
//
//       // return listNum;
//  //  }
//}
//     //   return list;
//
//    }
////}

