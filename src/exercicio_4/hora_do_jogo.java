package exercicio_4;

import java.util.Scanner;

public class hora_do_jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao <= 0) {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
