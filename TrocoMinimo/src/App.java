import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total para o troco: ");
        int valorTroco = scanner.nextInt();

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 }; // Valores em centavos

        System.out.println("Notas e moedas necessárias para o troco de " + valorTroco + ":");

        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = valorTroco / notas[i];
            valorTroco %= notas[i];
            System.out.println("Notas de " + notas[i] + ": " + quantidadeNotas);
        }

        for (int i = 0; i < moedas.length; i++) {
            int quantidadeMoedas = valorTroco / moedas[i];
            valorTroco %= moedas[i];
            System.out.println("Moedas de " + (moedas[i] / 100.0) + ": " + quantidadeMoedas);
        }

        scanner.close();
    }
}
