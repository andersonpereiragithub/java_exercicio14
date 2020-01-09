package exerc14;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {

        Gados[] gado = new Gados[3];

        abrirMenu(gado);
    }

    static void preencheCampoAbate(Gados[] gado) {
        for (int i = 0; i < gado.length; i++) {
            gado[i].setAbate(gado[i].getIdade(), gado[i].getLeite(), gado[i].getAlimento());
        }
        System.out.println("\nClassificação de ABATE concluída com sucesso!");
        System.out.println();

        abrirMenu(gado);
    }

    static void imprimeNumAbate(Gados[] gado) {
        int soma = 0;
        for (int i = 0; i < gado.length; i++) {
            if ("SIM".equals(gado[i].getAbate())) {
                soma++;
            }
        }
        System.out.println("\nTotal de gado para ABATE é: " + soma + " cabeça(s).");
        abrirMenu(gado);
    }

    static void imprimirQntdeLeite(Gados[] gado) {
        double soma = 0;

        for (int i = 0; i < gado.length; i++) {
            soma += gado[i].getLeite();
        }
        System.out.println("\nProdução total de Leite na Fazenda por semana foi de: " + soma + " Litros");

        abrirMenu(gado);
    }

    static void imprimirQntdeAlimento(Gados[] gado) {
        double soma = 0;

        for (int i = 0; i < gado.length; i++) {
            soma += gado[i].getAlimento();
        }
        System.out.println("\nConsumo total de Alimento na Fazenda por semana foi de: " + soma + " Kg.");

        abrirMenu(gado);
    }

    static void instanciaGado(Gados[] gado) {
        for (int i = 0; i < gado.length; i++) {
            System.out.println("\n" + (i + 1) + "o gado");
            gado[i] = obterNovoGado();
        }
        abrirMenu(gado);
    }

    static Gados obterNovoGado() {
        Scanner ler = new Scanner(System.in);
        int mesNascimento,
                anoNascimento;

        Gados gado = new Gados();

        System.out.print("Código: ");
        gado.setCodigo(Integer.parseInt(ler.nextLine()));

        System.out.print("Leite: ");
        gado.setLeite(Integer.parseInt(ler.nextLine()));

        System.out.print("Alimento: ");
        gado.setAlimento(Integer.parseInt(ler.nextLine()));

        System.out.print("Mês Nascimento: ");
        mesNascimento = Integer.parseInt(ler.nextLine());

        System.out.print("Ano Nascimento: ");
        anoNascimento = Integer.parseInt(ler.nextLine());

        gado.setIdade(mesNascimento, anoNascimento);

        return gado;
    }

    static void abrirMenu(Gados[] gado) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=========== MENU ===========");
        System.out.println("(a) - Cadastrar Gado");
        System.out.println("(b) - Preencher o campo Abate");
        System.out.println("(c) - Imprimir a quantidade total de LEITE produzida por semana na fazenda");
        System.out.println("(d) - Imprimir a quantidade total de ALIMENTO produzida por semana na fazenda");
        System.out.println("(e) - Imprimir a quantidade total de LEITE produzida por semana na fazenda, após o ABATE");
        System.out.println("(f) - Imprimir a quantidade total de ALIMENTO produzida por semana na fazenda, após o ABATE");
        System.out.println("(g) - Imprimir número de cabeças de gado que irão para o abate");
        System.out.println("(h) - Sair do Menu");
        System.out.println();

        System.out.print("Digite a opção desejada: ");
        String s = ler.nextLine();
        char ch = s.charAt(0);

        switch (ch) {
            case 'a':
                instanciaGado(gado);
                break;
            case 'A':
                instanciaGado(gado);
                break;

            case 'b':
                preencheCampoAbate(gado);
                break;
            case 'B':
                preencheCampoAbate(gado);
                break;

            case 'c':
                imprimirQntdeLeite(gado);
                break;
            case 'C':
                imprimirQntdeLeite(gado);
                break;

            case 'd':
                imprimirQntdeAlimento(gado);
                break;
            case 'D':
                imprimirQntdeAlimento(gado);
                break;

            case 'e':

                break;
            case 'E':

                break;

            case 'f':

                break;
            case 'F':

                break;

            case 'g':
                imprimeNumAbate(gado);
                break;
            case 'G':
                imprimeNumAbate(gado);
                break;

            case 'h':
                break;
            case 'H':
                break;
        }
    }
}
