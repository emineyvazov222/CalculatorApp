package org.spring;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        calculateApp();

    }

    public static void calculateApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emeliyyati secin: " +
                "\n 1 - toplama" +
                "\n 2 - cixma" +
                "\n 3 - vurma" +
                "\n 4 -bolme" +
                "\n");
        int operation = sc.nextInt();
        if (operation < 1 || operation > 4) {
            flowExceptions();
        } else {
            selecetOperations(operation);
        }

    }

    public static void selecetOperations(int operation) {

        if (operation == 1) {
            operation1();
        } else if (operation == 2) {
            operation2();
        } else if (operation == 3) {
            operation3();
        } else {
            operation4();
        }
    }

    public static void flowExceptions() {
        throw new IllegalArgumentException("Emeliyyati sehv daxil etmisiniz");

    }

    public static void operation1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        topla(num1, num2);

    }

    public static void operation2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        cixma(num1, num2);

    }

    public static void operation3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        vurma(num1, num2);

    }

    public static void operation4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        bolme(num1, num2);

    }

    public static void topla(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void cixma(int num1, int num2) {
        int subtract = num1 - num2;
        System.out.println("Subtract: " + subtract);
    }

    public static void vurma(int num1, int num2) {
        int times = num1 * num2;
        System.out.println("Times: " + times);
    }

    public static void bolme(double num1, double num2) {
        double devidedBy = num1 / num2;
        System.out.println("DevidedBy: " + devidedBy);
    }
}
