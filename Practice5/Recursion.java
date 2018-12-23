package Practice5;

import java.util.Scanner;

public class Recursion {
    public static void reverseInteger(int num) {
        if(num / 10 != 0)
        {
            System.out.println(num % 10);
            reverseInteger(num / 10);
        }
        else
            System.out.println(num);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Digits:");
        reverseInteger(num);
    }
}
