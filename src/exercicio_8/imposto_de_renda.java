package exercicio_8;

import java.util.Locale;
import java.util.Scanner;

public class imposto_de_renda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
