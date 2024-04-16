package br.com.collections1.carlosDavi;

import java.util.Arrays;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação de entrada do usuário
        System.out.println("Digite as informações separadas por vírgula:");

        // Lê a entrada do usuário
        String input = scanner.nextLine();

        // Divide a entrada em partes usando a vírgula como delimitador
        String[] parts = input.split(",");

        // Ordena as partes em ordem alfabética
        Arrays.sort(parts);

        // Exibe as informações coletadas ordenadas
        System.out.println("As informações coletadas em ordem alfabética são:");
        for (String part : parts) {
            System.out.println(part.trim()); // trim() remove os espaços em branco extras
        }

        // Fecha o scanner
        scanner.close();
    }
}