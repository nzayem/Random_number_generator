package com.nzayem.training;

import java.util.Scanner;

public class RandomCode {

    public static void main(String[] args) {

        System.out.println("Enter the code's length: ");

        Scanner scanner = new Scanner(System.in);

        int codeSize = scanner.nextInt();

        scanner.close();

        if (codeSize > 10) {

            System.out.println("Error: can't generate a number with a length higher than 10 " +
                    "because there aren't enough unique digits.");

        } else {

            String ranCode = generateCode(codeSize);

            System.out.printf("Your pseudo random number: %s", ranCode);

        }

    }

    private static String generateCode(int sizeCode) {

        StringBuilder codeStr = new StringBuilder();

        while (codeStr.length() != sizeCode) {

            int digit = (int) (Math.random() * 10);

            // To generate a random number with unique digits:

            if (!String.valueOf(codeStr).contains(String.valueOf(digit))) {

                codeStr.append(digit);

            }

        }

        // To have a code without a leading zero:

        if (codeStr.charAt(0) == '0') {

            codeStr.replace(0, 0, String.valueOf((int) (Math.random() * 9 + 1)));

        }

        return codeStr.toString();

    }
}
