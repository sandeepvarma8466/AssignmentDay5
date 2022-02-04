package Day5;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Alphabet:");
        Scanner sc = new Scanner(System.in);
        //char Alphabet = (char)sc.nextInt();
        ch=sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.print("Vowel");
        } else {
            System.out.print("Consonant");
        }

    }
}

