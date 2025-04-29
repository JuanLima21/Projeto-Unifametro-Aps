
import java.util.Scanner;


public class Aps {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Boas vindas ! ");
        System.out.println("O debate sobre igualdade de género é crucial para construir uma sociedade mais justa e equitativa, onde todos, independentemente do gênero, possam ter as mesmas oportunidades e direitos. A igualdade de género não é apenas um objetivo social, mas também um fator essencial para o desenvolvimento económico e social, promovendo a participação plena das mulheres em todos os níveis da sociedade. O debate sobre igualdade de género é crucial para construir uma sociedade mais justa e equitativa, onde todos, independentemente do gênero, possam ter as mesmas oportunidades e direitos. A igualdade de género não é apenas um objetivo social, mas também um fator essencial para o desenvolvimento económico e social, promovendo a participação plena das mulheres em todos os níveis da sociedade." );
       
      System.out.println( "Escolha a uma opção que deseje ler mais sobre : ");
      //ULTIMOS ACERTOS(MENSAGENS TROCADAS E COD CONFERIDO)

      // SWITCH TROCADO FRASES E ADICIONADO BREAK
        System.out.println("Escolha um Topico para ler mais");
        System.out.println*("1- Conceitos de Feminismo");
        System.out.println("2- Machismo estrutural");
        System.out.println("3- Patriarcado");
        int selecao = sc.nextInt();
       
      switch (selecao) {
                case 1 -> System.out.println("1- Conceito de Feminismo");
                break;
                case 2 -> System.out.println("2- Machismo estutural");
                break;
                case 3 -> System.out.println("3- Patriarcado");
                break;
                default -> System.out.println ("Opção inválida!, Tente novamente.")
                while (selecao != 3);
                }
             System.out.println("As consequências dos conceitos de feminismo, machismo estrutural e patriarcado se refletem em desigualdades profundas nas relações sociais, políticas e econômicas, perpetuando discriminação de gênero e limitando o potencial individual e coletivo.")
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
        //SWITCH TROCADO E REPARADO ERROS
        switch (opcao) {
            case 1 -> mostrarDisparidadeSalarial("Topico 1") 
            break;
            case 2 -> mostrarCargosLideranca("Topico 2");
            break;
            case 3 -> mostrarViolenciaDomestica("Topico 3");
            break; 
            case 4 -> mostrarAcessoEducacao("Topico 4");
            break;
            default -> System.out.println("Opção inválida!, Tente novamente");
            while (selecao != 4);
        }
        
        scanner.close();




 

    }
}
