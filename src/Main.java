import java.util.Locale;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int hora;
//
//        hora = sc.nextInt();
//
//        if (hora < 12) {
//            System.out.println("Bom dia");
//        }
//        else if (hora < 18) {
//            System.out.println("Boa tarde");
//        }
//        else {
//            System.out.println("Boa noite");
//            }
//
//        }
//    }

//public class Main {
//    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int minutos = sc.nextInt();
//
//        double conta = 50.0;
//
//        if (minutos > 100) {
//            conta = conta + (minutos - 100) * 2.0; // conta += (minutos - 100) * 2.0;
//        }
//
//        System.out.printf("Valor da conta = R$ %.2f%n", conta);
//
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        String dia;
//        switch (x) {
//            case 1:
//                dia = "domingo";
//                break;
//            case 2:
//                dia = "segunda";
//                break;
//            case 3:
//                dia ="terca";
//                break;
//            case 4:
//                dia = "quarta";
//                break;
//            case 5:
//                dia = "quinta";
//                break;
//            case 6:
//                dia = "sexta";
//                break;
//            case 7:
//                dia = "sabado";
//                break;
//            default:
//                dia = "valor invalido";
//                break;
//        }
//        System.out.println("Dia da semana: " + dia);
//        sc.close();
//    }
//}
//

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}