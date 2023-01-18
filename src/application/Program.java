package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int chosenNumber = sc.nextInt();

        System.out.println("Tabela de multiplicação de " + chosenNumber);

        for(int i = 1; i <= 10; i++) {
            int multiplication = i * chosenNumber;
            System.out.println(i + " x " + chosenNumber + " = " + multiplication);
        }

        sc.close();
    }
}
