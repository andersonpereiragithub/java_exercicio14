package exerc14;

import java.util.Scanner;

public class Exerc14 {
     public static void main(String[] args) {

        Gados[] gado = new Gados[3];

        abrirMenu(gado);
    }
    static void instanciaGado(Gados[] gado){
        for (int i = 0; i < gado.length; i++) {
            System.out.println(i + 1 +"o " + "gado");
            gado[i] = obterNovoGado();
        }
        abrirMenu(gado);
    }
    static Gados obterNovoGado(){
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
        System.out.println("(h) - Sair do Menu");
        System.out.println();

        System.out.print("Digite a opção desejada: ");
        String s = ler.nextLine();
        char ch = s.charAt(0);

        switch (ch) {
            case 'a':
                instanciaGado(gado);
                break;
        }

    }
}
