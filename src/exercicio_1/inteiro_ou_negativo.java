package exercicio_1;

import java.util.Scanner;

public class inteiro_ou_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
