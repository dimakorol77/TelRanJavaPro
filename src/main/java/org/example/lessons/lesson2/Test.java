package org.example.lessons.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {




      public static void main(String[] args) {
            int [] arr = new int[8];
            Random random = new Random();
            int res=0;
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=random.nextInt(0,10);
                if(arr[i]==8){
                    System.out.println("Нашел восьмерочку");
                }
            }

            for (int i = 0; i <arr.length ; i++) {
                res=res + arr[i];

            }
            System.out.println(Arrays.toString(arr));
            System.out.println(res);


        }
            }




//



