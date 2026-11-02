/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the operator:\n"
                + "1) add\n"
                + "2) subtract\n"
                + "3) multiply\n"
                + "4) divide\n"
                + "5) modulo\n");
        int operateur = sc.nextInt();

        System.out.print("Please enter the first number: ");
        int operande1 = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int operande2 = sc.nextInt();

        switch (operateur) {
            case 1:
                System.out.println("The result is: " + (operande1 + operande2));
                break;
            case 2:
                System.out.println("The result is: " + (operande1 - operande2));
                break;
            case 3:
                System.out.println("The result is: " + (operande1 * operande2));
                break;
            case 4:
                if (operande2 == 0) {
                    System.out.println("Error: division by zero.");
                } else {
                    System.out.println("The result is: " + (operande1 / operande2));
                }
                break;
            case 5:
                if (operande2 == 0) {
                    System.out.println("Error: modulo by zero.");
                } else {
                    System.out.println("The result is: " + (operande1 % operande2));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}
