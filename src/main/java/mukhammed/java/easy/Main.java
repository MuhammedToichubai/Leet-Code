package mukhammed.java.easy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: 9/9/23  Task: 1
        System.out.println(addDigits(new Scanner(System.in).nextInt()));
        System.out.println(addDigits(new Scanner(System.in).nextInt()));

    }

    // TODO: option 1
    public static int addDigits(int num) {
        if (0 <= num) {
            if (num >= 10) {
                do {
                    int firstNumber = num / 10;
                    int secondNumber = num % 10;
                    num = firstNumber + secondNumber;
                }
                while (num >= 10);
            }
        }
        return num;
    }

    // TODO: option 2
    public static int addDigits(Integer num){
        if (num < 10) return num;
        int newNum = 0;
        while (num > 0){
            newNum += (num % 10);
            num /= 10;
        }
        return newNum < 10 ? newNum : addDigits(newNum);
    }


}
