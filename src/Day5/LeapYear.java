package Day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the value of Year: ");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();

        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0){
            System.out.println("Leaf Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
