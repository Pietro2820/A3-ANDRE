package PodeSerUsado;

import java.util.Scanner;

public class EscolhaDaMateria {
    Scanner entrada = new Scanner(System.in);

    public String cursos() {
        System.out.println("""
                ==============Matérias====================
                
                Escolha uma área do ENEM:
                [1] Linguagens, Códigos e suas Tecnologias
                [2] Matemática e suas Tecnologias
                [3] Ciências Humanas e suas Tecnologias
                [4] Ciências da Natureza e suas Tecnologias
                [5] Redação
                
                ===========================================
                """);

        int escolha = -1;
        try {
            escolha = entrada.nextInt();
        } catch (Exception e) {
            System.err.println("Entrada inválida. Digite um número de 1 a 5.");
            entrada.nextLine(); // limpa buffer
            return cursos(); // tenta novamente
        }

        switch (escolha) {
            case 1:
                return "Linguagens, Códigos e suas Tecnologias" ;
            case 2:
                return "Matemática e suas Tecnologias";
            case 3:
                return "Ciências Humanas e suas Tecnologias";
            case 4:
                return "Ciências da Natureza e suas Tecnologias";
            case 5:
                return "Redação";
            default:
                System.err.println("Opção inválida. Tente novamente.");
                return cursos();
        }
    }
}
