package br.com.collections1.carlosDavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] pessoas;
        ArrayList<String> masculino  = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes: ");
        String input = scanner.nextLine();
        pessoas = input.split(",");

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].endsWith("- M")) {
                masculino.add(pessoas[i]);
            }else if (pessoas[i].endsWith("- F")) {
                feminino.add(pessoas[i]);
            }
        }

        System.out.println("<============ Lista masculinos ============>");

        for (int i = 0; i < masculino.size(); i++) {
            System.out.println(masculino.get(i).trim());
        }
        System.out.println("<============ Lista femininos ============>");

        for (int i = 0; i < feminino.size(); i++) {
            System.out.println(feminino.get(i).trim());
        }

    }
}