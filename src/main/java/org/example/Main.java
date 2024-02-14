package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int containsInFibo = scanner.nextInt();

        if (verifyFibonnaci(containsInFibo)) {
            System.out.println(containsInFibo + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(containsInFibo + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verifyFibonnaci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int before = 0;
        int actual = 1;

        while (actual < number) {
            int next = before + actual;
            before = actual;
            actual = next;

            if (actual == number) {
                return true;
            }
        }
        return false;
    }
}