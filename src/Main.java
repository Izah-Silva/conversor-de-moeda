import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConversorDeMoeda conversor = new ConversorDeMoeda(3.45);

        System.out.print("Digite o valor em reais: ");
        String entrada = scanner.nextLine().replace(",", ".");

        try {
            double valorEmReais = Double.parseDouble(entrada);

            double valorConvertido = conversor.converterReaisParaDolares(valorEmReais);

            System.out.printf("Valor convertido em dólares: $%.2f%n", valorConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Erro: você digitou um valor inválido.");
        }

        scanner.close();
    }
}
