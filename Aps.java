
import java.util.Scanner;


public class Aps {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Boas vindas ! ");
        System.out.println("Mensagem sobre igualdade de genero e importancia"); // TROCAR POR MENSAGEM CORRETA

      System.out.println( "Escolha a uma opção que deseje ler mais sobre : "); //FRASE FICTICIA (TROCAR)
      

      // DEFINIR ESTRUTURA DE REPETIÇÃO PARA SELEÇÃO NO MENU USANDO SWITCH
        System.out.println("opçoes para ler mais 1- mulheerr ;; 2 - homem "); //OPÇÕES FICTICIAS (TROCAR)
        int selecao = sc.nextInt();


      switch (selecao) {
                case 1 -> System.out.println("menu 1");
                case 2 -> System.out.println(" menu 2 ! ");
                case 3 -> System.out.println("Menu 3 ");
                default -> System.out.println ("Opção inválida!, Tente novamente")
            }
         // while (selecao != 3); (APARTIR DE 3 IRA GERAR O DEFAULT)
            //MOSTRAR DISPARIDADE SALARIAL
           public static void mostrarDisparidadeSalarial() {
        System.out.println("== Disparidade Salarial ==\n");
        System.out.println("De acordo com dados recentes, as mulheres ganham em média 20% menos que os homens para cargos semelhantes.");
        System.out.println("As mulheres negras enfrentam uma disparidade ainda maior, com uma diferença salarial de até 40%.");
        System.out.println("A disparidade salarial é observada em diversas indústrias e cargos.");
        System.out.println("------------------------------------------------------");
    }

    // MOSTRAR CARGOS DE LIDERAÇA 
    public static void mostrarCargosLideranca() {
        System.out.println("== Cargos de Liderança ==\n");
        System.out.println("Em 2023, apenas 29% dos cargos de liderança em grandes empresas eram ocupados por mulheres.");
        System.out.println("Menos de 5% das mulheres em cargos de liderança são negras ou pertencem a outras minorias.");
        System.out.println("O número de mulheres em cargos de CEO é de cerca de 7% no Brasil.");
        System.out.println("------------------------------------------------------");
    }

    // MOSTRAR VIOLENCIA DOMESTICA
    public static void mostrarViolenciaDomestica() {
        System.out.println("== Violência Doméstica ==\n");
        System.out.println("Em 2023, cerca de 1 em cada 4 mulheres sofreram algum tipo de violência doméstica no Brasil.");
        System.out.println("A violência doméstica pode ser física, psicológica, sexual ou econômica.");
        System.out.println("Estima-se que apenas 30% dos casos de violência doméstica sejam denunciados.");
        System.out.println("------------------------------------------------------");
    }

    // MOSTRAR ACESSO A EDUCAÇÃO
    public static void mostrarAcessoEducacao() {
        System.out.println("== Acesso à Educação ==\n");
        System.out.println("A taxa de alfabetização no Brasil é de 93%, mas ainda existem desigualdades regionais significativas.");
        System.out.println("A educação básica é universal, mas muitas crianças ainda não têm acesso a uma educação de qualidade.");
        System.out.println("Em áreas rurais e nas periferias das grandes cidades, o acesso a escolas é mais limitado.");
        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // MENU DE TOPICOS EM SWITCH
        System.out.println("Escolha um tópico para ver os dados:");
        System.out.println("1. Disparidade Salarial");
        System.out.println("2. Cargos de Liderança");
        System.out.println("3. Violência Doméstica");
        System.out.println("4. Acesso à Educação");
        System.out.print("Digite o número do tópico: ");
        
        int opcao = scanner.nextInt();
        
        // TOPICOS CITADOS NA "APS SUGESTÕES DE FUNCIONALIDADE"
        switch (opcao) {
            case 1 -> mostrarDisparidadeSalarial();
                      break;
            case 2 -> mostrarCargosLideranca();
                      break;
            case 3 -> mostrarViolenciaDomestica();
                      break;
            case 4 -> mostrarAcessoEducacao();
                break;
            default -> System.out.println("Opção inválida!, Tente novamente");
        }
        
        scanner.close();




 

    }
}
