package Day5;

import java.util.Scanner;

public class LargestAmong3Num {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 =sc.nextInt();
        System.out.println("Enter Second Number: ");
        n2 =sc.nextInt();
        System.out.println("Enter Third Number: ");
        n3 =sc.nextInt();

       // Scanner sc = new Scanner(System.in);
        if (n1>n2 && n1>n3){
            System.out.println("largest among three num: " +n1);
        }
        else if (n2>n1 && n2>n3){
            System.out.println("largest among three num: " +n2);
        }
            else
            System.out.println("largest among three num: " +n3);
    }
}
