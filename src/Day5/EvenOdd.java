package Day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Given a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
      //  int even = 0;
       // int odd = 0;
        if (number%2==0)
            System.out.println("Enter number is even");
        else
            System.out.println("Enter number is odd");
    }
}
