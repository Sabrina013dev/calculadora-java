import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class CalculadoraJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valueUm;
        Double valueDois;
        String operacao;
        boolean continuar;

        try {
            do {
                System.out.println("Digite o valor um: ");
                valueUm = scanner.nextDouble();

                System.out.println("Digite a operação( +, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valueDois = scanner.nextDouble();

                System.out.println("Resultado: " + realizarCalculo(valueUm, valueDois, operacao));

                continuar = analizarNovaOperacao();
            } while (continuar);
        } catch (InputMismatchException ex) {
            System.out.println("Os valores para calculo devem ser numéricos =)");
        }
    }

    public static boolean analizarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double resposta = 0.0;

        switch (operacao) {
            case "+":
                resposta = valorUm + valorDois;
                break;
            case "-":
                resposta = valorUm - valorDois;
                break;
            case "*":
                resposta = valorUm * valorDois;
                break;
            case "/":
                resposta = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação é inválida =(");
        }

        return resposta;
    }
}
