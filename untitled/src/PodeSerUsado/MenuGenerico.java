package PodeSerUsado;

import java.util.List;
import java.util.Scanner;

public class MenuGenerico {
    private List<String> opcoes;
    private Scanner scanner = new Scanner(System.in);

    public MenuGenerico(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public int mostrarESelecionar() {
        while (true) {
            System.out.println("Escolha uma opção:");

            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + opcoes.get(i));
            }
            System.out.println("[0] Sair");

            int escolha = -1;
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
                continue;
            }

            if (escolha >= 0 && escolha <= opcoes.size()) {
                return escolha;
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}

