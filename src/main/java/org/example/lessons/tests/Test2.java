package org.example.lessons.tests;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().divideByElements(33));
    }




    public List<Integer> divideByElements(int a) {
        List<Integer> res = new ArrayList<>();
        int original = a;  // Store the original number

        boolean divisible = true;

        // Loop to check each digit
        while (a != 0) {
            int digit = a % 10;  // Get the last digit
            // Skip zero digits as division by zero is not defined
            if (digit == 0 || original % digit != 0) {
                divisible = false;
                break;
            }
            a /= 10;  // Remove the last digit
        }

        if (divisible) {
            res.add(original);
        }

        return res;
    }
}
