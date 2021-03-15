package aplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int combustivel = sc.nextInt();

        while (combustivel != 4) {
            if (combustivel >= 1 && combustivel <= 3) {
                switch (combustivel) {
                    case 1:
                        ++alcool;
                        break;
                    case 2:
                        ++gasolina;
                        break;
                    case 3:
                        ++diesel;
                        break;
                }
            }
            combustivel = sc.nextInt();
        }

        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
