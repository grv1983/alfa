package ua.alfabank.work12;
import java.util.Scanner;

import static java.lang.System.*;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter the your name: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // System.out.println("My name is "+line);
        System.out.print("My name is ");
        System.err.println(line);
    }
}
