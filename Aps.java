
import java.util.Scanner;


public class Aps {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Topico 1
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
        //Topico 4
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
     //Topico 5
    public static void exibirDados() {
        System.out.println("Dados Atualizados sobre Desigualdade de Gênero e Acesso à Educação no Brasil (2024):\n");

        // Disparidade Salarial
        System.out.println("1. Disparidade Salarial:");
        System.out.println("- Mulheres recebem, em média, 20,7% a menos que os homens no mesmo cargo.");
        System.out.println("Em cargos de direção e gerência, a diferença chega a 27%.");
        System.out.println("Mulheres negras ganham, em média, 68% do salário de homens não negros.");
        System.out.println("Apenas 32,6% das empresas possuem políticas de incentivo à contratação de mulheres.");

        // Cargos de Liderança
        System.out.println("2. Cargos de Liderança:");
        System.out.println("- Mulheres ocupam 38% dos cargos de liderança no Brasil.");
        System.out.println("Apenas 28% das mulheres estão em cargos de alta liderança (diretoria e C-Level).");
        System.out.println("Em cargos parlamentares, as mulheres representam 17,9% dos deputados federais.");
        System.out.println("Nos ministérios, apenas 9 dos 38 cargos com status ministerial são ocupados por mulheres.");


        // Violência Doméstica
        System.out.println("3. Violência Doméstica:");
        System.out.println("- 30% das brasileiras já sofreram algum tipo de violência doméstica ou familiar.");
        System.out.println("Nos estados do Rio de Janeiro, Rondônia e Amazonas, os índices chegam a 36%, 37% e 38%, respectivamente.");
        System.out.println("52% das vítimas afirmam que o agressor era marido ou companheiro.");
        System.out.println("27% das mulheres que sofreram violência solicitaram medida protetiva.");

        // Acesso à Educação
        System.out.println("4. Acesso à Educação:");
        System.out.println("- Mulheres representam 60,3% dos estudantes no último ano da faculdade. ");
        System.out.println("Elas concluem o ensino superior em maior proporção que os homens. ");
        System.out.println("No entanto, apenas 22% das mulheres concluem cursos na área de ciência e tecnologia.");
        System.out.println("Mulheres brancas têm taxa de conclusão de ensino superior de 29%, enquanto mulheres negras têm 14,7%.");
        System.out.println("O analfabetismo funcional atinge cerca de 27% da população brasileira.");
    }
}
        //Topico 6
        public static void combateAoMachismo(){
        System.out.println("Combater o machismo é um compromisso diário com a igualdade, o respeito e a dignidade de todas as pessoas. Significa escutar, aprender e reconhecer que atitudes naturalizadas muitas vezes sustentam desigualdades. É dar voz às mulheres, questionar piadas ofensivas, apoiar quem denuncia e ensinar às novas gerações que ninguém é inferior ou superior por causa do gênero. Uma sociedade justa começa quando todos e todas têm os mesmos direitos e oportunidades. O machismo mata — e o silêncio também. Vamos juntos mudar essa história.")
    }
        //Topico 7
        public static void mensagemFinal(){
            system.out.println("Muito obrigado sua presença e dedicação fazem toda a diferença. Aqui tivemos conscientização sobre a Luta das Mulheres na Sociedade")
        }
}
