package Day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double harmonicSum=0.0;

        for (int i=1;i<=count;i++){
            if (i<count)
                System.out.print("1/"+i+" + ");
            else
                System.out.print("1/"+i);
            harmonicSum += 1f/i;
        }
        System.out.println();
        System.out.print(harmonicSum);
    }
}
