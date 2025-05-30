import PastaCursos.Curso;
import PastaCursos.Materia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Limpador limpador = new Limpador();
        ArrayList<Curso> curso = new ArrayList<Curso>();
        Scanner entrada = new Scanner(System.in);

        // Português =====================================================================
        ArrayList<Materia> materiasPortugues = new ArrayList<Materia>();
        materiasPortugues.add(new Materia(" Funções de Linguagem", new ArrayList<String>(Arrays.asList(
                " Referencial",
                " Emotiva",
                " Conativa",
                " Fática",
                " Metalinguística",
                " Poética"))));
        materiasPortugues.add(new Materia(" Figuras de linguagem", new ArrayList<String>(Arrays.asList(
                " Metáfora",
                " Metonímia",
                " Antítese",
                " Paradoxo",
                " Ironia",
                " Hipérbole",
                " Prosopopeia"))));
        materiasPortugues.add(new Materia(" Interpretação de textos", new ArrayList<String>(Arrays.asList(
                " Compreensão e inferência",
                " Intenção comunicativa",
                " Análise de discurso",
                " Elementos linguísticos e extralinguísticos"))));
        materiasPortugues.add(new Materia(" Gêneros textuais", new ArrayList<String>(Arrays.asList(
                " Artigo de opinião",
                " Charge",
                " Tira",
                " Propaganda",
                " Poema",
                " Notícia",
                " Crônica",
                " Resenha"
        ))));
        materiasPortugues.add(new Materia(" Norma culta vs. linguagem coloquial", new ArrayList<String>(Arrays.asList(
                " Diferenças estruturais",
                " Adequação ao contexto",
                " Variedades linguísticas"
        ))));
        materiasPortugues.add(new Materia(" Gramática ", new ArrayList<String>(Arrays.asList(
                " Ortografia",
                " Pontuação",
                " Crase",
                " Concordância verbal e nominal",
                " Regência verbal e nominal",
                " Colocação pronominal",
                " Pronomes, verbos, substantivos, adjetivos, advérbios"
        ))));

        // Redação =======================================================

        ArrayList<Materia> materiasRedacao = new ArrayList<Materia>();

        materiasRedacao.add(new Materia(" Estrutura da Redação Dissertativo-Argumentativa", new ArrayList<String>(Arrays.asList(
                " Introdução: apresentação do tema e tese",
                " Desenvolvimento: argumentos e contra-argumentos",
                " Conclusão: proposta de intervenção"
        ))));

        materiasRedacao.add(new Materia(" Competências Avaliadas no ENEM", new ArrayList<String>(Arrays.asList(
                " Domínio da norma padrão da língua escrita",
                " Compreensão da proposta e aplicação dos conhecimentos",
                " Seleção e organização de argumentos",
                " Coesão e coerência textual",
                " Proposta de intervenção respeitando os direitos humanos"
        ))));

        materiasRedacao.add(new Materia(" Tipos de Argumentação", new ArrayList<String>(Arrays.asList(
                " Argumento de autoridade",
                " Argumento por exemplificação",
                " Argumento lógico",
                " Comparação e analogia"
        ))));

        materiasRedacao.add(new Materia(" Proposta de Intervenção", new ArrayList<String>(Arrays.asList(
                " Ação",
                " Agente",
                " Modo de execução",
                " Efeito esperado",
                " Detalhamento e viabilidade"
        ))));

        materiasRedacao.add(new Materia(" Dicas para Redação Nota 1000", new ArrayList<String>(Arrays.asList(
                " Planejamento antes de escrever",
                " Evitar clichês e frases prontas",
                " Cuidar da progressão textual",
                " Revisar o texto final"
        ))));


        // Matemática ===============================================================
        ArrayList<Materia> materiasMatematica = new ArrayList<Materia>();
        materiasMatematica.add(new Materia(" Aritmética", new ArrayList<String>(Arrays.asList(
                " operações",
                "porcentagem",
                " razão",
                " proporção"))));
        materiasMatematica.add(new Materia(" Álgebra", new ArrayList<String>(Arrays.asList(
                " equações do 1º",
                " equações do 2º",
                " inequações",
                " sistemas lineares"))));
        materiasMatematica.add(new Materia(" Funções", new ArrayList<String>(Arrays.asList(
                " afim",
                " quadrática",
                " exponencial",
                " logarítmica"))));
        materiasMatematica.add(new Materia(" Geometria", new ArrayList<String>(Arrays.asList(
                " plana",
                " espacial",
                " analítica"))));
        materiasMatematica.add(new Materia(" Trigonometria básica", new ArrayList<String>(Arrays.asList(
                " oi",
                " oi"))));
        materiasMatematica.add(new Materia(" Estatística e probabilidade", new ArrayList<String>(Arrays.asList(
                " média",
                " mediana",
                " moda",
                " gráficos",
                " tabelas"))));
        materiasMatematica.add(new Materia(" Problemas envolvendo raciocínio lógico e interpretação", new ArrayList<String>(Arrays.asList(
                " oi",
                " oi"))));

        // Humanas =====================================================================================

        ArrayList<Materia> materiasHumanas = new ArrayList<Materia>();

        materiasHumanas.add(new Materia(" História do Brasil", new ArrayList<String>(Arrays.asList(
                " Brasil Colônia",
                " Brasil Império",
                " Brasil República"
        ))));

        materiasHumanas.add(new Materia(" Ditadura Militar e Redemocratização", new ArrayList<String>(Arrays.asList(
                " Golpe de 1964",
                " Regime Militar",
                " Processo de redemocratização"
        ))));

        materiasHumanas.add(new Materia(" História Geral", new ArrayList<String>(Arrays.asList(
                " Antiguidade",
                " Idade Média",
                " Idade Moderna",
                " Idade Contemporânea"
        ))));

        materiasHumanas.add(new Materia(" Revoluções", new ArrayList<String>(Arrays.asList(
                " Revoluções Industriais",
                " Revoluções Francesa, Russa e outras"
        ))));

        materiasHumanas.add(new Materia(" Movimentos Sociais", new ArrayList<String>(Arrays.asList(
                " Movimentos por direitos civis",
                " Movimentos operários",
                " Movimentos estudantis",
                " Movimentos sociais no Brasil"
        ))));

        // Ciências da Natureza ========================================================================

        ArrayList<Materia> materiasCienciasNatureza = new ArrayList<Materia>();

        materiasCienciasNatureza.add(new Materia(" Física", new ArrayList<String>(Arrays.asList(
                " Cinemática",
                " Dinâmica",
                " Trabalho e Energia",
                " Termodinâmica",
                " Óptica",
                " Eletricidade e Magnetismo"
        ))));

        materiasCienciasNatureza.add(new Materia(" Química", new ArrayList<String>(Arrays.asList(
                " Química Geral: Átomos, Moléculas e Reações",
                " Química Orgânica: Funções e Reações Orgânicas",
                " Química Inorgânica: Ligações e Propriedades",
                " Soluções e Equilíbrios Químicos",
                " Termoquímica",
                " Radioatividade"
        ))));

        materiasCienciasNatureza.add(new Materia(" Biologia", new ArrayList<String>(Arrays.asList(
                " Citologia e Histologia",
                " Genética",
                " Evolução",
                " Ecologia e Meio Ambiente",
                " Fisiologia Humana",
                " Botânica e Zoologia"
        ))));

        // Adicionando na Classe
        curso.add(new Curso(" Português", materiasPortugues));
        curso.add(new Curso(" Redação", materiasRedacao));
        curso.add(new Curso(" Matemática", materiasMatematica));
        curso.add(new Curso(" Humanas", materiasHumanas));


        System.out.println("Escolha sua opção: \n");
        int i = 1;
        for (Curso curso1 : curso) {
            System.out.println(i + curso1.getNome());
            // 1 Português
            // 2 Outro curso
            // 3 Outro curso
            i++;
        }
        int opcaoSelecionada = entrada.nextInt();
        Limpador.limpador();
        System.out.println("=======MATÉRIAS=======\n");
        int j = 1;
        for (Materia materia : curso.get(opcaoSelecionada - 1).getMaterias()) {
            System.out.println(j + materia.getNome());
            j++;
        }
    }
}