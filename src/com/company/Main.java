package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner card = new Scanner(System.in);
        System.out.print("Please enter your card number: ");
        long number = card.nextLong();
        card.close();

        String numstring = Long.toString(number);

        int[] d = new int[numstring.length()];
        for (int i = numstring.length() - 1; i > -1; i--)
        {
            int digit = numstring.charAt(i) - '0';
            d[numstring.length() - 1 - i] = digit;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < d.length; i++) {
            if (i % 2 != 0) {
                int j = d[i] * 2;
                int total = 0;
                while (j != 0) {
                    total = total +j % 10;
                    j = j / 10;
                }
                sum1 += total;
            } else {
                sum2 += d[i];
            }
        }
        boolean valid = false;
        int totalsum = sum1 + sum2;
        if (totalsum % 10 == 0)
        {
            valid = true;
        }
        if (valid) {
            if ((numstring.length() == 15) && numstring.startsWith("34") || (numstring.length() == 15) && numstring.startsWith("37"))
                System.out.println("Amex");
            if ((numstring.length() == 16) && (numstring.startsWith("51")
                    || numstring.startsWith("52") || numstring.startsWith("53")
                    || numstring.startsWith("54") || numstring.startsWith("55"))) {
                System.out.println("Mastercard");
            } else if (((numstring.length() == 15))
                    && (numstring.startsWith("4"))) {
                System.out.println("Visa");
            } else {
                System.out.println("Invalid Card Number. Try Again");
            }
        }

        }}







